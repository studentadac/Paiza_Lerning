//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_010/forest_contest_010__d_seat
//コメント:
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int i=0;
        while(sc.hasNext())
        {
            System.out.print(sc.next() );
            
            i++;
            if(i%3==0)
            System.out.println();
            else
            System.out.print(" ");
            
            
        }
        
    }
}
//```