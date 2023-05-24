//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/advance_step9
//コメント：step8と同じ
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var line = sc.next();

        String[] nums=line.split( "\\D+");//整数以外を区切り文字とする
        String[] parts = line.split("\\d+");//整数を区切り文字とした記号の配列

        int ans=0;//Integer.parseInt(nums[0]);//parts[0]にはなぜか空白が入っている
        //   System.out.println(parts.length+" "+nums.length);

        for (int i=0;i<parts.length ;i++ )
        {
            int x=Integer.parseInt(nums[i]);
            if(parts[i].equals("-"))
                x*=-1;//マイナス符号ならマイナスする
            ans+=x;

        }
        System.out.println(ans);
    }
}
//```