public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class C {
    private String message;
    // constructor
    C(String message){
        this.message = message;
        System.out.println(message);
    }
    protected void methodC(){
        // todo
        System.out.println("executing method C");
    }
}

class B extends C {
    // default constructor from parent class
    super("hello, C");

    public void methodB(){
        // todo
        System.out.println("Executing method B");
    }
}

class A extends B{
    public void methodA(){
        // todo
        System.out.println("Executing method A");
    }
}