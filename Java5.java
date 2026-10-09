
import java.util.Scanner;

class Java5 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your age = ");
        int age = a.nextInt();
        if(age==18)
        {
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("You are not eligible for vote");
        }
    }
}