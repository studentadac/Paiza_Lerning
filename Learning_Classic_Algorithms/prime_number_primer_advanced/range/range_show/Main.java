//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer_advanced/prime_number_primer_advanced__range_show
//コメント：
//コード：
//```Java


import java.util.*;
public class Main {
    
    static boolean primalityTest(long n){
        boolean prime=true;
         if(n==1L)
        {
            prime=false;
            //return prime;
        }
        
        else
        {
        for (long i=2;i*i<=n ;i++ )
        {
            if(n%i==0)
            {
            prime=false;
            break;
                
            }
        }
        }
        return prime;
    }
    
    
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        var ans=new ArrayList<Long>((int)b-(int)a+1);//a=2,b=3の場合どちらも素数なのでリストのサイズは2以上にしなくてはいけない 
        for(long i=a;i<=b;i++)
        {
        if(primalityTest(i))
        ans.add(i);
      //  System.out.println(i);
        }
        
        if(ans.size()==0)
        System.out.println("Nothing");
        else
        for(var num:ans)
        System.out.println(num);
        
    }
}


//```