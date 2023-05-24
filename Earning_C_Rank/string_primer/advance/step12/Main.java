//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/advance_step12
//コメント：
//コード：
//```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        BigDecimal number1 = new BigDecimal(sc.nextLine());//巨大な数を格納できる型
        BigDecimal number2 = new BigDecimal(sc.nextLine());
        sc.close();
        
        BigDecimal sum = number1.multiply(number2);//数.四則演算(英語)(数)
        System.out.println(sum);
        
       
    }
}
//```