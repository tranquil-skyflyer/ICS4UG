//Jacob Samson
//10/29/18
//Conditionals.java
//A program that requests and receives a number from the user (in decimal). The program must then output all the numbers (in binary) leading up to the value given by the user.
import java.util.Scanner;
public class Conditionals {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number (in decimal) between 0 and 7");
        short decNumber=sc.nextShort();
        for (int i=0;i<=decNumber;i++) {
            System.out.println(((i/2)/2)%2+""+(i/2)%2+""+i%2);
        }
    }
}