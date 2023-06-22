//言語：Java
//問題URL：https://paiza.jp/works/mondai/etc/ternary
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int a=sc.nextInt();
        System.out.println(a>0?"plus":a );
        
        String b = sc.next();
        System.out.println(b.equals("hoge")?"yes":b);
        
        String c = sc.next();
        System.out.println(c.length()==10?"ten":c);
        
        String d = sc.next();
        int y=d.indexOf("x");
        System.out.println(y!=-1?y:"nothing" );
        
        
        String e = sc.next();
        System.out.println(e.length()==5?"five":e.charAt(0));
        
     
        
        /*5行の入力が与えられます。

・1行目では整数aが与えられます。aが0より大きいなら"plus"、そうでなければそのまま1行目で表示してください。
・2行目では文字列bが与えられます。bが"hoge"に一致するなら"yes"、そうでなければそのまま2行目で表示してください。
・3行目では文字列cが与えられます。cが10文字なら"ten"、そうでなければそのまま3行目で表示してください。
・4行目では文字列dが与えられます。dが文字"x"を含むなら"x"が最初に見つかった位置、そうでなければ"nothing"を4行目で表示してください。
・5行目では文字列eが与えられます。eが5文字なら"five"、そうでなければeの最初の1文字だけを5行目で表示してください。*/
        
        
    }
}
//```