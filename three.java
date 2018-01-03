import java.util.*;

public class HelloWorld{

     public static void main(String []args){
      
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int sum =0;
      
      
      HashSet<Integer> hash = new HashSet<>();
      
      hash.add(a);
      hash.add(b);
      hash.add(c);
      
      for(Integer x : hash){
          sum += x;
      }
      
      System.out.println(sum);
     }
}