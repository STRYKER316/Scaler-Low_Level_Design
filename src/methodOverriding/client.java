package methodOverriding;

public class client {
    public static void main(String[] args) {
        B b = new B();
        b.doSomething();

        A a1 = new B();
        a1.doSomething();

        A a2 = new A();
        a2.doSomething();
    }
}
