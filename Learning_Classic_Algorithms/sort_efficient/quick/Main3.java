//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_efficient/sort_efficient__quick
//コメント：写経
//コード：
//```Java
import java.util.*;
public class Main {
    static int cnt=0;

    
    
    static void qSort(long[] a, int left,int right)
    {
        if(left+1>=right)
            return;
        
        long pivot=a[right-1];
        int curIndex=left;
        
        for (int i=left;i<right-1 ;i++ )
        {
            
            if(a[i]<pivot)
            {
                //swap(a[curIndex],a[i]);
                
                var tmp=a[i];
                a[i]=a[curIndex];
                a[curIndex]=tmp;
                
                
                curIndex++;
                
                cnt++;
            }
            
        }
        var tmp=a[curIndex];
                a[curIndex]=a[right-1];
                a[right-1]=tmp;
        
        qSort(a,left,curIndex);
        qSort(a,curIndex+1,right);

        
        
    }
    
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        var a=new long[n];
        for (int i=0;i<n ;i++ ) 
        a[i]=sc.nextLong();
        
        //int mid=(0+n)/2;
        qSort(a,0,n);
        
        for (int i=0;i<n ;i++ ) 
        System.out.print(a[i] +(i<n-1?" ":"\n") );
        
        System.out.println(cnt);
    }
}
//```