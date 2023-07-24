//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_simple_boss
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
        int l=sc.nextInt()-1;
        int r=sc.nextInt()-1;
        var a=new int[n];
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();

        }
        Arrays.sort(a,l,r);

        for (int i=0;i<n ;i++ )
            System.out.print(a[i]+( i<n-1?" ":"\n" ) );
     
    
    /*
        for (int i=0;i<l-1 ;i++ )
        {
            if(i!=0)
        System.out.print(" ");
        System.out.print(sc.nextInt());
        
        
        }
       
       var b=new int[r-l];
         for (int i=0;i<r-l ;i++ )
        {
           b[i]=sc.nextInt();
        
        }
        
        Arrays.sort(b);
         for (int i=0;i<r-l ;i++ )
        {
           // if(i!=0)
        System.out.print(" ");
        System.out.print(b[i]);
        
        
        }       
         for (int i=0;i<n-(l-1) ;i++ )
        {
        //    if(i!=0)
        System.out.print(" ");
        System.out.print(sc.nextInt());      
        }
       */
        //   System.out.println();
        //  System.out.println(a[n-k]);
    }
}
//```