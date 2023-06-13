//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__matrix_step4
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
        int m=sc.nextInt();
        int h=sc.nextInt();
        int x=sc.nextInt();
        n*=h;
        sc.nextLine();
        int[][] a=new int[n][m];
       // int ans=0;
        for (int i=0;i<n ;i++ )
        {
            String[] s=sc.nextLine().split(" ");
            a[i]=Arrays.stream(s)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int ans=0;
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<m ;j++ )
            { 
                if(a[i][j]==x)
                ans++;
                
            }
        }
        System.out.println(ans);

    }
}
//```