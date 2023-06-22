//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_004/forest_contest_004__d_flower_language
//コメント：paizaの森コンテスト1の野球の背番号問題を流用
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        var fWord=new HashMap<String,String  >(5)
        {{
    put("rose","I love you");
    put("cosmos", "harmony");
    put("tulip", "perfect lover");
    put("hydrangea","heartlessness");
    put("jasmine","amiability");
            
        }};
        /*
        rose: I love you
・cosmos: harmony
・tulip: perfect lover
・hydrangea: heartlessness
・jasmine: amiability*/
        
        
        
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        System.out.println(fWord.get(s));
        
        
        
    }
}
//```