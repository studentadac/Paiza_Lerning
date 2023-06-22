//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_005/forest_contest_005__c_ciclehit
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        boolean[] hit = new boolean[5];
        
        for (int i=0;i<5 ;i++ )
        hit[sc.nextInt()]=true;
        
        boolean ans=true;
        for (int i=1;i<5 ;i++ )
        ans=ans&&hit[i];
        
        System.out.println(ans?"Yes":"No");
        
    }
}
//```