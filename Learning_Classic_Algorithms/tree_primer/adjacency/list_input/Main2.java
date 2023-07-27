//言語：Java
//問題URL：https://paiza.jp/works/mondai/tree_primer/tree_primer__adjacency_list_input
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
        var a=new ArrayList <ArrayList<Integer>>(n) ;
        for (int i = 0; i < n; i++)
        {
            a.add(new ArrayList<Integer>(n));
        }
        for (int i=1;i<n ;i++ )
        {
            var g0=sc.nextInt();
            var g1=sc.nextInt();
            a.get(g0-1).add(g1);
            a.get(g1-1).add(g0);

        }

        for (var list:a )
        {
            Collections.sort(list);
            var sb=new StringBuilder();
            //  System.out.println(list);
            for(var num:list)
                sb.append(Integer.toString(num)+' ');
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb);
        }

    }
}
//```