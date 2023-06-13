//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_recursive_formula_boss
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

         var k = 40;
         
         int[] a= new int[k];
         a[0]=1;
         a[1]=1;
    
         
         for (int i=2;i<k ;i++ )
         {
             a[i]=a[i-1]+a[i-2];
         }
         
         int q=sc.nextInt();
         
         for (int i=0;i<q ;i++ ) 
         System.out.println(a[sc.nextInt()-1]);
        

    }
}

//```