//言語：Java
//問題URL：https://paiza.jp/works/mondai/list_primer/list_primer__doubly_boss
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
        list.add(sc.nextInt());
        
     
        for (int i=0;i<q ;i++ )
        {
            String y=sc.next();
            int p=sc.nextInt();
       switch(y)
       {
        case "1" ->  
         {
             int x=sc.nextInt();
             if(p<=list.size())
             list.add(p-1,x);
             else
             list.add(x);
             
         } 
         
        case "2"->  { list.remove(p-1);}
           
       }
        }
      
   /*
1. INSERT P X:
・クエリ処理開始時点での片方向リストに含まれるノード数を M とします。 P <= M の場合、片方向リストの先頭から P 番目のノードの前に要素 X を挿入してください。
・ P = M + 1 の場合、片方向リストの末尾に要素 X を挿入してください。

2. ERASE P:
・片方向リストの先頭から P 番目のノードを削除してください*/
      
  
        for(var i:list)
        System.out.println(i);
        
  
    }
}
//
//```