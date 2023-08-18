//言語：Java
//問題URL：
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    final static int n=10000;
    static int hash1(int y)
    {
        
        return y%n;
    }
    static int hash2(int y)
    {
        return y/n;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m=sc.nextInt();
        var a=new int[n];
        var b=new int[n];
        
        var c=new int[2];
        for (int i=0;i<m ;i++ ) 
        {
            int y=sc.nextInt();
            if(++a[hash1(y)]>1)
            ++c[0];
            
            if(++b[hash2(y)]>1)
            ++c[1];
            
            
            
        }
        for(var num:c)
            System.out.println(num);
        
        
    }
}



//```