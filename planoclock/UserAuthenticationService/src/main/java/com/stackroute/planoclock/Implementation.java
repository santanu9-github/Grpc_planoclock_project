package com.stackroute.planoclock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Implementation {
    //function to check if user already exist in database
    public static boolean isUserExist (String username, String password){
        // creating database connection
        Connection connection = Con.createConn();
        //query to check if user exist in DB
        String query = "select * from capstoneproject.user_details where userName= ? and password= ?";
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            //if user is not present already then return false
            if (!rs.isBeforeFirst())
                return false;
            else
                return true;
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return false;
    }
    //checking username is already present in DB
    public static boolean isUsernameExist(String username){
        // creating database connection
        Connection connection = Con.createConn();
        //query to check username is already present in DB
        String query = "select * from capstoneproject.user_details where userName= ?";
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            //checking result set is empty or not
            if (!rs.isBeforeFirst())
                return false;
            else
                return true;
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return false;
    }
    //checking email exist in DB
    public static boolean isEmailExist (String email){
        // creating database connection
        Connection connection = Con.createConn();
        //query for getting data according to email
        String query = "select * from capstoneproject.user_details where email= ?";
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            //result set will be empty when no email exist
            if (!rs.isBeforeFirst())
                return false;
            else
                return true;
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return false;
    }
    //adding user details into DB
    public static void addDetails (String userType, String username, String email, String
            password, String mobileNo){
        // creating database connection
        Connection connection = Con.createConn();
        //query to add user detail into table
        String query = "insert into capstoneproject.user_details(userType,userName,email,password,mobileNo) values(?,?,?,?,?)";
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, userType);
            pstmt.setString(2, username);
            pstmt.setString(3, email);
            pstmt.setString(4, password);
            pstmt.setString(5, mobileNo);
            pstmt.executeUpdate();
            System.out.println("Registration completed");

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }
    //method for getting password
   public static String getPassword (String userType,String email,String username){
        // creating database connection
        Connection connection = Con.createConn();
        //query to retrieve password from DB
        String query = "select password from capstoneproject.user_details where email= ? and userName= ? and userType= ?";
        String pass = null;
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2,username);
            pstmt.setString(3,userType);
            ResultSet rs = pstmt.executeQuery();
            //sending password to client
            while (rs.next()) {
                pass = rs.getString(1);

            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return pass;
    }
    //resetting password
    public static void changePassword(String userName,String password){
        // creating database connection
        Connection connection = Con.createConn();
        //query to update password in DB
        String query = "update capstoneproject.user_details set password=?  where userName=? ";

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1,password);
            pstmt.setString(2,userName);
            pstmt.executeUpdate();
        } catch (SQLException e) {
           e.printStackTrace();
        }

    }

}
