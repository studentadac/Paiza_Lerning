//言語：Java
//問題URL：https://paiza.jp/works/mondai/etc/a_rank_calculation_step1
//コメント： 
//コード：
//```Java
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       String a,b;
       a=sc.next();
       b=sc.next();
       
       BigDecimal A = new BigDecimal(a);
       BigDecimal B = new BigDecimal(b);
       BigDecimal one = new BigDecimal("1");
       BigDecimal two = new BigDecimal("2");
       BigDecimal C =  ((A.add(B)).multiply ((B.subtract(A)).add(one))) .divide(two); 
       System.out.println(C);
       
   
    }
}
//```