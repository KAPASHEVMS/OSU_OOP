<<<<<<< HEAD
import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        String A;
       String B;

       System.out.print("Введите первое слово :");
       Scanner sc = new Scanner(System.in);
       A = sc.nextLine();
       System.out.print("Введите второе слово :");
       Scanner sc2 = new Scanner(System.in);
       B = sc2.nextLine();
       char[] ABC = A.toCharArray();
       char[] ABC1 = B.toCharArray();
       int c = 0;

       for(int i = 0; i < B.length(); i++){
        for(int j = 0; j < A.length(); j++){
            if(ABC1[i] == ABC[j]){
                c++;
                ABC[j] = ' ';
                break;
            }
        }
       }

       if(c == B.length()){
        System.out.println("true");
       }
       else{
        System.out.println("false");
       }
       sc.close();
       sc2.close();
    }
}
=======
import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        String A;
       String B;

       System.out.print("Введите первое слово :");
       Scanner sc = new Scanner(System.in);
       A = sc.nextLine();
       System.out.print("Введите второе слово :");
       Scanner sc2 = new Scanner(System.in);
       B = sc2.nextLine();
       char[] ABC = A.toCharArray();
       char[] ABC1 = B.toCharArray();
       int c = 0;

       for(int i = 0; i < B.length(); i++){
        for(int j = 0; j < A.length(); j++){
            if(ABC1[i] == ABC[j]){
                c++;
                ABC[j] = ' ';
                break;
            }
        }
       }

       if(c == B.length()){
        System.out.println("true");
       }
       else{
        System.out.println("false");
       }
       sc.close();
       sc2.close();
    }
}
>>>>>>> 5ddab87042a41e21d268f6b19171f0ae28ebceb2
