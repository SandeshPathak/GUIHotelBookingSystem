/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author sandeshpathak
 */

//This class is used to save the number of Guests and number of Bedrooms
//Single Bedroom can only have one guest and Double Bedroom can have 2 Guests and Deluxe Bedroom can have 3 guests

public class Bedroom {
    
    private int numberofGuests;
    private int numberofBedrooms;
    private int remainingBedrooms;
    private String choosenBedroom;
    
    private int singleroomPrice;
    private int doubleroomPrice;
    private int deluxeroomPrice;

    public int getSingleroomPrice() {
        this.singleroomPrice = 90 * this.getSingleCounter();  //  PRICE OF A SINGLE ROOM IS 90 DOLLAR
        return singleroomPrice;
    }

    public int getDoubleroomPrice() {
        this.doubleroomPrice = 180 * this.getDoubleCounter(); //  PRICE OF A DOUBLE ROOM IS 180 DOLLAR
        return doubleroomPrice;
    }

    public int getDeluxeroomPrice() {
        this.deluxeroomPrice = 360 * this.getDeluxeCounter();  // PRICE OF A DELUXE ROOM IS 360 DOLLAR
        return deluxeroomPrice;
    }

    public int getTotalPrice() {
        this.totalPrice = singleroomPrice + doubleroomPrice + deluxeroomPrice;
        return totalPrice;
    }
    
    private int totalPrice = singleroomPrice + doubleroomPrice + deluxeroomPrice;
    

    
    private int totalnumberofGuests;
    private int singleCounter;
    private int doubleCounter;
    private int deluxeCounter;
    public int submitCounter;
    
    
    private int selectedguestNumber;
    private int remainingGuests;

    public Bedroom(int numberofGuests, int numberofBedrooms, int remainingBedrooms, String choosenBedroom, int totalnumberofGuests, int selectedguestNumber, int remainingGuests) {
        this.numberofGuests = numberofGuests;
        this.numberofBedrooms = numberofBedrooms;
        this.remainingBedrooms = remainingBedrooms;
        this.choosenBedroom = choosenBedroom;
        this.totalnumberofGuests = totalnumberofGuests;
        this.selectedguestNumber = selectedguestNumber;
        this.remainingGuests = remainingGuests;
    }
    
    public Bedroom ()
    {
        this.singleCounter = 0;
        this.doubleCounter = 0;
        this.deluxeCounter = 0;
        this.submitCounter = 0;
        
        
    }
    

    public int getNumberofGuests() {
        return numberofGuests;
    }

    public void setNumberofGuests(int numberofGuests) {
        this.numberofGuests = numberofGuests;
    }

    public int getNumberofBedrooms() {
        return numberofBedrooms;
    }

    public void setNumberofBedrooms(int numberofBedrooms) {
        this.numberofBedrooms = numberofBedrooms;
    }

    public int getRemainingBedrooms() {
        return remainingBedrooms;
    }

    public void setRemainingBedrooms(int remainingBedrooms) {
        this.remainingBedrooms = remainingBedrooms;
    }

    public String getChoosenBedroom() {
        return choosenBedroom;
    }

    public void setChoosenBedroom(String choosenBedroom) {
        this.choosenBedroom = choosenBedroom;
    }

    public int getTotalnumberofGuests() {
        return totalnumberofGuests;
    }

    public void setTotalnumberofGuests(int totalnumberofGuests) {
        this.totalnumberofGuests = totalnumberofGuests;
    }

    public int getSingleCounter() {
        return singleCounter;
    }

    public void setSingleCounter(int singleCounter) {
        this.singleCounter = singleCounter;
    }

    public int getDoubleCounter() {
        return doubleCounter;
    }

    public void setDoubleCounter(int doubleCounter) {
        this.doubleCounter = doubleCounter;
    }

    public int getDeluxeCounter() {
        return deluxeCounter;
    }

    public void setDeluxeCounter(int deluxeCounter) {
        this.deluxeCounter = deluxeCounter;
    }

    public int getSubmitCounter() {
        return submitCounter;
    }

    public void setSubmitCounter(int submitCounter) {
        this.submitCounter = submitCounter;
    }

    public int getSelectedguestNumber() {
        return selectedguestNumber;
    }

    public void setSelectedguestNumber(int selectedguestNumber) {
        this.selectedguestNumber = selectedguestNumber;
    }

    public int getRemainingGuests() {
        return remainingGuests;
    }

    public void setRemainingGuests(int remainingGuests) {
        this.remainingGuests = remainingGuests;
    }

    
}
