package services;

import grpc.search.Search;
import grpc.search.searchGrpc;
import io.grpc.stub.StreamObserver;

import java.sql.*;

import static properties.Properties.*;

public class SearchService extends searchGrpc.searchImplBase {
    Connection connection;

    Timestamp checkIn,checkOut;
    @Override
    public void search(Search.SearchMessage request, StreamObserver<Search.APIResponse> responseObserver) throws SQLException {

        logger.info("search method called");
        //logger.info(request.getCapacity()+"");

        String city=request.getCity();
        double minPrice=request.getMinPrice();
        double maxPrice=request.getMaxPrice();
        int capacity=request.getCapacity();
        String roomType=request.getRoomType();
        String startDateTime=request.getStartDateTime();
        String endDateTime=request.getEndDateTime();

        logger.info("Request :\n"+ANSI_GREEN+request+ANSI_RESET);

        boolean searchFlag=false,dateFlag=false;

        // Checking if the passed string is a date or not
        if(!startDateTime.isEmpty() && ! endDateTime.isEmpty()) {
            try {
                checkIn= Timestamp.valueOf(startDateTime);
                checkOut= Timestamp.valueOf(endDateTime);
                dateFlag=true;
            } catch (Exception e) {
                logger.warning("Invalid date format");
                setSearchResponse(responseObserver,Search.APIResponse.newBuilder(),FAILED_RESPONSE_CODE,FAILED_RESPONSE_MESSAGE);
                responseObserver.onCompleted();
                return;
            }

        }

        // If maxPrice is not received, assigning to maximum value
        if(maxPrice==0)
            maxPrice=Integer.MAX_VALUE;

        Search.APIResponse.Builder searchResponse = null;

        if(capacity==0 && city.isEmpty() && roomType.isEmpty() ) {

            searchResponse = searchByPrice(minPrice,maxPrice,dateFlag);

            if (searchResponse != null)
                searchFlag=true;
        }
        // city
        else if(capacity==0 && !city.isEmpty() && roomType.isEmpty() ) {

             searchResponse = searchByCity(city,minPrice,maxPrice,dateFlag);

            if (searchResponse != null)
                searchFlag=true;
        }
        // city, capacity
        else if(!city.isEmpty() && capacity>0 && roomType.isEmpty()) {

            searchResponse = searchByCityAndCapacity(capacity,city,minPrice,maxPrice,dateFlag);

            if (searchResponse != null)
                searchFlag=true;
        }
        // city,roomType
        else if(!roomType.isEmpty() && !city.isEmpty() && capacity==0) {

            searchResponse  = searchByCityAndRoomType(roomType,city,minPrice,maxPrice,dateFlag);

            if (searchResponse != null)
                searchFlag=true;

        }
        // city,roomType,capacity
        else if(!city.isEmpty()) {

            searchResponse  = searchByCityAndCapacityAndRoomType(roomType,city,capacity,minPrice,maxPrice,dateFlag);

            if (searchResponse != null)
                searchFlag=true;
        }
        // capacity
        else if( capacity>0 && roomType.isEmpty()) {

            searchResponse = searchByCapacity(capacity,minPrice,maxPrice,dateFlag);

            if (searchResponse != null)
                searchFlag=true;
        }
        // capacity, roomType
        else if(capacity>0) {

            searchResponse = searchByCapacityAndRoomType(capacity,roomType,minPrice,maxPrice,dateFlag);

            if (searchResponse != null)
                searchFlag=true;
        }
        // roomType
        else if (!roomType.isEmpty()) {

            searchResponse  = searchByRoomType(roomType,minPrice,maxPrice,dateFlag);

            if (searchResponse != null)
                searchFlag=true;
        }

        if(!searchFlag) {
            logger.warning("No data received from database");
            setSearchResponse(responseObserver, Search.APIResponse.newBuilder(),FAILED_RESPONSE_CODE, FAILED_RESPONSE_MESSAGE);
        } else {
            logger.info("Data received from database");
            setSearchResponse(responseObserver,searchResponse,SUCCESSFUL_RESPONSE_CODE,SUCCESSFUL_RESPONSE_MESSAGE);
        }

        logger.info("Closing the request....\n#################################"+"\n");
        responseObserver.onCompleted();
    }

