//言語：Java
//問題URL：  https://paiza.jp/works/mondai/hash_advanced/hash_advanced__two_dimention
//コメント：最後尾だから置き換えていいって雑な解法だと思ってたら、模範解答とほぼ同じだった
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        
        
        
        var data=new int [2][n];
        for (int i=0;i<2 ;i++ ) 
        for (int j=0;j<n ;j++ )
        data[i][j]=sc.nextInt();
        
        
        var x=new int[a][b];
        var y=new int[a][b];
        
        for (int i=0;i<n ;i++ )
        {
           var w=data[0][i];
           var h=data[1][i];
           
           int xL=w%a;
           int yL=h%b;
           x[xL][yL]=w;
           y[xL][yL]=h;
        }
        
        
        
        for (int i=0;i<m ;i++ )
        
        {
           var w=sc.nextInt();
           var h=sc.nextInt();
           
           if(x[w][h]!=0)
           System.out.println(x[w][h]+" "+y[w][h]  );
           else
           System.out.println(-1);
            
        }
        
        
        
        
        
    }
}

//```