/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package minibusticketingsystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author A45-i5
 */
public class CheckSeat {
    
    String destination;
    String departure_date;
    String time; 
    List currBooked = new ArrayList(); 
    Double price; 
 
   public void getInfo()
    {
        
       GetUserInput user1 = new GetUserInput(); 
      
       destination=user1.getDestination();
       departure_date = user1.getDate();
       time = user1.getTime(); 
       price = user1.getPrice();
    }
   
   public List getCurrBooked()
   {
       List currBooked2 = currBooked; 
       return currBooked2; 
   }
   
   public String getDesti()
   { String desti = destination; 
       return desti;
   }
   
   public String getDepartureDate()
   {
       String departDate = departure_date; 
       return departDate;
   }
   
   public String getDepartureTime()
   {
       String departTime = time;
       return departTime;
   }
   
    public Double getSeatPrice()
   {
       Double seat_price= price;
       return seat_price;
   }
    
    public String getFileName()
    {
        String file_name="Seats/"; 
        file_name = file_name.concat(destination);
        file_name = file_name.concat("_");
        file_name = file_name.concat(departure_date);
        file_name = file_name.concat("_");
        file_name = file_name.concat(time);
        file_name = file_name.concat(".dat");
        
        return file_name; 
    }
    
    public boolean recheckSeat(List currBooked, String chosen_seat) 
    { 
        boolean flag=true;
        for(int i=0; i<currBooked.size();i++)
        {
            if(chosen_seat.equals(currBooked.get(i)))
            {
                System.out.print("Booked Seat! cannot reserve");
                flag=false; 
               
            }
        }
         
        return flag;  
    }
    
    public void available_seat(Scanner s)
    {
        
        
         List<String> booked_seat = new ArrayList();
            
            //String array to hold all seats value;
            String  seats[][];
            seats = new String[][]
                 {
                    {"1" ,"5","9","13","17","21","25","29","33","37"},
                    {"2","6","10","14","18","22","26","30","34","38"},
                    {"","","","","","","","","","39"},
                    {"3","7","11","15","19","23","27","31","35","40"},
                    {"4","8","12","16","20","24","28","32","36","41"}
                 }; 
            
            
             //store line from .dat
             String data = s.nextLine(); 
             //usedelimeter using space
             Scanner scan_seat = new Scanner(data).useDelimiter("\\s");
             while(scan_seat.hasNext())
             {    
                 //add to list
                 booked_seat.add(scan_seat.next()); 
             }
              
             for(int i = 0; i<booked_seat.size();i++) 
                    
             {
                  for(int k=0; k<5;k++)
                  {
                      for(int z=0; z<10; z++)
                      {
                            if(seats[k][z].equals(booked_seat.get(i)))
                            { 
                                currBooked.add(seats[k][z]);
                                seats[k][z]="booked";
                                
                            }   
                      }
                  }
                    
              }
         
     
         
        
         //print values in structured way    
           //  System.out.println("-------------------------------------------------------------------------------");
       for(int row=0;row<5;row++)
       
       {
           System.out.println("-------------------------------------------------------------------------------");
      
            
            for(int col=0;col<10;col++)
            {  
                String output = String.format("%" + 6 + "s", seats[row][col]); 
              //   System.out.print(" "+seat_demo[row][col]);
                System.out.print(output);
                System.out.print(" |");
                
            }
            
            System.out.println();
            
        }
         System.out.println("-------------------------------------------------------------------------------");
      
    }
    
    public void all_seats_available()
            {
               
                    String  seats[][];
            seats = new String[][]
                 {
                    {"1" ,"5","9","13","17","21","25","29","33","37"},
                    {"2","6","10","14","18","22","26","30","34","38"},
                    {"","","","","","","","","","39"},
                    {"3","7","11","15","19","23","27","31","35","40"},
                    {"4","8","12","16","20","24","28","32","36","41"}
                 };
               //print values in structured way    
           //  System.out.println("-------------------------------------------------------------------------------");
       for(int row=0;row<5;row++)
       
       {
           System.out.println("-------------------------------------------------------------------------------");
      
            
            for(int col=0;col<10;col++)
            {  
                String output = String.format("%" + 6 + "s", seats[row][col]); 
              //   System.out.print(" "+seat_demo[row][col]);
                System.out.print(output);
                System.out.print(" |");
                
            }
            
            System.out.println();
            
        }
         System.out.println("-------------------------------------------------------------------------------");
      
    }
    
   
    
    
    
    
}
