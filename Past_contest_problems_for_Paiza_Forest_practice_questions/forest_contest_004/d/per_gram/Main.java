//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_004/forest_contest_004__per_gram
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        double g1=sc.nextDouble();
        double p1=sc.nextDouble();
        double g2=sc.nextDouble();
        double p2=sc.nextDouble();
        
        
        System.out.println( (p1/g1<p2/g2)?1:2  );
    } 
}
//```