//言語：Java
//問題URL：https://paiza.jp/works/mondai/class_primer/class_primer__inheritance
//コメント:
//```Java
import java.util.*;

class Underage
{
    int total=0;

    void add(int N,String kind  )

    {
        if(! ("alcohol".equals(kind)))
            this.total+=N;
    }
    void show()
    {
        System.out.println(this.total);
    }
}
class Adult extends Underage
{

    boolean nebiki=false;
    void add(int N,String kind  )

    {
        this.total+=N;

        if(nebiki&& "food".equals(kind) )
            this.total-=200;

        if("alcohol".equals(kind))
            nebiki=true;
        
    }

}
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        var list =new ArrayList<Underage>(n);
        
        for (int i=0;i<n ;i++ )
        {
            int old=sc.nextInt();
            if(old>=20)
                list.add(new  Adult());
            else
                list.add(new Underage());
        }

        for (int i=0;i<k ;i++ )
        {
            int x=sc.nextInt()-1;
            String kind=sc.next();
            int N=sc.nextInt();
            list.get(x).add(N,kind);
        }

        for(var mem: list )
            mem.show();
    }
}
//```