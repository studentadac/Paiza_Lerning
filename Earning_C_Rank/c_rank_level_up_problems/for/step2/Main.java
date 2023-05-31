//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_for_step2
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int cnt=0;
        for (int i=0;i<n ;i++ ){
            if(sc.nextInt()==7){
            System.out.println("YES");
            return;
                
            }
        }
        System.out.println("NO");
    }
}
//```