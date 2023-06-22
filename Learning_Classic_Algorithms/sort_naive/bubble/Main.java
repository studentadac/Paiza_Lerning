//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_naive/sort_naive__bubble
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n ;i++ )
        {   a[i]=sc.nextInt();}
        
        
        for (int i=0;i<n-1 ;i++ )
        {
            for (int j=n-1;j>i;j-- )
            {
                if( a[j-1]>a[j] )
                {
                    int tmp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tmp;
                }
          /*  bubble_sort(A : 配列, n : Aの要素数)
    for i = 0 to n-2
        for j = n-1 down to i+1
            if a[j-1] > a[j] then
                swap(a[j-1], a[j])
            */
            }

            for (int k=0;k<n ;k++ )
            {
                System.out.print(a[k]);
                System.out.print(k<n-1?" ":"\n");
            }
        }
    }
}
/**/
//```