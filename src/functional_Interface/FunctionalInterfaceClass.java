package functional_Interface;

@FunctionalInterface
public interface FunctionalInterfaceClass {
     void m1();

    default void m3(){
        System.out.println("m3");
    }
    default void m4(){
        System.out.println("m4");
    }
}
