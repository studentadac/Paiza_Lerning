//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_sort_boss
//コメント
// コード：
//```Java
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        // sc.nextLine();
        String[][] a=new String[n][2];
        String[] s=new String[n];
        
        for (int i=0;i<n ;i++ ){

            s[i]="";
            for (int j=0;j<2 ;j++ )
            {

                a[i][j]=sc.next();//金と銀の重さを格納
               
            }
            
            

                s[i]+="0".repeat(2-a[i][1].length())+a[i][1]+" "+
                
                "0".repeat(2-a[i][0].length())+a[i][0]+" ";//銀→金の順にする
       
       
        }
     
            



        
        Arrays.sort(s,Collections.reverseOrder());//降順にソート

        String[][] ans =new String [n][2];//

        for (int j=0;j<n ;j++ )
        {

            ans[j]=s[j].split(" ");//半角で文字列を分割
        }
        
        for (int i=0;i<n ;i++ ){
            System.out.println(Integer.parseInt(ans[i][1])+" "+Integer.parseInt(ans[i][0]));//金→銀の順にに戻す
        }
    }
}
//````