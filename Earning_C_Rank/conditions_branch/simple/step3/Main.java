//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__simple_step3
//コード：
//```java
//整数 A, B, C が与えられます。式 A × B ≦ C が成立している場合はYESを、そうではない場合はNOを出力してください。


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      

        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        sc.close();
        if((a*b)<=c)
        System.out.println("YES");
        else
        System.out.println("NO");

       

    }
}
//```