    private static void setSearchResponse(StreamObserver<Search.APIResponse> responseObserver, Search.APIResponse.Builder searchResponse, int responseCode, String responseMessage) {

        searchResponse.setResponseCode(responseCode);
        searchResponse.setResponseMessage(responseMessage);
        responseObserver.onNext(searchResponse.build());
        logger.info("Response has been sent ");
    }
    public Search.APIResponse.Builder searchByCity(String city,double minPrice,double maxPrice,boolean dateFlag) throws SQLException {

        connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);

        PreparedStatement preparedStatement;
        String query=QUERY+" and city=?";
        if(dateFlag) {
            query+=" and roomid not in("+DATE_QUERY+")";
            preparedStatement= connection.prepareStatement(query);
            preparedStatement.setDouble(1,minPrice);
            preparedStatement.setDouble(2,maxPrice);
            preparedStatement.setString(3,city);
            setTimeStamp(preparedStatement,4);
        } else {
            preparedStatement= connection.prepareStatement(query);
            preparedStatement.setDouble(1,minPrice);
            preparedStatement.setDouble(2,maxPrice);
            preparedStatement.setString(3,city);
        }
        logger.info("Query\n"+ANSI_CYAN+preparedStatement+ANSI_RESET);
        return searchRequest(preparedStatement);
    }
    private Search.APIResponse.Builder searchByCityAndCapacity(int capacity, String city,double minPrice,double maxPrice,boolean dateFlag) throws SQLException {

        connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);

        String query=QUERY+" and capacity>=? and city=?";
        PreparedStatement preparedStatement;
        if(dateFlag) {
            query+=" and roomid not in("+DATE_QUERY+")";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setInt(3, capacity);
            preparedStatement.setString(4, city);
            setTimeStamp(preparedStatement,5);
        } else {
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setInt(3, capacity);
            preparedStatement.setString(4, city);
        }
        logger.info("Query\n"+ANSI_CYAN+preparedStatement+ANSI_RESET);

        return searchRequest(preparedStatement);

    }
    private Search.APIResponse.Builder searchByCityAndRoomType(String roomType, String city, double minPrice, double maxPrice,boolean deleteFlag) throws SQLException {

        connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);

        String query=QUERY+" and room_type=? and city=?";
        PreparedStatement preparedStatement;
        if(deleteFlag) {
            query+=" and roomid not in("+DATE_QUERY+")";
            preparedStatement= connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setString(3, roomType);
            preparedStatement.setString(4, city);
            setTimeStamp(preparedStatement,5);
        } else {
            preparedStatement= connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setString(3, roomType);
            preparedStatement.setString(4, city);
        }

        logger.info("Query\n"+ANSI_CYAN+preparedStatement+ANSI_RESET);

        return searchRequest(preparedStatement);

    }
    private Search.APIResponse.Builder searchByCityAndCapacityAndRoomType(String roomType, String city,int capacity, double minPrice, double maxPrice, boolean deleteFlag) throws SQLException {

        connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);

        String query=QUERY+" and room_type=? and city=? and capacity>=?";
        PreparedStatement preparedStatement;
        if(deleteFlag) {
            query+=" and roomid not in("+DATE_QUERY+")";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setString(3, roomType);
            preparedStatement.setString(4, city);
            preparedStatement.setInt(5, capacity);
            setTimeStamp(preparedStatement,6);
        } else {
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setString(3, roomType);
            preparedStatement.setString(4, city);
            preparedStatement.setInt(5, capacity);
        }

        logger.info("Query :\n"+ANSI_CYAN+preparedStatement+ANSI_RESET);

        return searchRequest(preparedStatement);
    }
    public Search.APIResponse.Builder searchByCapacity(int capacity,double minPrice,double maxPrice, boolean deleteFlag) throws SQLException {

        connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);

        String query=QUERY+" and capacity>=?";
        PreparedStatement preparedStatement;
        if(deleteFlag){
            query+=" and roomid not in("+DATE_QUERY+")";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setInt(3, capacity);
            setTimeStamp(preparedStatement,4);
        } else {
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setInt(3, capacity);
        }

        logger.info("Query\n"+ANSI_CYAN+preparedStatement+ANSI_RESET);
        return searchRequest(preparedStatement);

    }
    private Search.APIResponse.Builder searchByCapacityAndRoomType(int capacity, String roomType, double minPrice, double maxPrice, boolean deleteFlag) throws SQLException {

        connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);

        String query=QUERY+" and room_type=? and capacity>=?";
        PreparedStatement preparedStatement;
        if(deleteFlag) {
            query+=" and roomid not in("+DATE_QUERY+")";
            preparedStatement =connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setString(3, roomType);
            preparedStatement.setInt(4, capacity);
            setTimeStamp(preparedStatement,5);
        } else{
            preparedStatement =connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setString(3, roomType);
            preparedStatement.setInt(4, capacity);
        }

        logger.info("Query\n"+ANSI_CYAN+preparedStatement+ANSI_RESET);

        return searchRequest(preparedStatement);
    }
    private Search.APIResponse.Builder searchByRoomType(String roomType, double minPrice, double maxPrice, boolean deleteFlag) throws SQLException {

        connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);

        String query=QUERY+" and room_type=?";
        PreparedStatement preparedStatement;
        if(deleteFlag) {
            query+=" and roomid not in("+DATE_QUERY+")";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setString(3, roomType);
            setTimeStamp(preparedStatement,4);
        } else {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            preparedStatement.setString(3, roomType);
        }
        logger.info("Query\n"+ANSI_CYAN+preparedStatement+ANSI_RESET);

        return searchRequest(preparedStatement);


    }
    private Search.APIResponse.Builder searchByPrice(double minPrice, double maxPrice, boolean dateFlag ) throws SQLException {

        connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);

        String query=QUERY;
        PreparedStatement preparedStatement;
        if(dateFlag) {
            query+=" and roomid not in("+DATE_QUERY+")";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            setTimeStamp(preparedStatement,3);
        } else {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
        }

        logger.info("Query\n"+ANSI_CYAN+preparedStatement+ANSI_RESET);

        return searchRequest(preparedStatement);
    }

    private void setTimeStamp(PreparedStatement preparedStatement, int i) throws SQLException {
        preparedStatement.setTimestamp(i++, checkIn);
        preparedStatement.setTimestamp(i++,checkIn);
        preparedStatement.setTimestamp(i++,checkOut);
        preparedStatement.setTimestamp(i++,checkOut);
        preparedStatement.setTimestamp(i++,checkIn);
        preparedStatement.setTimestamp(i,checkOut);
    }

    private static Search.APIResponse.Builder searchRequest(PreparedStatement preparedStatement) throws SQLException {


        Search.APIResponse.Builder searchByCityResponse=Search.APIResponse.newBuilder();

        ResultSet resultSet= preparedStatement.executeQuery();

        // If no rows returned
        if(!resultSet.isBeforeFirst())
            return null;

        while(resultSet.next()) {
            int roomId=resultSet.getInt(1);
            int capacity=resultSet.getInt(2);
            String city= resultSet.getString(3);
            String state=resultSet.getString(4);
            double price=resultSet.getDouble(5);
            String buildingNo=resultSet.getString(6);
            String roomName=resultSet.getString(7);
            String roomType=resultSet.getString(8);

            Search.SearchResults.Builder builder=Search.SearchResults.newBuilder();
            builder.setRoomId(roomId);
            builder.setCapacity(capacity);
            builder.setBuildingNo(buildingNo);
            builder.setCity(city);
            builder.setState(state);
            builder.setPrice(price);
            builder.setRoomName(roomName);
            builder.setRoomType(roomType);

            searchByCityResponse.addResponse(builder);
        }
        return searchByCityResponse;
    }

}
