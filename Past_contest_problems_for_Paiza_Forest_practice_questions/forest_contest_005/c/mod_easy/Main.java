//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_005/forest_contest_005__c_mod_easy
//コメント：
//コード：
//```Java
//x 以上であって、y で割った余りが z であるような整数のうち、最小のものを求めてください。


import java.util.*;
public class Main {
    public static void main(String[] args) {
                // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        
        while(x%y!=z)
        {
            x++;
        }
        
        System.out.println(x);
        
        
    }
}
//```