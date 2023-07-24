//言語：Java
//問題URL：https://paiza.jp/works/mondai/steinsgate/restore_command_boss
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
        int l=sc.nextInt();

        var map=new HashMap<ArrayList<Integer>  ,Integer >(n);
        for (int i=1;i<=n ;i++ )
        {
            var a=new ArrayList<Integer> ();
            for(int j=0;j<m;j++)
            {
                a.add(sc.nextInt());
            }
            map.put(a,i);
        }
        var com=new int[l][m];
        for (int i=0;i<l ;i++ )
        {
            for(int j=0;j<m;j++)
            {
                com[i][j]=sc.nextInt();
            }
        }

        for (int i=1;i<l ;i++ )
        {
            var b =new  ArrayList<Integer>();
            for(int j=0;j<m;j++)
            {
                b.add(com[i][j]-com[i-1][j]);
            }
            System.out.println(map.get(b)   );
        }
    }
}
//```