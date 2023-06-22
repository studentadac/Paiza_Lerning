//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue_advanced/stack_queue_advanced__full_elevator
//コメント： 回答を見て解きました
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        var stack = new ArrayDeque<Integer>();
        int sum=0;
        
        for (int j=0;j<n ;j++ )
        {
            String s=sc.next();
            int num=sc.nextInt();
            if(s.equals("ride") )
            {
                for (int i=0;i<num ;i++ )
                {
                    int weight=sc.nextInt();
                    if((sum+weight)<=x )
                    {
                        stack.push(weight);
                        sum+=weight;
                    }
                }
            }
            else
            {

                for (int i=0;i<num ;i++ )
                {
                    sum-=stack.pop();
                }
            }
        }
        System.out.println(stack.size());
        System.out.println(sum);
    }
}

//```