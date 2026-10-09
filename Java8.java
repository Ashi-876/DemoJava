class Java8{
    int x = 10;
    void M1(){
        System.out.println("Instance method");
    }
    public static void main(String[] args){
        Java8 a = new Java8();
        System.out.println("instance variable : " + a.x);
        a.M1();
    }
}