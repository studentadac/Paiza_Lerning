//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_speedup_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt()-1;

        //    int[] a=new int [3];
        char[] origin={'a','a','a'};//初期値
        int cnt=2;
        while(n>=1)//26進数に変換
        {
            origin[cnt]=(char)(n%26+'a');
            cnt--;
            n/=26;
        }
        
        var ans=  String.valueOf(origin);
        System.out.println(ans);
    }
}
//```