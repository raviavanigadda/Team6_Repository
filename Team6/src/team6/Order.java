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
    
       
    public void confirm()
    {
    
    }
    
    public void close()
    {
            System.exit(0);
    }

   
}
