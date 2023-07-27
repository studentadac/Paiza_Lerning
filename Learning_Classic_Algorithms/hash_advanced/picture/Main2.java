//言語：Java
//問題URL：
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    
    static int  createHashFromImg (String[] s)
    {
        var hash=0;
        
        final int n=s[0].length();
        
        for (int i=0;i<n ;i++ ) 
       {
        var CharArr=s[i].toCharArray();
        for (int j=0;j<n ;j++ )
        {
            if(CharArr[j]=='#')
            hash+=(i+1)*(i+1)*(j+1);
            
        }
       }
        return  hash;
        
    }
    
    
    
    public static void main(String[] args) {
        
        
        
        final int n=6;
        int sum=0;
        var I=new int[n];
        var s=new String[n];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n ;i++ )
        {
            s[i]=sc.next();
        }
        sc.close();
        
        sum=createHashFromImg(s);
        
        int ans=sum%100;
        
        System.out.println(ans);

        
    }
}

//```
