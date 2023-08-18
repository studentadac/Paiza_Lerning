//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_speedup_step7
//コメント：
//コード： https://akrad.hatenablog.com/entry/2019/09/21/213804 の複合ソートをパクってnaturalOrderはChatGPTに教えてもらった
//```Java

import java.util.*;
import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n=sc.nextInt();
        var a=new ArrayList<String>(n);
        for (int i=0;i<n ;i++ )
        a.add(sc.next());
    //    var b= a.stream().sorted(compairing (a.length() ).collect(toList());;
        
       a.sort(comparing(String::length).thenComparing(naturalOrder()));
       for(var s:a)
       System.out.println(s);

    }
}



//```