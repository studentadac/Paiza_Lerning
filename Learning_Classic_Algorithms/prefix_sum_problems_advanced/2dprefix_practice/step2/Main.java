//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__2dprefix_practice_step2
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
        int p=sc.nextInt();
        var a=new int[n][n];
        
        for (int i=0;i<n ;i++ )
        for(int j=0;j<n;j++)
        a[i][j]=sc.nextInt();
        
        var s=new int[n+1][n+1];
        for (int i=0;i<n ;i++ )
        for(int j=0;j<n;j++)
        {
          
        s[i+1][j+1]=s[i][j+1]+s[i+1][j]-s[i][j]+a[i][j];
        
        }
        
        
     /*   
         for (int i=0;i<n+1 ;i++ )
        for(int j=0;j<n+1;j++)
        System.out.print(s[i][j]+( j<n?" ":"\n"    )  );
     */ 
        
        
      //  System.out.println();
        int max=0;
         for (int i=0;i<n+1 ;i++ )
        for(int j=0;j<n;j++)
        {
            for(int k=i+1;k<n+1;k++)
            for(int l=j+1;l<n+1;l++)
            if(  (l-j)*(k-i)<=p  )
            {
            //    System.out.println(i+" "+j+" "+l+" "+k);
                int num=s[k][l] +s[i][j]-s[i][l]-s[k][j]   ;
            //    System.out.println(num);
                
                
            max=Math.max(max,num       );
            }
        
        
        }
        System.out.println(max);
        
    }
}
