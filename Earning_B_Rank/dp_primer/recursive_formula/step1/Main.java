//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_recursive_formula_step1
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
       
        long[] a=new long[1000];
        a[0]=x;
        
        for (int i=1;i<1000 ;i++ ) 
        {
            a[i]=a[i-1]+d;
        }
         int q=sc.nextInt();
        for (int i=0;i<q ;i++ ) 
        System.out.println(a[(sc.nextInt()-1)]);
        
        
//        a_1 = x
//・ a_n = a_{n-1} + d (n ≧ 2)
    }
}


//```