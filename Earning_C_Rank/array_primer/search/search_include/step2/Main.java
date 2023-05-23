//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__search_include_step2
//コメント：
//コード：
//```java


import java.util.*;
public class Main {
    public static void main(String[] args) {
        String s[]="5 12 6 84 14 25 44 3 7 20".split(" ");
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();
        for(String num:s)
        {
            if(num.equals(n))
            {
                System.out.println("Yes");
                return;
            }

        }
        System.out.println("No");
    }
}
//```