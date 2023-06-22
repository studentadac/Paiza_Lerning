//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_005/forest_contest_005__d_cd
//コメント：
//コード：
//```Java
/*あなたはオリジナルの CD を作ろうとしています。CD の最大収録時間は 74 分です。
あなたが CD に入れたいと思っている曲は n 曲あり、i (1 ≦ i ≦ n) 曲目の長さは m_i 分 s_i 秒です。
n 曲すべてを 1 枚の CD に収録することができるかどうかを調べてください。*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int min=0,sec=0;
      
      for (int i=0;i<n ;i++ )
      {
          min+=sc.nextInt();
          sec+=sc.nextInt();
          
      }
      
      min+=sec/60;
      sec-=(sec/60)*60;
      
      if(sec>0)//条件分岐が面倒なので切り上げ
      min++;
      
      final int lim =74;
      
      System.out.println(lim>=min?"Yes":"No");
      
      
    }
}

//```