public class MyClass {

    private String greeting;

    public MyClass(String greeting) {
        this.greeting = greeting;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass("Hello World!");
        System.out.println(myClass.getGreeting());
    }

    public String getGreeting() {
        return this.greeting;
    }
}
