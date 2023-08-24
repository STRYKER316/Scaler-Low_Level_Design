package methodOverloading;

public class test {
    int doSomething() {
        System.out.println("Do stuff without params");
        return 1;
    }

//    String doSomething() {                // not overloaded, as the method have the same signature
//        System.out.println("Do stuff without params");
//        return "";
//    }

    int doSomething(String a) {
        System.out.println("Do stuff with params");
        return 1;
    }
}
