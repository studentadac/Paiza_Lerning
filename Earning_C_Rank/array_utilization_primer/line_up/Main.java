//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__line_up
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int f = sc.nextInt();
        var set=new LinkedHashSet<Integer>();

        int [] a=new int[k];
        for (int i=0;i<k ;i++)
        {
            a[i]=sc.nextInt();
            if(i>=f)
                set.add(a[i]);
        }

        for(var num:set)
            System.out.println(num);
    }
}
//```