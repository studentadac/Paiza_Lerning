//言語：Java
//問題URL：https://paiza.jp/works/mondai/list_advanced/list_advanced__problems_step2
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
        int q=sc.nextInt();
       
        //int x=sc.nextInt();
        var list=new LinkedList<Integer>();
        
        for (int i=0;i<n ;i++ )
        {
           list.add(sc.nextInt());
            
        }
        for (int i=0;i<q ;i++ )
        {
            int x=sc.nextInt();
            
             for (int j=0;     j<list.size() ;j++ )
             {
                 if(list.get(j)%x==0)
                 {
                     list.remove(j);
                     j--;
                 }
                 
             }
     
            
        }
        if(list.size()==0)
        System.out.println("You");
        else
        {
             System.out.println("Kyoko");
        for (int i=0;i<list.size() ;i++ ) 
        {
           
            System.out.print(list.get(i)+ ( i<list.size()-1?" ":"\n"          )        );
            
        }
        }
        
        
    }
}
//```