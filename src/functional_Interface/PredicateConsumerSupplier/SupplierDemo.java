package functional_Interface.PredicateConsumerSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
//    @Override
//    public String get() {
//        return "Hello World";
//    }

    public static void main(String[] args) {

        Supplier<String> supplier=() -> {
            return "Hello World";
        };
//      Supplier<String> supplier = new SupplierDemo();

//        System.out.println(supplier.get());

//        List<String> list = Arrays.asList("a", "b", "c");
        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}
