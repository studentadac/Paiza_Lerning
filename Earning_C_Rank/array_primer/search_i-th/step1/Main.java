//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__search_i-th_step1
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] line = "1 10 2 9 3 8 4 7 5 6".split(" ");
        for(int i=0;i<line.length;i++)
        {
            if(line[i].equals("8"))
            {
                System.out.println(i+1);
                return;
            }
        }
    }
}
//```