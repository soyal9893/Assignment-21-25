import java.util.*;
public class AS21_25_2 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter a num");
        int Num= Sc.nextInt();
        for(int i=1; i<=Num; i++){
            System.out.println(" ");
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        }

    }
}
