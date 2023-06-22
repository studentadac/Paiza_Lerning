//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_006/forest_contest_006__d_scoring
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
        int sum=0;
        for (int i=0;i<n ;i++ )
        {
            String s=sc.next();
            
            switch(s)
            {
                case "correct" ->sum+=2;
                case "incorrect" ->sum--;
                
                
                
            }
            
            
        }
        
        System.out.println(sum);
        
       
        
    }
}
//```