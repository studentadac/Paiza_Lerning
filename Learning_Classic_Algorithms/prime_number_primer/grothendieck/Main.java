//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__grothendieck
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      boolean prime=true;
       for (int i=2;i<=56 ;i++ ) 
       {
           if( 57%i==0 )
           {
               prime=false;
               break;
           }
       }
       
        System.out.println(prime?"YES":"NO");
    }
}
//```