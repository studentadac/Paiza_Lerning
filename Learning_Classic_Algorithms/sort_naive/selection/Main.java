//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_naive/sort_naive__selection
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
        int[] a=new int[n];
        
        for (int i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        
        for (int i=0;i<n-1 ;i++ )
        {
            int min_index=i;
            for (int j=i+1;j<n ;j++ )
            {
                if(a[j]<a[min_index])
                min_index=j;
                
            }
           int tmp=a[i];
           a[i]=a[min_index];
           a[min_index]=tmp;
            
            
              for (int k=0;k<n ;k++ )
            {
                System.out.print(a[k]);
                System.out.print(k<n-1?" ":"\n");
                
            }
            
            
            
        }
    }
}

/*selection_sort(A : 配列, n : Aの要素数)
    for i = 0 to n-2
        // A[i] ~ A[n-1] の最小値を見つけ、A[i]と交換する
        // つまり、整列済みとなっている A[0] ~ A[i-1] の末尾に、A[i] ~ A[n-1] の最小値を付け加える
        
        // A[i] ~ A[n-1] の最小値の位置を保存する変数 min_index を用意
        // 暫定的に A[i] を最小値とする
        min_index <- i

        // 最小値を探す
        for j = i+1 to n-1
            if A[j] < A[min_index] then
                min_index = j

        // A[i] と A[min_index]を交換
        swap(A[i], A[min_index])

        // A[0] ~ A[i] が整列済みになった*/
//```