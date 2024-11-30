interface MYinterface{
    public abstract void method1();
    public abstract void method2();
}
class Main implements MYinterface{
    public void method1(){
        System.out.println("Implementation of method 1");
    }
    public void method2(){
        System.out.println("Implementation of method 2");
    }
    public static void main(String args[]){
        Main in= new Main();
        in.method1();
        in.method2();
    }
}