//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_006/forest_contest_006__d_median
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int [] a=new int[5];
        for (int i=0;i<5 ;i++ )
        a[i]=sc.nextInt();
        
        Arrays.sort(a);
        System.out.println(a[2]);
        
    }
}
```