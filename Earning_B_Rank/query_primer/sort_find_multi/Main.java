//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__sort_find_multi
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
        int k=sc.nextInt();
        // int x=sc.nextInt();
        int p=sc.nextInt();
        int ans=1;
        int [] heights=new int [201];
        
        // heights[x]++;
        heights[p]=200000; //番兵法
        for (int i=0;i<n ;i++ )
        {
            int h=sc.nextInt();
            heights[h]++;
        }
        int j=0;
        while( heights[j]!=200000       )
        {
            ans+=heights[j++];
        }
        int notSort=0;
        for (int i=0;i<k ;i++ )
        {
            String s=sc.next();
            switch(s)
            {
                case "sorting"->
                {
                    ans+=notSort;
                    System.out.println(ans);
                    notSort=0;
                }
                case "join" ->
                {
                    int h=sc.nextInt();
                    if(p>h)
                        notSort++;
                }
            }
        }
        //System.out.println(ans);
    }
}
//```