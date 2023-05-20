//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__search_i-th_step3
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        final String n = sc.next();
        int m=sc.nextInt();
        sc.nextLine();//入力を改行
        final String[] line = sc.nextLine().split(" ");
        sc.close();
        
        for(int i=0;i<m;i++)
        {
            if(line[i].equals(n))
            {
                System.out.println(i+1);
                return;//同じ数を見つけたらプログラムを終了
            }
        }
    }
}
//```