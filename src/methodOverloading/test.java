package methodOverloading;

public class test {
    int doSomething() {
        System.out.println("Do stuff without params");
        return 1;
    }

    int doSmoething(String a) {
        return 1;
    }

//    String doSomething() {                // not overloaded, as method have the same signature
//        System.out.println("Do stuff without params");
//        return "";
//    }

}
