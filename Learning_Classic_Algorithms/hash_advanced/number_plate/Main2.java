//言語：Java
//問題URL： https://paiza.jp/works/mondai/hash_advanced/hash_advanced__number_plate
//コメント：修正後
//コード：
//```Java
import java.util.*;
public class Main {
    
    static int  makeHashStr (String s,int i)
    {
        var hash=0;
        
        var CharArr=s.toCharArray();
        
        
        for (int num:CharArr) 
        {
            hash+=num;
            
        }
        hash*=i;
        
        return  hash;
        
    }
    
    
    
    public static void main(String[] args) {
        
        
        
        int n=2;
        int sum=0;
        var I=new int[n];
        var s=new String[n];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n ;i++ )
        {
            s[i]=sc.next();
            I[i]=sc.nextInt();
            sum+=makeHashStr(s[i],I[i]);
        }
        sc.close();
        
        int ans=sum%1000;
        
        System.out.println(ans);

        
    }
}

//```