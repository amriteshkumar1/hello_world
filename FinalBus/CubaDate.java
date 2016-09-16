import java.util.Calendar;
 import java.text.SimpleDateFormat;
 
public class CubaDate {
   public static void  main(String arg[]) {
   Calendar currentDate = Calendar.getInstance();
   SimpleDateFormat formatter= 
   new SimpleDateFormat("dd-MM-yyyy");
   String dateNow = formatter.format(currentDate.getTime());
   System.out.println("Now the date is :=>  " + dateNow);
   }
 }