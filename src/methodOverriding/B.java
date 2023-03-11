package methodOverriding;

public class B extends A {
    @Override
    void doSomething() {
//        super.doSomething();
        System.out.println("This is from within B");
    }
}
