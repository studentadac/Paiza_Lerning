//言語：Java
//問題URL：https://paiza.jp/works/mondai/euclidean_primer/euclidean_primer__fraction
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static long gcd(long a,long b) {
        while(a!=0&&b!=0)
        {  if(a<b)
            b%=a;
        else
            a%=b;
        }
        return Math.max(a,b);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        char x=sc.next().toCharArray()[0];
        long c=sc.nextLong();
        long d=sc.nextLong();
        
        
        long bunsi=0;
        long kakeru=b*c;
        switch(x)
        {
            case '+' ->bunsi= a*d+b*c;
            case '-' ->bunsi=a*d-b*c;
            case '*' ->bunsi=a*c;
            case '/' -> bunsi= a*d;
        }
        
        long bunbo;
        if(x=='/')
            bunbo=b*c;
        else
            bunbo=b*d;
        
        if(bunbo<0 )//分母が０未満の場合、分子の大きさによらず分子と分母の正負を反転させる
        {
            bunbo*=-1;
            bunsi*=-1;
        }
        
        //    System.out.println(Math.abs(bunsi)+" "+bunbo);
        long waru=gcd(Math.abs(bunsi),Math.abs(bunbo));
        // System.out.println(gcd(bunbo,bunsi));
        bunsi/=waru;
        bunbo/=waru;
        
        System.out.println( (bunsi)+" "+bunbo  );
    }
}
//```