//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_007/forest_contest_007__block_filling
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        var m = sc.nextInt();
        int[][] a=new int[n][m];
      //  var map=new int[n][m];
        
        for (int i=0;i<n ;i++ ) 
        for (int j=0;j<m-1 ;j++ )
        {
            
            if(a[i][j]==0&&a[i][j+1]==0)
            {
                a[i][j]=1;
                a[i][j+1]=1;
                
            }
            else if(i+1<n)
            {
                
                if(a[i][j]==0&&a[i+1][j]==0)
                {
                a[i][j]=1;
                a[i+1][j]=1;
                    
                }
                else if(a[i][j+1]==0&&a[i+1][j+1]==0)
                {
                a[i][j+1]=1;
                a[i+1][j+1]=1;
                    
                }
                
            }
            
            
            
            
        }
        
        int ans=0;
        
             for (int i=0;i<n ;i++ ) 
        for (int j=0;j<m ;j++ )
        {
           ans+=a[i][j];
        }
        System.out.println(ans/2);
        
       
    }
}
//```