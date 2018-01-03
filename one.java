import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int sum =0;
        
        char c[] = str.toCharArray();
        
        for(int i=0;i<c.length;i++){
            
            if((c[i]>48 && c[i]<=57)){
                
                sum += Integer.parseInt(""+c[i]);
            }
            
        }
        
        System.out.println(sum);
     }
}