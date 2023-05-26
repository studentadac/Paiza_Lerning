//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__queue
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();


        Queue<Integer> q = new ArrayDeque<>();

        for (int i=0;i<n ;i++ )
        {
            if(sc.next().equals("in"))
                q.add(sc.nextInt());
            else if(!q.isEmpty())
                q.remove();
        }

        while(!q.isEmpty())
            System.out.println(q.poll());
    }
}
//```