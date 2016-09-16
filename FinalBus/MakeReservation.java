/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package minibusticketingsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author A45-i5
 */
public class MakeReservation {
    
    String name, from,seat; 
    String destination, departure_date, time; 
    Double price; 
	GetUserInput a = new GetUserInput();
    boolean flag = true; 
    public void CustomerInfo(String destination,String time, String departure_date,List currBooked,Double price)
    {
        Scanner booking = new Scanner(System.in);
                
        this.destination= destination; 
        this.time = time; 
        this.departure_date = departure_date;
        this.price = price; 
        
                //Name
                System.out.print("Name: ");
                name = booking.nextLine();
            
                //From
                System.out.print("From : ");
                from = booking.nextLine();
            do{
                //Seat Number
                System.out.print("Seat number: ");
                seat = booking.nextLine();   
                CheckSeat bb = new CheckSeat(); 
                flag = bb.recheckSeat(currBooked,seat);
                if (flag==false)
                {
                    System.out.println("you have chosen a booked[Not Available] seat,please re-insert");
                }
        }while(flag==false);
            
    }
    
    public void printFileDat() throws IOException
    {
         //Create file
		 
		 
             FileWriter fstream = new FileWriter("AllOutput/out.dat",true);
             BufferedWriter out = new BufferedWriter(fstream);
			 out.write(destination + "_" + time + "_" + seat+ "_" +departure_date);
             out.write(" ");
             out.write(destination);
             out.write(" ");
             out.write(departure_date);
             out.write(" ");
             out.write(time);
             out.write(" ");
             out.write(name);
             out.write(" ");
             out.write(seat);
	         out.write(" ");
			 out.write(a.showToday());
			 out.write(" ");
             //Close the output stream
             out.close();
              
    }
    
    public void printTicket() throws IOException
    {
		int i=1;
            String user_ticket_name = "UserTickets/";
            user_ticket_name = user_ticket_name.concat(name);
            user_ticket_name = user_ticket_name.concat("_");
            user_ticket_name = user_ticket_name.concat(seat);
            user_ticket_name = user_ticket_name.concat("_");
            user_ticket_name = user_ticket_name.concat(destination);
            user_ticket_name = user_ticket_name.concat("_");
            user_ticket_name = user_ticket_name.concat(departure_date);
            
            
            FileWriter fstream = new FileWriter(user_ticket_name);
             BufferedWriter out = new BufferedWriter(fstream);
           

	     out.write("\n\nTicket serial number: " + destination + "_" + time + "_" + seat+ "_" +departure_date);
                out.write("\nTrip to: " + destination);
               out.write("\nName: " + name);
                out.write("\nFrom: " + from);
                out.write("\nDeparture Date: " + departure_date);
                out.write("\nDeparture Time: " + time);
               out.write("\nTicket price: " + price);
                out.write("\nSeat number: " + seat);
				out.write("\nDate Printed : " + a.showToday());
				out.write(" ");
             //Close the output stream
             out.close(); 
    }
    
    public void printSeat() throws FileNotFoundException, IOException
    {
       // GetUserInput aa = new GetUserInput();
       // aa.
        String file_name="Seats/"; 
        file_name = file_name.concat(destination);
        file_name = file_name.concat("_");
        file_name = file_name.concat(departure_date);
        file_name = file_name.concat("_");
        file_name = file_name.concat(time);
        file_name = file_name.concat(".dat");
        System.out.print(file_name);        
        
       // Scanner s = new Scanner(new BufferedReader(new FileReader(file_name)));
       // FileWriter fstream = new FileWriter("out.dat");
        FileWriter fw = new FileWriter(file_name,true); //the true will append the new data
        //BufferedWriter bufferWritter = new BufferedWriter(fw);
    	fw.write(seat);
        fw.write(" ");
    	fw.close();
       // BufferedWriter out = new BufferedWriter(fw);
       // fw.write(seat);
           
                        
    }
    
    public void print_ticket_consol ()
    {
        //int i=1 ; 
         System.out.println("\n\nTicket serial number: " + destination + "_" + time + "_" + seat+ "_" +departure_date);
                System.out.println("Trip to: " + destination);
                System.out.println("Name: " + name);
                System.out.println("From: " + from);
                System.out.println("Departure Date: " + departure_date);
                System.out.println("Departure Time: " + time);
                System.out.println("Ticket price: " + price);
                System.out.println("Seat number: " + seat);
				System.out.println("Printed date : "+ a.showToday());
    }
    
}
