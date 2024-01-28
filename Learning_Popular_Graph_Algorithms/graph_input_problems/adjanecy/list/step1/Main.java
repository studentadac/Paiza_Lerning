//言語：Java
//問題URL：https://paiza.jp/works/mondai/graph_input_problems/graph_input_problems__adjacency_list_step1
//コメント：参考 https://www.techiedelight.com/ja/iterate-over-set-java/
//コード：
//```Java

    import java.util.*;
    public class Main {
        public static void main(String[] args) {
            // 自分の得意な言語で
            // Let's チャレンジ！！
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt(),m=sc.nextInt();
            var a=new ArrayList<HashSet<Integer>>(n+1);

            for (int i=0;i<n+1 ;i++ )
                a.add(new HashSet<Integer>());

            for (int i=0;i<m ;i++ )
            {
                int A=sc.nextInt();
                int B=sc.nextInt();
                a.get(A).add(B);
                a.get(B).add(A);
            }
            // System.out.println(a);

            for (int i=1;i<n+1 ;i++ )
            {
                var b=a.get(i);
                var it = b.iterator();

                while (it.hasNext()) {
                    System.out.print(it.next());
                    System.out.print(it.hasNext()?" ":"\n");
                }
            }
        }
    }



//```