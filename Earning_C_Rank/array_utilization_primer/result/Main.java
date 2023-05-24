//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__result
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var set=new LinkedHashSet<Integer>();

        int n=sc.nextInt();

        for (int i=0;i<n ;i++ )
        {
            set.add(sc.nextInt());
        }

        for(var num:set)
            System.out.println(num);
    }
}
//```