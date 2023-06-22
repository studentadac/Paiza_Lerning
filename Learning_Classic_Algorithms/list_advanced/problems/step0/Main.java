//言語：Java
//問題URL：https://paiza.jp/works/mondai/list_advanced/list_advanced__problems_step0
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
        var list=new LinkedList<String>();
        
        for (int i=0;i<n ;i++ ) 
        list.addLast(sc.next());
        
     var a=new String[q];
        for (int i=0;i<q ;i++ )
        {
        a[i]=sc.next();
        }
        for (int i=0;i<q ;i++ )
        {
            int position =sc.nextInt()-1;
            list.add(position,a[i]);
    
        }
     
  
        for(var i:list)
        System.out.println(i);
        
  
    }
}
//```