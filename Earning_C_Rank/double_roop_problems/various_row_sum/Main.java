//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__stairs
//コメント：sum部分はここのコピペhttps://www.delftstack.com/ja/howto/java/find-sum-of-array-in-java/
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        for (int i=0;i<n ;i++ )
        {
            int k = sc.nextInt();
            int a[]=new int [k];
            for (int j=0;j<k ;j++ )
            {  a[j]= sc.nextInt();}
            int sum = Arrays.stream(a).parallel().reduce(0,(b,c)->  b + c);
            System.out.println(sum);
        }
    }
}
//```