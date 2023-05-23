//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_ave_step3
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] a=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        sc.close();
        
        
        double avg=(double)sum/(double)n;
        
       // System.out.println("sum="+sum+"  +n="+n+"=avg"+avg   );
        
      
       
        
        for(int i=0;i<n;i++)
        {
             if((double)a[i]>=avg)
        System.out.println(a[i]);
        }
      
    }
}
//```