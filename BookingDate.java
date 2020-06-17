/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.time.LocalDate;

/**
 *
 * @author sandeshpathak
 */
//This class is used to save the booking dates user has entered

public class BookingDate {
    
    private LocalDate formatted_checkin_date;
    private LocalDate formatted_checkout_date;
    private String checkin;
    private String checkout;

    public BookingDate(LocalDate formatted_checkin_date, LocalDate formatted_checkout_date, String checkin, String checkout) {
        this.formatted_checkin_date = formatted_checkin_date;
        this.formatted_checkout_date = formatted_checkout_date;
        this.checkin = checkin;
        this.checkout = checkout;
    }
    
    public BookingDate()
    {
        
        
    }

    public LocalDate getFormatted_checkin_date() {
        return formatted_checkin_date;
    }

    public void setFormatted_checkin_date(LocalDate formatted_checkin_date) {
        this.formatted_checkin_date = formatted_checkin_date;
    }

    public LocalDate getFormatted_checkout_date() {
        return formatted_checkout_date;
    }

    public void setFormatted_checkout_date(LocalDate formatted_checkout_date) {
        this.formatted_checkout_date = formatted_checkout_date;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

}
