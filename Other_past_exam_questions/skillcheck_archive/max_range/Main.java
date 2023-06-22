//言語：Java
//問題URL：https://paiza.jp/works/mondai/skillcheck_archive/max_range
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        var s=new int[n+1];
        
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
            s[i+1]=a[i]+s[i];
        }
        
        int max=0;
            for (int i=0;i<n-k+1 ;i++ )
        {
            int sum=s[i+k]-s[i];
            if( sum>max         )
            {
                
                max=sum;
            }
            
        }
        
        int days=0,first=0;
        
               for (int i=0;i<n-k+1 ;i++ )
        {
            int sum=s[n-i]-s[n-i-k];
            if( sum==max         )
            {
                days++;
                
                first=n-i-k+1;
                
            }
            
        }
        
        
        
        System.out.println(days+" "+first);
        
       
    }
}
//```