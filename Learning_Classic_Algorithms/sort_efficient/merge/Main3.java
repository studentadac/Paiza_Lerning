//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_efficient/sort_efficient__merge
//コメント：写経
//コード：
//```Java
import java.util.*;
public class Main {
    static int cnt=0;
    /*
merge(A : 配列, left : 整数, mid : 整数, right : 整数)
    // 2つの部分データ列のサイズ
    nl <- mid-left
    nr <- right-mid

    // 部分データ列をコピー
    for i = 0 to nl-1
        L[i] <- A[left+i]
    for i = 0 to nr-1
        R[i] <- A[mid+i]
    
    // 番兵
    L[nl] <- INF
    R[nr] <- INF
    
    // 2つの部分データ列をマージして A[left] ~ A[right-1] に書き込む
    lindex <- 0
    rindex <- 0

    for i = left to right-1
        if L[lindex] < R[rindex] then
            A[i] <- L[lindex]
            lindex++
        else
            A[i] <- R[rindex]
            rindex++
            count++
*/
    
    static void merge(long[]a,int left,int mid,int right )
    
    {
        int nl=mid-left;
        int nr=right-mid;
        var L=new long[nl+1];
        var R=new long[nr+1];
        
        for (int i=0;i<nl ;i++ )
        {
            L[i]=a[left+i];
            
        }
        for (int i=0;i<nr ;i++ )
        {
            
            R[i]=a[mid+i];
        }
        L[nl] = 1_000_000_009;
        R[nr] = 1_000_000_009;
        int lindex=0,rindex=0;
        
        for(int i=left;i<right;i++)
        {
            if (L[lindex] < R[rindex] )
            {
            a[i] = L[lindex];
            lindex++;
            }
        else
        {
            a[i] = R[rindex];
            rindex++;
            cnt++;
        }

            
        }
        
        
    }
/*    merge_sort(A : 配列, left : 整数, right : 整数)
    if left+1 < right
        mid = (left + right) / 2
        merge_sort(A, left, mid)
        merge_sort(A, mid, right)
        merge(A, left, mid, right)

*/
   static void merge_sort(long[] a,int left,int right)
    {
        if(left+1<right)
        {
            int mid=(left+right)/2;
            merge_sort(a,left,mid);
            merge_sort(a,mid,right);
            merge(a,left,mid,right);
            
        }
        
        
    }
    
    
    /*
merge_sort(A : 配列, left : 整数, right : 整数)
    if left+1 < right
        mid = (left + right) / 2
        merge_sort(A, left, mid)
        merge_sort(A, mid, right)
        merge(A, left, mid, right)

*/
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        var a=new long[n];
        for (int i=0;i<n ;i++ ) 
        a[i]=sc.nextLong();
        
        //int mid=(0+n)/2;
        merge_sort(a,0,n);
        
        for (int i=0;i<n ;i++ ) 
        System.out.print(a[i] +(i<n-1?" ":"\n") );
        
        System.out.println(cnt);
        
    }
}

/*
// アルゴリズムが正しく実装されていることを確認するために導入するカウンタ変数、ソート処理には関係がないことに注意
count <- 0

/**
    部分データ列 A[left] ~ A[mid-1], A[mid] ~ A[right-1] はそれぞれ整列済み
    2つの部分データ列をマージし、A[left] ~ A[right-1] を整列済みにする
*/

/**
    A[left] ~ A[right-1] をマージソートする
    配列 A をマージソートするには merge_sort(A, 0, n) を呼び出す
*/

//```