import java.util.Scanner;
class Java4{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("ENTER anything");

        int age = a.nextInt();
        float marks = a.nextFloat();
        String name = a.next();
        byte num = a.nextByte();

        System.out.println("Your age is = " + age);
        System.out.println("Your marks is = " + marks);
        System.out.println("Your name is = " + name);
        System.out.println("Your number is = " + num);
        
    }
}