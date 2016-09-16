
package comparedate;

/**
 *
 * @author hitcci0107
 */
import java.util.*;
import java.text.*;

public class CompareDate 
{
    public static void main(String[] args) 
    {
        
        Calendar cal = Calendar.getInstance();
        Calendar currentcal = Calendar.getInstance();
        cal.set(2012, Calendar.APRIL, 20);
        
        currentcal.set(currentcal.get(Calendar.YEAR),
        currentcal.get(Calendar.MONTH), 
        currentcal.get(Calendar.DAY_OF_MONTH));
        
        if(cal.before(currentcal))
            System.out.print("Current date " + new SimpleDateFormat("dd/MM/yyyy").
            format(currentcal.getTime()) + "\nis greater than the given date " + new
            SimpleDateFormat("dd/MM/yyyy \n").format(cal.getTime()));
        else if(cal.after(currentcal))
            System.out.print("Current date" + new SimpleDateFormat("dd/MM/yyyy").
            format(currentcal.getTime()) + "\n is less than the given date " + new 
            SimpleDateFormat("dd/MM/yyyy \n").format(cal.getTime()));
        else
            System.out.println("Both date are equal.");
    }
}
