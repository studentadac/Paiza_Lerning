//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_001/forest_contest_001__c_player_number
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var map =new TreeMap<Integer,String> (); 
        
        for (int i=0;i<n ;i++ )
        {
            
            var b=sc.nextInt();
            var p=sc.next();
            
            map.put(b,p);
            
            
        }
       
        
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey()+" "+entry.getValue());
}
       
       
    }
}
//```