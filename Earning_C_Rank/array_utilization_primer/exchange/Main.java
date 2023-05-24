//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__excange
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=2;
        //   int[] a =new int [n];
        var a= new  ArrayList<Integer>(n);
        
        for (int i=0;i<n ;i++ )
               a.add(sc.nextInt());
               
        Collections.reverse(a);
        
        
        System.out.println(a.get(0)+" "+a.get(1));
               
    

    }
}
//```