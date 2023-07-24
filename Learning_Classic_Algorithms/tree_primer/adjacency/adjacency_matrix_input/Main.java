//言語：Java
//問題URL：https://paiza.jp/works/mondai/tree_primer/tree_primer__adjacency_matrix_input
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] map=new int[n][n];
        for (int i=0;i<n-1 ;i++ )
        {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            
            map[a][b]=1;
            map[b][a]=1;
        }
        sc.close();

        for (int i=0;i<n ;i++ ) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j]);

                if (j < n - 1)
                    System.out.print(' ');
            }
            System.out.println();
        }
        
    }
}
//```