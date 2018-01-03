import java.util.*;

public class HelloWorld{

     public static void main(String []args){
     
      
      int array[] = {1,2,11,3,4,11,4,11,5,11};
      
      System.out.println(func(array,0,0)/11);
     
     }
     
     public static int func(int[] array,int pos,int sum ){
         
   
        if(pos>array.length-1){
            return sum;
        }
        
        if(array[pos]==11){
            
             sum += array[pos];
        }
        
       
        
        return func(array,pos+1,sum);
         
     }
}