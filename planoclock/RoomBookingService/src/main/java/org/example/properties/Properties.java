package org.example.properties;

import java.util.logging.Logger;

public class Properties {

//    public static final String URL="jdbc:postgresql://localhost:5432/planoclock";

    public static final String URL="jdbc:postgresql://localhost:5432/postgres";
    public static final String USERNAME="postgres";
//    public static final String PASSWORD="Muskan@123";

    public static final String PASSWORD="1304adeeb";
    public static final Logger logger=Logger.getLogger("");

    public static final String QUERY="select roomid, room_name, room_category, size, capacity, building_no, city, state, price from capstoneproject.meeting_rooms where availability=true ";
    public static final String FETCH_USER_ID_BY_EMAIL_QUERY= "select user_id from capstoneproject.user_details where email = ?";

    public static final String FETCH_ROOM_ID_BY_NAME_QUERY= "select roomid from capstoneproject.meeting_rooms where room_name = ?";

    public static final String INSERT_BOOKING_QUERY = "insert into capstoneproject.booking_details (room_id, user_id, description, checkInDate, checkOutDate, booking_status_id ) values (?, ?, ?, ?, ?, ?);";

    public static final String CHECK_EXISTING_BOOKING = "select room_id from capstoneproject.booking_details where booking_status_id=1 and room_id=? and ((?>=checkindate and  ?<checkoutdate) or (?>checkindate and ?<=checkoutdate)) or ((?<=checkindate and  ?>checkoutdate))";

    public static final String FETCH_BOOKING_DETAILS = "select u.first_name, u.last_name, u.email, r.room_name, b.checkindate, b.checkoutdate, b.booking_status_id from capstoneproject.booking_details b inner join capstoneproject.user_details u on b.user_id = u.user_id inner join capstoneproject.meeting_rooms r on b.room_id = r.roomid where b.booking_id = ?;";

    public static final String UPDATE_BOOKING_STATUS = "update capstoneproject.booking_details set booking_status_id = 2 where booking_id = ?;";

    public static final String GET_ALL_ROOMS_BY_USERID_QUERY = "select b.booking_id, b.room_id, r.room_name, r.room_category, r.size, r.capacity, r.building_no, r.city, r.state, r.price, b.description, b.checkindate, b.checkoutdate from capstoneproject.booking_details b inner join capstoneproject.user_details u on b.user_id = u.user_id inner join capstoneproject.meeting_rooms r on b.room_id = r.roomid where b.user_id = ?;";

    public static final String GET_USER_DETAILS_BY_USERID_QUERY = "select u.first_name, u.last_name, u.email, b.booking_id, b.room_id, r.room_name, r.room_category, r.size, r.capacity, r.building_no, r.city, r.state, r.price, b.description, b.checkindate, b.checkoutdate from capstoneproject.booking_details b inner join capstoneproject.user_details u on b.user_id = u.user_id inner join capstoneproject.meeting_rooms r on b.room_id = r.roomid where b.user_id = ?;";

    public static final String FETCH_BOOKING_STATUS_QUERY = "select booking_status_id from capstoneproject.booking_details where booking_id = ? and room_id = ? and user_id = ?;";

    public static final String RESCHEDULE_BOOKING_QUERY = "update capstoneproject.booking_details set checkindate = ?, checkoutdate = ?, booking_status_id=1 Where booking_id = ?;";
}
