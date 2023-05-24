//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/normal_step2
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        StringBuilder sb = new StringBuilder();
       String S=sc.next();
       String T=sc.next();
       int n=sc.nextInt();
            sb.append(S);
            sb.insert(n,T);
            
        System.out.println(sb);
    }
}
//```