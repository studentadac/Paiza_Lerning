//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/advance_step11
//コメント：chatgpt3頼り
//コード：
//```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        BigDecimal number1 = new BigDecimal(sc.nextLine());
        BigDecimal number2 = new BigDecimal(sc.nextLine());
        sc.close();
        
        BigDecimal sum = number1.add(number2);
        System.out.println(sum);
        
       
    }
}
//```