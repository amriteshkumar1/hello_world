/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package minibusticketingsystem;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.regex.MatchResult;
import java.util.Date;

import java.text.ParseException;
/**
 *
 * @author A45-i5
 */
public class GetUserInput {
     Scanner booking = new Scanner(System.in);
     Double price;
     
     public String getDate()
    {
		 Date dateSelect = new Date();
		 Date dateSelect2 = null; 
		 DateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
		 
		 boolean tarikh = true;
		 String date;
		 do{
			 System.out.print("\nChoose date (dd-MM-yyyy): ");
			  date = booking.nextLine(); 
			 try{
			 dateSelect = df1.parse(date);
			 }
			 catch(ParseException e)
			 {
			 System.out.println("sadsdas");
			 }
			 Calendar cal2 = Calendar.getInstance(); 
			 cal2.setTime(dateSelect);
			 
			 Calendar cal = Calendar.getInstance();
			 cal.set(cal2.get(Calendar.YEAR),cal2.get(Calendar.MONTH),cal2.get(Calendar.DAY_OF_MONTH));
			// cal.set(cal2.get(C))
			  
			Calendar currentcal = Calendar.getInstance();
			currentcal.set(currentcal.get(Calendar.YEAR),
			currentcal.get(Calendar.MONTH), 
			currentcal.get(Calendar.DAY_OF_MONTH));
        
			 if(cal.before(currentcal))
               {
					System.out.println("Invalid date! Please re-enter. ");
					tarikh=false;
			   }
			   
			   if(cal.after(currentcal))
			   {
			  // System.out.println("date entered greater");
					
			   tarikh=true;
			   }
			   if(cal.equals(currentcal))
			   {
			   //System.out.println("date entered equal");
			   tarikh=true;
			   }
			   
			 
			
			  
		 }while(tarikh==false);
		 return date; 
    }
	public String showToday()
	{
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter= 
		new SimpleDateFormat("dd-MM-yyyy");
		String dateNow = formatter.format(currentDate.getTime());
		//System.out.println("Now the date is :=>  " + dateNow);
		return dateNow;
	}
     
     public String getDestination()
    {
        
         System.out.print("\n[1] Seremban \n[2] Melaka Sentral \n[3] Medan Gopeng Ipoh \n[4] Butterworth \n[5] Sungai Nibong \n\nChoose destination: ");
      
        String destination;
        
         //Scanner booking = new Scanner(System.in);
         int location = Integer.parseInt(booking.nextLine());

                switch (location)
                {
                    case 1: destination = "Seremban";
                           price = 8.0;
                            break;
                    
                    case 2: destination = "Melaka Sentral";
                            price = 13.0;
                            break;
                
                    case 3: destination = "Medan Gopeng Ipoh";
                           price = 12.0;
                            break;
                    
                    case 4: destination = "Butterworth";
                           price = 15.0;
                            break;
                    
                    case 5: destination = "Sungai Nibong";
                           price = 17.0;
                            break;
                    
                    default: destination = "Invalid input!";
                            break;
                }
        
        return destination;
    }
     
     public Double getPrice()
     {
         Double price = this.price;
         return price;
     }
         
     
        public String getTime()
            {
                 //Time
                System.out.print("\n[1] 8.00am \n[2] 11.00am \n[3] 2.00pm \n[4] 3.00pm \n[5] 6.00pm \n[6] 8.00pm \nChoose time: ");
                int time = Integer.parseInt(booking.nextLine());
            
                String theTime;
                switch (time)
                {
                    case 1: theTime = "8.00am";
                            break;
                    
                    case 2: theTime = "11.00am";
                            break;
                
                    case 3: theTime = "2.00pm";
                            break;
                    
                    case 4: theTime = "3.00pm";
                            break;
                    
                    case 5: theTime = "6.00pm";
                            break;
                    
                    case 6: theTime = "8.00pm";
                            break;
                    
                    default: theTime = "Time is not exist!";
                            break;
                }
            return theTime;
            }
      
    
    
}
