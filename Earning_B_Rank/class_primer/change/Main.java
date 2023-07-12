//言語：Java
//問題URL：https://paiza.jp/works/mondai/class_primer/class_primer__change
//コメント：
//コード：
//```Java
import java.util.Arrays;
import java.util.Scanner;
class PersonalInformation {
    String name;
    int age;
    String birth;
    String state;

    void show() {
        System.out.println( name+" "+age+" "+birth+" "+state   );
    }
}

class DataComparator implements java.util.Comparator{
    public int compare(Object ps1, Object ps2){
        return ((PersonalInformation)ps1).age - ((PersonalInformation)ps2).age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        PersonalInformation[] ps = new PersonalInformation[n];
        for (int i = 0; i < n; i++) {
            ps[i] = new PersonalInformation();
            ps[i].name = sc.next();
            ps[i].age = sc.nextInt();
            ps[i].birth = sc.next();
            ps[i].state = sc.next();

        }

        for (int i = 0; i < k; i++) {

            var changeId=sc.nextInt()-1;

            var changeName=sc.next();

            ps[changeId].name=changeName;


        }
        sc.close();



        // Arrays.sort(ps, new DataComparator());
        for (int i = 0; i < n; i++) {ps[i].show();}

    }
}
//```