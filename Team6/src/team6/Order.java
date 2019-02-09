/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team6;

import java.util.Date;

/**
 *
 * @author 1895212
 */

public class Order {
    public Date date;
    public String number;
    
    public Order(Date date, String number)
    {
        this.date = date;
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
    
    }
    
    public void close()
    {
            System.exit(0);
    }

   
}
