//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_007/forest_contest_007__temparature_2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[n-1]-a[0]);
    }
}
//```