//言語：Java
//問題URL: https://paiza.jp/works/mondai/query_primer/query_primer__range_of_score
//コメント： 未完成 途中保存
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        int packet=(int)Math.sqrt(n);
        System.out.println(packet);
        var a=new ArrayList<ArrayList<Long>>(packet*2);
        a.add(new ArrayList<Long>(packet));
        var b=new ArrayList<ArrayList<Long>>(packet*2);
        
        int idx=0;
        int cnt=0;
        for (int i=1;i<=n ;i++ )
        {
            //パケットが満杯になったら新しいリストに移動
            if(cnt==packet)
            {
                cnt=0;
                idx++;
                
                long max=0;
                
                a.add(new ArrayList<Long>(packet));
                
            }
            cnt++;
            
            
            a.get(idx).add(sc.nextLong());
            
        }
        
        final int aSize=a.size();
        var max=new long[aSize];
        var min=new long[aSize];
        
        Arrays.fill(min,1000000);
        
        
        int count=0;
        for(var list :a)
        {
            
            for(var num : list)
            {
                max[count]=Math.max(max[count],num);
                min[count]=Math.min(min[count],num);
            }
            count++;
        }
        
        
        
        for (int i=1;i<=k ;i++ )
        {
            int al=sc.nextInt();
            int ar=sc.nextInt();
            int bl=sc.nextInt();
            int br=sc.nextInt();
        }
    }
}

//```