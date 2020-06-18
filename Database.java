/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

    private Connection connect = null;
    private Statement statement = null;
    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";
    private static final String URL = "jdbc:derby:Bookings;create=true"; //EMBEDDED DATABASE "jdbc:derby:Bookings";

    public Database() {
        this.establishConnection();

    }

    public void createSchema() {
        try {

            statement = connect.createStatement();

            statement.execute("CREATE TABLE ROOM (Id INT NOT NULL GENERATED ALWAYS AS IDENTITY  PRIMARY KEY,NUMBER_OF_GUESTS VARCHAR(255),NUMBER_OF_SINGLEROOM VARCHAR(255),NUMBER_OF_DOUBLEROOM VARCHAR(255),NUMBER_OF_DELUXEROOM VARCHAR(255))");
        } catch (Exception e) {
            System.out.println("Room Schema already exists");
        }

        try {

            statement = connect.createStatement();
            statement.execute("CREATE TABLE DATES(Id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,CHECKIN_DATE DATE,CHECKOUT_DATE DATE)");

        } catch (Exception e) {
            System.out.println("Date Schema already exists");
        }

        try {

            statement = connect.createStatement();
            statement.execute("CREATE TABLE GUESTS (Id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,FIRST_NAME VARCHAR(255),LAST_NAME VARCHAR(255),PHONE_NUMBER VARCHAR(255))");

        } catch (Exception e) {
            System.out.println("Guest schema already exists");
        }

    }

    public Connection getConnection() {

        return this.connect;

    }

    public void establishConnection() {

        try {
            Object driver = Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            DriverManager.registerDriver((Driver) driver);

            connect = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            createSchema();

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

