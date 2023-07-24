//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__like_numbers
//コメント：ストラックアウトは難しいので後回し
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        final int sL=S.length();
        for (int i=0;i<sL ;i++ )
        {
            for (int j=i;j<sL ;j++ )
            {
              char tip= S.charAt(i);
              char end= S.charAt(j);
              
              if(       Character.isDigit(tip) && Character.isDigit(end) )
              
                System.out.println(S.substring(i,j+1));
                
            }
            
            
        }
        
    }
}
//```