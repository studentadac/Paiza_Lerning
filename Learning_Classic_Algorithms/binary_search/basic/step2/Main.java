//言語：Java
//問題URL：https://paiza.jp/works/mondai/binary_search/binary_search__basic_step2
//コメント：参考 https://qiita.com/sengoku/items/bbcacdbd082cffd5b886 https://jpliterature.hatenablog.com/entry/binary-search-lowerbound-upperbound
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       int n=sc.nextInt();
       Integer [] a=new Integer[n];
       
       for (int i=0;i<n ;i++ ) 
       a[i]=sc.nextInt();
       
       Arrays.sort(a);
       
       int q=sc.nextInt();
       for (int i=0;i<q ;i++ ) 
       {
           Integer k=sc.nextInt();
           
           Integer z=(Integer)n-(~Arrays.binarySearch(a, k, (x,y)->x.compareTo(y)>0?1:-1));
           System.out.println(z>=0&&z<=n?z:n  );
          // int a = ~Arrays.binarySearch(ar, 1, (x,y)->x.compareTo(y)>=0?1:-1);

       }
       
       }
    }

//
//```