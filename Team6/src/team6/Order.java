/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1895212
 */

public class Order {
  
   Date date = parseDate("2019-02-09");
   public String number;
       
    public Order(String number)
    {
       this.number = number;
    }
    
    public void setDate(Date d)
    {
           date = d; 
    }
           
    public void setNumber(String n)
    {
            number = n;
    }
    
    public String getNumber()
    {
            return number;
    }
    
    public Date getDate()
    {
            return date;
    }
    
    public void confirm()
    {
        System.out.println("Date is: "+date+"\nOrder number: "+number);
    }
    
    public void close()
    {
            System.exit(0);
    }

   public static Date parseDate(String date) {
     try {
         return new SimpleDateFormat("yyyy-MM-dd").parse(date);
     } catch (ParseException e) {
         return null;
     }
  }
}
