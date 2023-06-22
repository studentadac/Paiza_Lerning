//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_005/forest_contest_005__d_hitter
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        var m=new LinkedHashMap<String,Integer>();
        Scanner sc = new Scanner(System.in);

        var a=sc.nextLine().split(" ");
        //int aSize=a.size();

        for(var word:a)
        {
            var key=m.get(word);
            m.put(word, key==null?1:key+1    );
        }
        
        for(Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
//```