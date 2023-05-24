//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_step8
//コード：一つ以上のタイルが必要、つまり横、縦の幅が最小で２以上
//```java


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h=sc.nextInt(),w=sc.nextInt();
        sc.close();

        if(h%2==0&&w%2==0&&h!=0&&w!=0 )
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
//```