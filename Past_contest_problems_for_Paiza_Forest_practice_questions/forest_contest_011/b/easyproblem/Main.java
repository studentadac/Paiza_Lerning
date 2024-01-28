//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_011/forest_contest_011__b_easyproblem
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
        
        var a=new boolean[n];
        Arrays.fill(a,true);
        
        
        for (int i=0;i<m ;i++ ){
            for (int j=0;j<n ;j++ ){
                
                int c=sc.nextInt();
                
                boolean Correct= c==1?true:false;
                
                a[j]&=Correct;
                
            }
            
        }
        
        boolean ans=false;
        for (var b:a)
        {
            if(b==true)
            {
                ans=true;
                break;
            }
        }
        System.out.println(ans?"Yes":"No");
        
    }
}
//```