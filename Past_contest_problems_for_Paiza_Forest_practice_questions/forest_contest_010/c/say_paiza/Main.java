//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_010/forest_contest_010__c_say_paiza
//コメント:
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var line = sc.next();
        int j=0;
        String s="paiza";
        for (int i=0;i<line.length() ;i++ )
        {
            if(line.charAt(i)==s.charAt(j))
            {
                j++;
            }
            if(j==5)
            {
            System.out.println("Yes");
            return;
            }
            
        }
        
        System.out.println("No");
        
        
    }
}

//```