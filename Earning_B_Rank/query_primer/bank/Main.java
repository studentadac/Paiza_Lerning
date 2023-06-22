//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__bank
//コメント： 
//コード：
//```Java
import java.util.*;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        //  銀行→暗証番号
        var passMap = new HashMap<String,Integer>();

        // 銀行→金額
        var BankMoney = new HashMap<String,Integer>();
        String[] bankOrder=new String[n];

        for (int i=0;i<n ;i++ )
        {
            bankOrder[i]=sc.next();
            Integer pass=sc.nextInt();
            Integer  useMoney=sc.nextInt();

            passMap.put(bankOrder[i],pass);
            BankMoney.put(bankOrder[i],useMoney);
            
        }
        for (int i=0;i<k ;i++ )
        {
            String bank=sc.next();
            Integer pass=sc.nextInt();
            Integer  userMoney=sc.nextInt();

            if ( passMap.get(bank).equals(pass))
                BankMoney.put(bank,(BankMoney.get(bank)-userMoney )  );
            
            //   System.out.println(bank+" "+BankMoney.get(bank));
        }
        for (int i=0;i<n ;i++ )
        {
            System.out.println(bankOrder[i]+" "+BankMoney.get(bankOrder[i]));
        }
    }
}
//```