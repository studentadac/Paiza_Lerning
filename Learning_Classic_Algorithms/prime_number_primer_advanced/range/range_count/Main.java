//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer_advanced/prime_number_primer_advanced__range_count
//コメント：
//コード：
//```Java


import java.util.*;
public class Main {
    public static void main(String[] args) {
        final int n=1001;
        var a=new int[n];
        Arrays.fill(a,1);
        a[0]=0;
        a[1]=0;
        for (int i=2;i<n ;i++ )
        {
            if (a[i]==1) {
            for (int j = i * 2; j <= 1000; j += i) {
                a[j] = 0;
            }
        }
        }
        
        
        
        var s=new int[n+1];
        s[0]=0;
         for (int i=0;i<n ;i++ )
        {
           s[i+1]=s[i]+a[i];
      //    System.out.println(s[i+1]+" "+i);
        }
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        
        int ans=s[B+1]-s[A];
        System.out.println(ans);
      
    }
}


//```