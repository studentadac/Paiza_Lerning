//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_distance_step1
//コメント：
//コード：
//```java
/*1 行目に整数 N が与えられます。
2 行目以降に N 個の点の座標 x_1 y_1, x_2 y_2, ..., x_N y_N が与えられます。
点 (2, 3) と各点の距離を改行区切りで出力してください。
|x1 - x2| + |y1 - y2|
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] x=new int[n];
        int[] y=new int[n];

        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            int ans=Math.abs(x[i]-2)+Math.abs(y[i]-3);

            System.out.println(ans);
        }
        sc.close();

    }
}
//```