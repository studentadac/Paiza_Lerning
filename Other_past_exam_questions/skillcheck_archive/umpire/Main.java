//言語：Java
//問題URL：https://paiza.jp/works/mondai/skillcheck_archive/umpire
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),b=0,s=0;
        
        for (int i=0;i<n ;i++ )
        {
            var si=sc.next();
            
             if(si.equals("strike"))
            s++;
            
            else b++;
            
            
            
            if(i<n-1)
            {
            System.out.println(si+"!");
            
           
            }
            else
            System.out.println(( s==3?"out":"fourball")  +"!");
            
            
        }
        
        
    }
}
//```