//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_simple_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        var a=new int[n];
     //   var set=new TreeSet<Integer>();
        for (int i=0;i<n ;i++ )
        a[i]=(sc.nextInt());
        
        Arrays.sort(a);
     //   System.out.println();
        System.out.println(a[n-k]);
        
        
        
    }
}
//```