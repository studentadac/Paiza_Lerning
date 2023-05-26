//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__group_move
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        var list=new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n ;i++ )
            list.add(i);

        int q = sc.nextInt();

        for (int i=0;i<q ;i++ )
        {
            String s=sc.next();
            switch (s){
                case "swap" ->        Collections.swap(list, sc.nextInt()-1, sc.nextInt()-1);
                case "reverse" ->  Collections.reverse(list);
                case "resize" -> {
                    int a=sc.nextInt();
                    while(list.size()>a)
                        list.remove(list.size()-1);
                }
                default -> System.out.println("failed");
            }
        }
        for (var num:list )
            System.out.println(num);
    }
}
//```