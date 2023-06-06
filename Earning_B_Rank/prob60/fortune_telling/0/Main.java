//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/fortune_telling_0
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        var map=new LinkedHashMap<String,String>(){
            {
                put("Kyoko","B");
                put("Rio","O");
                put("Tsubame","AB");
                put("KurodaSensei","A");
                put("NekoSensei","A");
            }
        };
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
//```