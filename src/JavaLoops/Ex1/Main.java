package JavaLoops.Ex1;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int limit=10;
        int i;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Your Summation Formula Number: ");
        int getInput=scanner.nextInt();
        for (i=1; i<=limit;i++){
            int summation =getInput*i;
            System.out.println(getInput+"*"+i+"="+summation);
        }
    }
}
