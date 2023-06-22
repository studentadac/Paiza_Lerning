//言語：Java
//問題URL：https://paiza.jp/works/mondai/binary_search/binary_search__basic_boss
//コメント：参考したサイトは前問と同じ
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
           Integer l=sc.nextInt();
           Integer r=sc.nextInt();
           Integer max=(Integer)(~Arrays.binarySearch(a, r, (x,y)->x.compareTo(y)>0?1:-1)); //最後に見つかる右端
           Integer min=(Integer)(~Arrays.binarySearch(a, l, (x,y)->x.compareTo(y)>=0?1:-1));//最初に見つかる左端
           System.out.println(max-min );  //maxからminまでの長さ
          // int a = ~Arrays.binarySearch(ar, 1, (x,y)->x.compareTo(y)>=0?1:-1);

       }
       
       }
    }
//```