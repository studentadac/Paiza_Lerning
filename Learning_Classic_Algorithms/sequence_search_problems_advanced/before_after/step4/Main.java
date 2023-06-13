//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__before_after_step4
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
        int m=sc.nextInt();


        int[] a =new int[n];
        int[] b=new int[m];
        for (int i=0;i<n ;i++ )
            a[i]=sc.nextInt();
            
            
            for (int i=0;i<m ;i++ )
            b[i]=sc.nextInt();   
            
             int ans=-1;//デフォルト
        for (int i=0;i<n ;i++ )
         {
             boolean isSameSequence=true;//数列が等しいか
             for (int j=0; j<m;j++ )
             {
                 if(i+j >=n )//配列が範囲外ならfalsesしてbreak
                 {
                      isSameSequence=false;
                     break;
                 }
                 
                 if(a[i+j]!=b[j])//数列が等しくなければfalseしてbreak
                 {
                     isSameSequence=false;
                     break;
                 }
                 
                 
                 
             }
             if(isSameSequence)
             {
                 ans=i+1;
                 break;
             }
             
         }
            
            
    
        System.out.println(ans);
    }
}
//```