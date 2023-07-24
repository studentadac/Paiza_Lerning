//言語：Java
//問題URL：https://paiza.jp/works/mondai/steinsgate/quantity_of_experience_points_boss
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var k=(int)(sc.nextDouble()*10);
        //    System.out.println(k);
        int sum=0;
        for (int i=0;i<n ;i++ )
            sum+=(int)(sc.nextDouble()*10);
        //   System.out.println(sum);
        System.out.println( sum/k + (sum%k==0?0:1)  );

    }
}
//```