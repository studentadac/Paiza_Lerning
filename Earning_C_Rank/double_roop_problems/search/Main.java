//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__print_search
//コメント：ラベル付きbreakの練習 ループ後の処理がないのでreturnでもいい
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        myLabel:  for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<k ;j++ )
            {
                if(sc.nextInt()==1)
                {System.out.println((i+1)+" "+(j+1));
                    sc.close();
                    break myLabel;
                }
            }
        }
    }
}
//```