//言語：Java
//問題URL：https://paiza.jp/works/mondai/class_primer/class_primer__find
//コメント：
//コード：
//```Java
import java.util.Scanner;

class PersonalInformation {
    String name;
    int age;
    String birth;
    String state;

    void show() {
        System.out.println("User{");
        System.out.println("nickname : " + name);
        System.out.println("old : " + age);
        System.out.println("birth : " + birth);
        System.out.println("state : " + state);
        System.out.println("}");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        PersonalInformation[] ps = new PersonalInformation[n];
        for (int i = 0; i < n; i++) {
            ps[i] = new PersonalInformation();
            ps[i].name = sc.next();
            ps[i].age = sc.nextInt();
            ps[i].birth = sc.next();
            ps[i].state = sc.next();
            
        }

        int k=sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            if(ps[i].age==k)
            {
                System.out.println(ps[i].name);
                break;
            }
        }
        
    }
}


//```