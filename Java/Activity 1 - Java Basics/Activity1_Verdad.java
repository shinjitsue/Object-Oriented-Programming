import java.util.Scanner;
public class Activity1_Verdad {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int num = scanner.nextInt();
        int x = 0;
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }else if(num % 3 == 0){
                num /= 3;
            }else if(num % 5 == 0){
                num /= 5;
            }else{
                System.out.print("Not an ugly number\n");
                x = 1;
                break;
            }
        }
        if(x == 0)
        System.out.print("Ugly number\n");
        }
}