//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_011/forest_contest_011__c_overwork
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    /*
    一般的な勤務体系の場合、1日8時間を超えて働くと、「残業」となります。 1 ヶ月間(30日間)でi (1 ≦ i ≦ 30)日目のパイザ君の勤務時間は m_i でした。
この月のパイザくんの残業時間を計算してください。


    */
    static Scanner sc = new Scanner(System.in);
    public static int[]  inputArray(int n)
    {
        
        var a=new int[n];
        //Scanner x = new Scanner(System.in);
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
        }
        
        
        
        return a;
    }
    
   /*
    public static boolean overtimeJudgment(int n){
        
        return n>8?true:false;
        
        
    }
    */
  
    
    public static int  measureOvertimeHours(int[] a)
    {
        int totalOvertimeHours=0;
        final int normalWorkTime=8;
        for(var worktime:a )
        {
            
            totalOvertimeHours += worktime - normalWorkTime;
            
            
        }
        return totalOvertimeHours;
    }
    
   
    
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        
        final int n=30;
       
        var a=inputArray(n);
        var ans=measureOvertimeHours(a);
        System.out.println(ans);
        
       
        
    }
}

//```