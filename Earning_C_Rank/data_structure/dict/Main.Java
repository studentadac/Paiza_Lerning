//言語：Java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step1
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        final int x=10;
        int a[]=new int [x];

        for (int i=0;i<x ;i++ )
            a[i]=0;
        
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        
        for (int i=0;i<n ;i++ )
            a[sc.nextInt()]++;

        sc.close();

        for (int i=0;i<x ;i++ )
        {
            System.out.print(a[i]);
            if(i!=x-1)
                System.out.print(" ");
            
            else
                System.out.println("");
        }
    }
}
//```