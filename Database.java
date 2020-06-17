/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

    private Connection connect = null;
    private Statement statement = null;
    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";
    private static final String URL = "jdbc:derby://localhost:1527/Hotel"; //EMBEDDED DATABASE "jdbc:derby:Hotel";

    public Database() {
        this.establishConnection();

    }

    public Connection getConnection() {

        return this.connect;

    }

    public void establishConnection() {

        try {
           connect = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
           
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Database for the GUESTS Table
    public void insertGuest(Guest guest) {
        try {
            statement = connect.createStatement();
            statement.execute("insert into GUESTS (FIRST_NAME, LAST_NAME, PHONE_NUMBER) values ('" + guest.getFirstName() + "', '" + guest.getLastName() + "', '" + guest.getPhoneNumber() + "' )");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    //Database for ROOM Table
    public void insertRoom(Bedroom bedroom) {
        try {
            statement = connect.createStatement();
            statement.execute("insert into ROOM (NUMBER_OF_GUESTS, NUMBER_OF_SINGLEROOM, NUMBER_OF_DOUBLEROOM, NUMBER_OF_DELUXEROOM) values ('" + bedroom.getTotalnumberofGuests() + "', '" + bedroom.getSingleCounter() + "', '" + bedroom.getDoubleCounter() + "', '" + bedroom.getDeluxeCounter() + "' )");

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    //Database for DATES TABLE
    public void insertDate(BookingDate date) {
        try {
            statement = connect.createStatement();
            statement.execute("insert into DATES (CHECKIN_DATE, CHECKOUT_DATE) values ('" + date.getFormatted_checkin_date() + "', '" + date.getFormatted_checkout_date() + "' )");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


//'"+"',
