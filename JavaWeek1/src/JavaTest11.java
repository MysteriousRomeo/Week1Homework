import java.util.Scanner;

//Write a Java program that takes a number as input and prints its multiplication
//table upto 10.
public class JavaTest11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(number + " x " + " = " + (number * (i+1)));
        }
    }
}
