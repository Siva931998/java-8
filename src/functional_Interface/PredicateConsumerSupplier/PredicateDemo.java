package functional_Interface.PredicateConsumerSupplier;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo  {
   /* @Override
    public boolean test(Integer i) {

        if(i%2==0){
            return true;
        }else{
            return false;
        }
    }*/

    public static void main(String[] args) {
        /*Predicate<Integer> predicate=( i)-> {
            if(i%2==0){
                return true;
            }else{
                return false;
            }
        };*/

       /* Predicate<Integer> predicate=( i)-> i%2==0;
        System.out.println(predicate.test(3));*/

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream().filter(t ->t%2==0).forEach(t -> System.out.println("printing even: " + t));
    }
}
