//言語：Java
//問題URL：https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_move_step3
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
        String S=sc.next();
        char state=S.charAt(0);

        //  for (int i=0;i<n ;i++ )
        {
            String s=sc.next();
            char direct=s.charAt(0);//文字列では==を使えない
            if(
                    (state=='N'&& direct=='R'  )
                            ||
                            (state=='S'&& direct=='L'  )
            )
            {
                x++;
                state='E';
            }
            
            else if(
                    (state=='N'&& direct=='L'  )
                            ||
                            (state=='S'&& direct=='R'  )
            )
            {
                x--;
                state='W';
            }
            
            else if
            (
                    (state=='E'&&direct=='R' )
                            ||
                            (state=='W'&&direct=='L' )
            )
            {
                y++;
                state='S';
            }

            else if
            (
                    (state=='E'&&direct=='L' )
                            ||
                            (state=='W'&&direct=='R' )
            )
            {
                y--;
                state='N';
            }

            else
                System.out.println("miss"+" "+y+" "+x);
            
            System.out.println( y+" "+x );
        }
    }
}
//```