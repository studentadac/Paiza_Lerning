//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__insert
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        //   int[] a =new int [n];
        var a= new  ArrayList<String>(n);

        for (int i=0;i<n ;i++ )
            a.add(sc.next());

        a.add(sc.nextInt(),sc.next());
        
        System.out.print(String.join("\n",a));

    }
}
//```