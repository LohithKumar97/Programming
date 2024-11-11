import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number");
        Scanner Sc = new Scanner(System.in);
        number = Sc.nextInt();
        int reversedNumber = 0; 
        int temp = number;
        while(temp > 0){
            int remainder = temp%10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp = temp/10;
        }
        Sc.close();
        if(number==reversedNumber)
        System.out.println("number is palindrome");
        else
        System.out.println("not palindrome");
        
    }
}
