//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/normal_step11
//コード：参考 https://maku77.github.io/java/numstr/is-lower-case.html
//```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        StringBuilder sb = new StringBuilder(S);
        String reversedS = sb.reverse().toString();
   
        if (S.equals(reversedS))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
//```