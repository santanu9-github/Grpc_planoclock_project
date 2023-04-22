package properties;

import java.util.logging.Logger;

public class Properties {

    //public static final String URL="jdbc:postgresql://localhost:5432/search_service_db";
    //public static final String PASSWORD="Samsung@456#";
    //public static final String SCHEMA="public";
    public static final String URL="jdbc:postgresql://localhost:5432/postgres";
    public static final String SCHEMA="capstoneproject";
    public static final String PASSWORD="1304adeeb";
    public static final String USERNAME="postgres";
    public static final String SUCCESSFUL_RESPONSE_MESSAGE="Success";
    public static final int SUCCESSFUL_RESPONSE_CODE=1;
    public static final String FAILED_RESPONSE_MESSAGE="No results found";
    public static final int FAILED_RESPONSE_CODE=-1;
    public static final Logger logger=Logger.getLogger("");
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String QUERY="select roomid,capacity,city,state,price,building_no,room_name,room_type from "+SCHEMA+".meeting_rooms where availability=true and price>=? and price<=?";

    public static final String DATE_QUERY=
            "select room_id from "+SCHEMA+".booking_details where booking_status_id=1 and\n" +
            " (\n" +
            "\t(?>=checkindate and  ?<checkoutdate) or\n" +
            "\t(?>checkindate and ?<=checkoutdate)\n" +
            " ) or \n" +
            " (\n" +
            "\t(?<=checkindate and  ?>checkoutdate)\n" +
            " )\n";


}
