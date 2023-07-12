//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_010/forest_contest_010__c_thesis
//コメント:
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int after=30<b?30:b;
        
        if(after*a>=n )
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}
//```