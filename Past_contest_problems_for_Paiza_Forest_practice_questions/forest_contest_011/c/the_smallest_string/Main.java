//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_011/forest_contest_011__c_the_smallest_string
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        var s = sc.next().toCharArray();
        
     //   var a=new int[n];
     /*   
        for (int i=0;i<n ;i++ )
        {
            a[i]=s[i];
        }
    */
        
        Arrays.sort(s);
        
        System.out.println(String.valueOf(s));
    }
}
//```