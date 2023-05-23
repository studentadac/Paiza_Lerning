//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__search_count_step1
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
       
        String s[]="1 2 2 1 2 1 2 1 1 1".split(" ");
        
        String cmp="1";
        int ans=0;
        
        for(String num:s )
        if(num.equals(cmp))
        ans++;
        
        System.out.println(ans);
    }
}
//```