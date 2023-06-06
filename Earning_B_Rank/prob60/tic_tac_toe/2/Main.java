//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/tic_tac_toe_2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        final int n=5;
        for (int i=0;i<n ;i++ ) 
    {
        
         String line = sc.nextLine();
        
        if(line.equals("OOOOO")||line.equals("XXXXX"))
        {
            System.out.println(line.charAt(0));
            return;
        }
        
        
        
        
    }
        
        System.out.println('D');
        
       
    }
}
//```