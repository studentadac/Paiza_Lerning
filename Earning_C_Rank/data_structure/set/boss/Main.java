//言語：java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_boss
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        var set = new TreeSet<Integer>();
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        
        for (int i=0;i<n*2 ;i++ )
        {
            set.add(sc.nextInt());
        }
        sc.close();

        StringBuilder sb = new StringBuilder();
        for(int num:set)
            sb.append(Integer.toString(num)).append(" ");//文字列化した数値と空白を追加し続ける

        sb.deleteCharAt(sb.length() - 1);//最後の一文字の空白を削除する
        String result = sb.toString();
        System.out.println(result);
    }
}
//```