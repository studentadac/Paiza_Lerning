//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__search_count_boss
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a[]= sc.nextLine().split(" "); //a[0]=n,a[i]=m
        String s[]=sc.nextLine().split(" ");
        sc.close();

        int ans=0;
        for(String num:s )
            if(num.equals(a[0]))
                ans++;

        System.out.println(ans);
    }
}
//```