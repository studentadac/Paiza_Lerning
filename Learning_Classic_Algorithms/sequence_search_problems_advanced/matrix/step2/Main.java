//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__matrix_step2
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
    //    String k=sc.next();
        sc.nextLine();

        String[][] a=new String[n][m];
        int ans=0;
        for (int i=0;i<n ;i++ )
        {
        a[i]=sc.nextLine().split(" ");
       
        
        }
        
            for (int i=0;i<n-1 ;i++ )
        {
        
        for (int j=0;j<m-1 ;j++ ) 
        if(a[i][j].equals(a[i+1][j])&&a[i][j].equals(a[i+1][j+1])&&a[i][j].equals(a[i][j+1]))
        ans++;
        
        }
        
        
        
        System.out.println(ans);
        
    }
}
//```