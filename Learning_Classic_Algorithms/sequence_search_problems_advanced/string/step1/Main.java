//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__strings_step1
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
     //  var Map = new LinkedHashMap<Character,Integer >(26);
      
      int[] a=new int[26];
     
     Scanner sc = new Scanner(System.in);
     char[] s=sc.next().toCharArray();
     
     for (int i=0;i<s.length ;i++ ) 
      {
          a[s[i]-'a']++;//'z'-'a'=25,'a'-'a'=0
      }
      
      for (int i=0;i<26 ;i++ ) 
      {
          System.out.println(a[i]);
      }
      
      
    }
}
//```