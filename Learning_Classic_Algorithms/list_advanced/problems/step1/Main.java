//言語：Java
//問題URL：https://paiza.jp/works/mondai/list_advanced/list_advanced__problems_step1
//コメント：サイズを1増やしたらなぜか通った
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
        
   //     System.out.println((1+2)/2);
       
        
        var list=new LinkedList<Boolean>();
        for (int i=0;i<=n ;i++ )
        list.add(i==0 );//最初のみtrue
        
        
        for (int i=0;i<q ;i++ )
        {
            int op=sc.nextInt();
            int x=sc.nextInt()-1;//listは0から始まるので1左にずらす
            int y=sc.nextInt()-1;
          //  System.out.println(x+" "+y);
           
            
            if(op==1)
           Collections.swap(list,x,y);
           
            
            else
            list.add(x,false);
            
       //      System.out.println(list.size());
            
        }
        
        
        
        
      
  int cnt=1;
       for(var i:list)
       {
           if(i)
           {
               System.out.println(cnt);
               break;
           }
           cnt++;
       }
        
  
    }
}
//```