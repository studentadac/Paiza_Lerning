//言語：Java
//問題URL： https://paiza.jp/works/mondai/hash_advanced/hash_advanced__number_plate
//コメント：たたき上げ
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        int ans=0;
        Scanner sc = new Scanner(System.in);
        //H(s_1, i_1, s_2, i_2) = (s_1 の各文字の文字コードの和 * i_1 + s_2 の各文字の文字コードの和 * i_2) % 1000
        var s1=sc.next().toCharArray();
        var i1=sc.nextInt();
        for (int i=0;i<s1.length ;i++ ) 
       {
        ans+=(int)s1[i];
//        System.out.println((int)s1[i]);
       }
        
        ans*=i1;
        int sum=0;
        
        var s2=sc.next().toCharArray();
        var i2=sc.nextInt();
        for (int i=0;i<s2.length ;i++ ) 
        sum+=(int)s2[i];
        
        sum*=i2;
        
        ans=(ans+sum)%1000;
        
        System.out.println(ans);

        
    }
}
//```