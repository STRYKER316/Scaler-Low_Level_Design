package constructorChaning;

public class D extends C {
    D() {
//        super();    // super() implies that execute the constructor of the parent class
        super("GG");
//        super(5);
        System.out.println("Constructor1 of D");
    }

    D(String name) {
        super(name);
        System.out.println("Constructor2 of D");
    }

}
