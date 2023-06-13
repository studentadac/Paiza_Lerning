//言語：Java
//問題URL：https://paiza.jp/works/mondai/drankfast/d1_step_distance
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
 
        System.out.println((sc.nextInt()*1000*100)/sc.nextInt()>=10000?"yes":"no");//1km=1000m,1m=100cm, 1k=1000*100cm  歩幅で割る
    }
}
//```