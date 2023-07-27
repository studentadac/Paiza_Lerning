//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__dount
//コメント：xとyの代入ミスで時間を食った
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        var h=sc.nextInt();
        var w=sc.nextInt();
        var n=sc.nextInt();
        var a=new long[h][w];

        for (var i=0;i<h ;i++ )
            for(int j=0;j<w;j++)
                a[i][j]=sc.nextInt();

        var s=new long[h+1][w+1];
        for (int i=0;i<h ;i++ )
        {
            for(int j=0;j<w;j++)
            {
                s[i+1][j+1]=s[i][j+1]+s[i+1][j]-s[i][j]+a[i][j];
                //   System.out.print(s[i+1][j+1]+"\t");
            }
            //   System.out.println();
        }
        for (int i=0;i<n ;i++ )
        {
            int y=sc.nextInt();
            int x=sc.nextInt();
            int b=sc.nextInt();
            int S=sc.nextInt();
            
            int firstx=x-(b+1)/2;
            int firsty=y-(b+1)/2;
            int endy=firsty+b;
            int endx=firstx+b;
            var sum=s[endy][endx]+s[firsty][firstx]-s[endy][firstx]-s[firsty][endx];

            int delfirstx=x-(S+1)/2;
            int delfirsty=y-(S+1)/2;
            int delendy=delfirsty+S;
            int delendx=delfirstx+S;
            
            var delsum=s[delendy][delendx]+s[delfirsty][delfirstx]-s[delendy][delfirstx]-s[delfirsty][delendx];
            //  System.out.println("中心\t"+  y+" "+x+" 周囲\t "+b+" "+S);
            //  System.out.println("総和\t"+endy+" "+endx+" "+firsty +" "+firstx  );
            // System.out.println("消す面積\t"+delendy+" "+delendx+" "+delfirsty +" "+delfirstx  );
            //   System.out.println("面積\t"+sum+" "+delsum);
            System.out.println(sum-delsum);
            //   System.out.println();
        }
        /*   
         for (int i=0;i<n+1 ;i++ )
        for(int j=0;j<n+1;j++)
        System.out.print(s[i][j]+( j<n?" ":"\n"    )  );
     */
    }
}
//```