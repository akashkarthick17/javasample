import java.util.*;

public class HelloWorld{

     public static void main(String []args){
       
       Scanner sc = new Scanner(System.in);
       
       String day =sc.next();
       int cigars = sc.nextInt();
       
       ArrayList<String> days = new ArrayList<>();
       
       days.add("Monday");

       days.add("Tuesday");

       days.add("Wednesday");

       days.add("Thursday");
       days.add("Friday");
       days.add("Sunday");

     if(days.contains(day) && (cigars>=40 && cigars<=60)){
         
         System.out.println("Successful");
     }
     else if(!days.contains(day) && cigars>=40){
         System.out.println("Successful");
         
     }
     else{
                  System.out.println("Unsuccessful");

     }
       
     }
}