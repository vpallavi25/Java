
import java.util.Scanner;
public class TimeShell
{
   //declare all your constants
	static int n;
	static int h;
	static int m;
	static int s;
	static String f;
	static String l;

   public static void main(String[] args)
   {
	     Scanner kb = new Scanner(System.in);
       start(kb);            
   }
   /* call the method description
   prompt the user for the name and the number of the times that they want to use this program
   get the hours, minutes, seconds
   call the method hoursToSec
   call the method minToSec
   calculate the total seconds
   output the total seconds
   call the method minSec to calculate the minutes and sec
   call the method hourMinSec*/
   public static void start(Scanner kb)
   {
	   for(int z=0;z<85;z++)
	   {	   
		   System.out.print("%");
	   }
	   System.out.println();
	   System.out.println("This program converts hours,minutes,second to second and display in on the screen");
	   for(int z=0;z<85;z++)
	   {	   
		   System.out.print("%");
	   }
	   System.out.println(); 
	   System.out.print("How many times you want to use the app?");
        n=kb.nextInt();

        for(int i=0;i<n;i++)
        {
        
        System.out.print("What is your name?");
         f=kb.next();
         l=kb.next();
        System.out.println("Hi "+f+" "+l+" Lets Start!!\n\n");
        
        System.out.print("Enter number of hours:");
         h=kb.nextInt();
        System.out.print("Enter number of minutes:");
         m=kb.nextInt();
        System.out.print("Enter number of seconds:");
         s=kb.nextInt();
        System.out.println(h+"hours,"+m+"minutes,"+s+"seconds is:\n");
     
        description();
        System.out.println("\n\n");
     }
   }
   /*This method get the total number of the seconds and finds the number of the minutes and sec and outputs the result*/
   public static void minSec(int totalSeconds)
   {
	   m = (totalSeconds)/60;
       int seconds_output = (totalSeconds% 3600)%60;
       
       System.out.println( m + " minutes  " + seconds_output +" seconds");
       
   }
   /*This method get the total number of the seconds and calculates the number of hours, minutes and second, then outputs the result*/
   public static void hourMinSec(int totalSeconds)
   {
	   h = (totalSeconds/3600);
	   m = (totalSeconds%3600)/60;
       int seconds_output = (totalSeconds% 3600)%60;
       
       System.out.println( h  + " hours and " + m + " minutes and " + seconds_output +" seconds");
   } 
   /*calculates the number of the seconds in the given hours and returns the value*/  
   public static int hourToSec(int hours)
   {
	   int seconds = hours *3600;   
       return seconds;
	   //return 0;         
   }
   /*This method calculates the number of the seconds in the given number of minutes*/
   public static int minToSec(int min)
   {
	   int seconds = min*60;
	   return seconds;
	   //return 0;
   }
   /*outputs the description of the program*/
   public static void description()
   {
	   int totalSeconds = minToSec(m)+hourToSec(h)+s;    
	   System.out.println(totalSeconds+"seconds");
	   minSec(totalSeconds);
	   hourMinSec(totalSeconds);
   }
   
 }  
