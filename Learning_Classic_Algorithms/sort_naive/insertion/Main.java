//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_naive/sort_naive__insertion
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int [] a=new int[n];
      for (int i=0;i<n ;i++ ) 
      {
          a[i]=sc.nextInt();
      }
      
      
         for (int i=1;i<n ;i++ ) 
      {
       int x=a[i];
       int j=i-1;
         
while(j>=0&&a[j]>x)
{
    
    a[j+1]=a[j];
    --j;
    
}
a[j+1]=x;

    for (int k=0;k<n ;k++ ) 
         {
             
             System.out.print(a[k]+( (k<n-1)?" ":"\n"  ));
         }
         
          
          
      }
      
      
      
    }
}



/*insertion_sort(A : 配列, n : Aの要素数)
    for i = 1 to n-1
        // A[i] を、整列済みの A[0] ~ A[i-1] の適切な位置に挿入する

        // 実装の都合上、A[i] の値が上書きされてしまうことがあるので、予め A[i] の値をコピーしておく        
        x <- A[i]

        // A[i] の適切な挿入位置を表す変数 j を用意
        j <- i-1

        // A[i] の適切な挿入位置が見つかるまで、A[i] より大きい要素を1つずつ後ろにずらしていく
        while j >= 0 AND A[j] > x
            A[j+1] = A[j]
            j--

        // A[i] を挿入
        A[j+1] <- x

        // A[0] ~ A[i] が整列済みになった*/



//```