//言語：Java
//問題URL：https://paiza.jp/works/mondai/class_primer/class_primer__closed_maze
//コメント：手続き型で解けた
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();
        var sb=new StringBuilder();
        var a=new char[n];
        var b=new int[n][2];
        //  var c=new int[n];

        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.next().toCharArray()[0];

            for (int j=0;j<2 ;j++ )
            {
                b[i][j]=sc.nextInt();
            }

        }

        int[] m=new int[k];
        for (int i=0;i<k ;i++ )
            m[i]=sc.nextInt();

        int cur= s-1;
        System.out.print(a[cur]);
        for (int i=0;i<k ;i++ )
        {
            cur=  b[cur][m[i]-1]-1;
            System.out.print(a[cur] );
        }
        System.out.println();
    }
}

//```