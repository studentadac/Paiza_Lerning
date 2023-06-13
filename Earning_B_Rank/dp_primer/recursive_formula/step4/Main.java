//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_recursive_formula_step4
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

         var k = sc.nextInt();
         
         int[] a= new int[k];
         a[0]=1;
         a[1]=1;
    
         
         for (int i=2;i<k ;i++ )
         {
             a[i]=a[i-1]+a[i-2];
         }
         
         System.out.println(a[k-1]);
        

    }
}

/*整数 k が与えられます。
次のように定められた数列の k 項目の値を出力してください。
ちなみに、これはフィボナッチ数列と呼ばれる有名な数列です。

・ a_1 = 1 
・ a_2 = 1 
・ a_n = a_{n-2} + a_{n-1} (n ≧ 3)
*/
//```