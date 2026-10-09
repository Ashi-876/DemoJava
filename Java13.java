public class Java13 {
    static int s = 100;
    int i = 50;
    void IM(){
        System.out.println("instance method");
    }
    static void SM() {
        System.out.println("static method");
    }
    public static void main(String[] args) {
        int v = 25;
        Java13 T = new Java13();

        System.out.println("Local variable = " +v);
        System.out.println("Static variable = " +s);
        System.out.println("Instance variable = " +T.i);
        T.IM();
        SM();
    }
    
}
