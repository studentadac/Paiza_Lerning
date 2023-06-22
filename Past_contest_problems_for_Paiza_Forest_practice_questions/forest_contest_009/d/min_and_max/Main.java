//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_009/forest_contest_009__d_min_and_max
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var a=new int[3];
        for (int i=0;i<3 ;i++ )
        a[i]=sc.nextInt();
        
        Arrays.sort(a);
        System.out.println(a[0]+" "+a[2]);
    }
}
//```