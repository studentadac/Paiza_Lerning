//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_004/forest_contest_004__tempdiff
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean sDay=false;
        int yesterday=sc.nextInt();
        for (int i=0;i<9 ;i++ ) 
        {
            int today=sc.nextInt();
            if(Math.abs(today- yesterday)>=3       )
            {
            sDay=true;
            break;
            }
            yesterday=today;
        }
        System.out.println(sDay?"Yes":"No");
        
    }
}
//```