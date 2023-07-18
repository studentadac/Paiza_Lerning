//言語：Java
//問題URL：https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_move_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int y=sc.nextInt();
        int x=sc.nextInt();
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            String s=sc.next();
            char direct=s.charAt(0);//文字列ではswitch文を使えない
            
            switch(direct)
            {
             
             case 'N' -> y--;
             case 'S' -> y++;
             case 'E' -> x++;
             case 'W' -> x--;
                
            }
            System.out.println( y+" "+x );
            
        }
    }
}
//```