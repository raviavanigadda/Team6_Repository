/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team6;

import java.util.*;

/**
 *
 * @author 1895126
 */
public class NormalOrder extends Order{
    
    public Date date;
    public String number;
    public NormalOrder(Date date, String number) {
        
        super(date, number);
    }
    
    public void dispatch(){
        
    }
    public void receive(){
        
    }
}
