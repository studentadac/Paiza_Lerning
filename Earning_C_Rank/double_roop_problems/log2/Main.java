//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__log2
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long lim=n;
        // System.out.println(n);
        var a=new ArrayList<Integer>();
        for (int i=2;i<=lim;i+=2 )//２～ｎの偶数のみのリストを作成
            a.add(i);

        int sum=0;

        for(var num:a)
            while (num % 2 == 0) {//それぞれの二で割り切れる数を加算する
                sum++;
                num /= 2;
            }
        
        System.out.println(sum);
    }
}
//```