package constructorChaning;

public class C extends B {

    C() {
        System.out.println("Constructor of C");
    }

    C(String str) {
        System.out.println("Parameterized constructor_1 of C");
    }

    C(int val) {
        System.out.println("Parameterized constructor_2 of C");
    }
}
