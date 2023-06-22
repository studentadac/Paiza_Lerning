//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue_advanced/stack_queue_advanced__queue_janken
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        final int x=2;
        ArrayDeque<String>[] queue = (ArrayDeque<String>[]) new ArrayDeque[x];

        for (int i=0;i<x ;i++ )
            queue[i] = new ArrayDeque<>();


        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<x ;j++ )
            {
                String hand=sc.next();
                queue[j].add(hand);

            }

        }

        int p=0,ky=0;
        for (int i=0;i<k ;i++ )
        {
            String[] a=new String[2];
            String[] code=new String[2];
            for (int j=0;j<x ;j++ )
            {
                a[j]=queue[j].poll();
                code[j]=sc.next();

                if(code[j].equals("push"))
                    queue[j].add(a[j]);
            }

            if( !a[0].equals(a[1])    ) {

                if ((a[0].equals("S") && a[1].equals("P"))
                        || (a[0].equals("R") && a[1].equals("S"))
                        || (a[0].equals("P") && a[1].equals("R")))
                    p++;

                else
                    ky++;
            }

        }

        //   System.out.println(p+" " +ky);

        if(p==ky)
            System.out.println("draw");
        else if(p>ky)
            System.out.println("paiza");
        else
            System.out.println("kyoko");
    }
}
//```