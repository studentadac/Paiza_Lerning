//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_split_boss
//コメント：
//コード：もっとスマートにできた気がする
//```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        
        sb.append(line);//StringBuilder型に代入
//System.out.println(sb.toString());

        sb.reverse();//反転

        line=sb.toString();反転を文字列に
        char[] c = line.toCharArray();//文字列を文字配列で添え字アクセス可能に

        StringBuilder s = new StringBuilder();
        final int ll=line.length();
        for (int i=0;i<ll ;i++ )//下の桁からカンマ,を付け加える
        {


            if((i)%3==0&&i!=0)
            {
                s.append(",");
            }
            s.append(c[i]);
        }
        s.reverse();//反転

        String ans=s.toString();//文字列化
        System.out.println(ans);


    }
}
//```