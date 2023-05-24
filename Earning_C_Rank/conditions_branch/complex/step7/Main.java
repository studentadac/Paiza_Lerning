//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_step7
//コード：誤差を避けるため整数にしました
//```java

//直線上の道があり、最初は X = 0 の地点にいます。この道はX = T + 0.1 の地点で崖になっています。また、 1 歩でX軸方向にK進むことができます。崖に落ちずにN歩進むことはできるでしょうか。

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt(),k=sc.nextInt()*10,t=sc.nextInt()*10+1;
        sc.close();

        if( n*k<=t)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
//```