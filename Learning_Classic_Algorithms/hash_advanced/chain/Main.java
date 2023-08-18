//言語：Java
//問題URL：  https://paiza.jp/works/mondai/hash_advanced/hash_advanced__chain
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    static final int mod=100;
    static int makeHash(String s)
    {
        var S=s.toCharArray();
        int sum=0;
        final int B=7;
        int b=B;
        for(char num:S )
        {
            sum+=num*b;
            b*=B;
            sum%=mod;
            b%=mod;
            
        }
        return sum%mod;
    }
    
    public static void main(String[] args) {
        var a=new ArrayList<LinkedHashSet<String>>(mod);
        
        
        for (int i=0;i<mod ;i++ ) 
        {
            var b=new LinkedHashSet<String>();
            a.add(b);
        }
        
        
        
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            int q=sc.nextInt();
            
            
            switch(q)
            {
                
                case 1 ->
                {
                    String s=sc.next();
                    
                    int locale=makeHash(s);
                   // System.out.println(locale);
                    a.get(locale).add(s);
                  //  System.out.println(a.get(locale));
                }
                case 2 ->
                {
                    int locale=sc.nextInt()-1;
                    
                    if(a.get(locale).size()!=0)
                    System.out.println(String.join(" ",a.get(locale) ));
                    else
                    System.out.println(-1);
                    
                }
                case 3 ->
                {
                    String s=sc.next();
                    int locale=makeHash(s);
                    a.get(locale).remove(s);
                }
                
                
            }
            
            
            
            
        }
        
     //   System.out.println(a);
        
        
    
    }
}


//```