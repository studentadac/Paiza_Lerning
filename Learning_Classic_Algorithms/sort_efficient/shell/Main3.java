//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_efficient/sort_efficient__shell
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    static void insertionSort(int[] a,int h)
    {
        
        int n=a.length;
        int num_of_move=0;
        for (int i=h;i<n ;i++ ) 
        {
            int x=a[i];
            int j=i-h;
            while(j>=0&&a[j]>x)
            {
                a[j+h]=a[j];
                j-=h;
                num_of_move++;
            }
            
            a[j+h]=x;
        }
        System.out.println(num_of_move);

    }
    static void shell_sort(int[] a,int h)
    {
        for (int i=0;i<h;i++)
        insertionSort(a,h);
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        var a=new int[n];
        
        for (int i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        
        int k=sc.nextInt();
        for (int i=0;i<k ;i++ )
        {
            insertionSort(a,sc.nextInt());
            
        }
        
        
    }
}
/*
insertion_sort(A : 配列, n : Aの要素数, h : 間隔)
    // アルゴリズムが正しく実装されていることを確認するために導入するカウンタ変数、ソート処理には関係がないことに注意
    num_of_move <- 0

    for i = h to n-1
        // A[i] を、整列済みの A[i-ah], ..., A[i-2h], A[i-h] の適切な位置に挿入する

        // 実装の都合上、A[i] の値が上書きされてしまうことがあるので、予め A[i] の値をコピーしておく 
        x <- A[i]

        // A[i] の適切な挿入位置を表す変数 j を用意
        j <- i-h

        // A[i] の適切な挿入位置が見つかるまで、A[i] より大きい要素を後ろにずらしていく
        while j >= 0 AND A[j] > x
            A[j+h] = A[j]
            j -= h
            num_of_move++
        
        // A[i] を挿入
        A[j+h] <- x

shell_sort(A : 配列, n : Aの要素数, H : 間隔列)
    for h in H
        insertion_sort(A, n, h)
*/
//```