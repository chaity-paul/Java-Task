import java.util.Scanner;

public class Divisible {
    public static boolean isNotDivisibleBy2or3(int num){
        if(num % 2 == 0 || num % 3 == 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the start range: ");
        int start = input.nextInt();
        System.out.println("Enter the end range: ");
        int end = input.nextInt();
        System.out.println("The numbers are not divisible by 2 or 3 are: ");
        for(int i = start; i <= end; i++){
            if(isNotDivisibleBy2or3(i)){
                System.out.print(i + " ");
            }
        }

    }
}
