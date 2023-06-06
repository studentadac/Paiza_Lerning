//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_recursive_formula_step0
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();
        int d=sc.nextInt();
        int k=sc.nextInt();

        int [] a=new int[k];
        a[0]=x;

        for (int i=0;i<k-1 ;i++ )
            a[i+1]=a[i]+d;

        System.out.println(a[k-1]);
//  ・ a_1 = x
//・ a_n = a_{n-1} + d (n ≧ 2)

    }
}
//```