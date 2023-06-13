//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_recursive_formula_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
         var x = sc.nextInt();
         var d1 = sc.nextInt();
         var d2 = sc.nextInt();
         var k = sc.nextInt();
         
         int[] a= new int[k];
         a[0]=x;
         boolean ticktack=true;//trueならiが奇数,falseなら偶数
         
         for (int i=1;i<k ;i++ )
         {
             a[i]=a[i-1];
             
             a[i]+= ticktack?d2:d1;
             ticktack=!ticktack;//偶奇の切り替え
         }
         
        System.out.println(a[k-1]);
        
    }
}

/*整数 x, d_1, d_2, k が与えられます。
次のように定められた数列の k 項目の値を出力してください。
０から始めるので条件式を変更している
a_1 = x 
 a_n = a_{n-1} + d_1 (n が偶数のとき、n ≧ 2



a_n = a_{n-1} + d_2 (n が奇数のとき)
*/
//```