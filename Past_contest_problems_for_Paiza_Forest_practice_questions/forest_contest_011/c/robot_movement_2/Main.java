//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_011/forest_contest_011__c_robot_movement_2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int x=Math.abs(sc.nextInt());
        int y=Math.abs(sc.nextInt());
        int sumStep=0;
        sumStep+=2*Math.min(x,y);
        
        int diff=Math.max(x,y)-Math.min(x,y);
        
        
        if(diff>0)
        sumStep+=diff*2-1;
        
        System.out.println(sumStep);
        
    }
}
//```