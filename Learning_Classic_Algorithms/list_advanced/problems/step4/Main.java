//言語：Java
//問題URL：https://paiza.jp/works/mondai/list_advanced/list_advanced__problems_step4
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var list=new LinkedList<String>();
        int now=0;
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            String s=sc.next();
            //  System.out.println(now+" "+list.size());
            //   System.out.println(now+" "+s.length());
            //    System.out.println(s);
            if(s.length()==1)
            {
                list.add(now,s);
                now++;
                //     System.out.println(list.size());
            }
            //          else
//            System.out.println(s);
            else
                switch (s)
                {
                    case  "Left"  ->{
                        if(now>0)
                            now--;
                    }
                    case  "Right"  ->{
                        if(now<list.size()    )
                            now++;
                    }
                    case  "Delete"->{
                        if(now>=1)
                        {
                            now--;
                            list.remove(now);
                        }
                    }
                    //    case "REMOVE_LEFT"->list.removeFirst();
                    //        default ->System.out.println("miss");
                }
        }

        //     System.out.println(now);
        StringBuilder sb = new StringBuilder();
        for (var num:list )
        {
            sb.append(num);
            sb.append(" ");
        }
        if(sb.length()>1)
            sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
//```