//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_speedup_step1
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
        var set=new TreeSet<Integer>();
        for (int i=0;i<n ;i++ )
        {
            set.add(sc.nextInt());
        }
        int herScore=1;
        
        boolean pass=true;
        for (var num:set )
        {
            if(herScore==num)
            herScore++;
            else if(herScore<num)
            {
                pass=false;
                break;
            }
            
        }
        
        System.out.println(pass?"Yes":"No");
    }
}
//```