/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package minibusticketingsystem;

import java.util.Scanner;

/**
 *
 * @author A45-i5
 */
public class Destination {
    
     public void showDestinationScreen()
    {
         System.out.print("\n[1] Seremban \n[2] Melaka Sentral \n[3] Medan Gopeng Ipoh \n[4] Butterworth \n[5] Sungai Nibong \n\nChoose destination: ");
           
    }
     
    public String getDestination()
    {
        String destination;
        
         Scanner booking = new Scanner(System.in);
         int location = Integer.parseInt(booking.nextLine());

                switch (location)
                {
                    case 1: destination = "Seremban";
                           // price = 8.0;
                            break;
                    
                    case 2: destination = "Melaka Sentral";
                           // price = 13.0;
                            break;
                
                    case 3: destination = "Medan Gopeng Ipoh";
                           // price = 12.0;
                            break;
                    
                    case 4: destination = "Butterworth";
                           // price = 15.0;
                            break;
                    
                    case 5: destination = "Sungai Nibong";
                           // price = 17.0;
                            break;
                    
                    default: destination = "Invalid input!";
                            break;
                }
        
        return destination;
    }
    
}
