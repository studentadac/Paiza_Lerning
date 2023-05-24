//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__mod_step3
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var line = sc.nextInt();
        
        int even=0;
        for(int i=0;i<line;i++)
        if(sc.nextInt()%(2)==0)
       even++;
       
       
       int odd=line-even;
       
       System.out.println(even+" "+odd);
       
    }
}
//```