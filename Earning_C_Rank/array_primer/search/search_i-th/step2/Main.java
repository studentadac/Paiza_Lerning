//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__search_i-th_step2
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] line = "1 5 9 7 3 2 4 8 6 10".split(" ");

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();

        for(int i=0;i<line.length;i++)
        {
            if(line[i].equals(n))
            {
                System.out.println(i+1);
                return;
            }
        }
    }
}
//```