import java.util.*;
public class AS21_25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
                int num=sc.nextInt();
        if(num%2==0 && num%8==0){
            if(num%12!=0){
                System.out.println(num+" is divisible by 2 and 8 but not 12");
            }

        }

    }
}
