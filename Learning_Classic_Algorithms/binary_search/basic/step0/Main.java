//言語：Java
//問題URL：https://paiza.jp/works/mondai/binary_search/binary_search__basic_step0
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
       a[i]=sc.nextInt();
       
       int q=sc.nextInt();
       for (int i=0;i<q ;i++ ) 
       {
           int k=sc.nextInt();
           System.out.println(Arrays.binarySearch(a, k)>=0?"Yes":"No");
       }
       
       }
    }

//
//```