//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_dictionary_step1
//コメント
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        var map=new HashMap<String,Integer>();
        
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        
        for (int i=0;i<n ;i++ ) 
        {
            String s=sc.next();
            Integer a=sc.nextInt();
            map.put(s,a);
            
        }
        
        System.out.println(     map.get(sc.next())   );
        
        
     
    }
}
//````