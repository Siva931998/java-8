package MapandReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapandReduceService {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(3,4,1,5,9,2,7);

        int inputsum = input.stream().mapToInt(i -> i).sum();
        System.out.println(inputsum);

        Integer inputsumofreducemethod = input.stream().reduce(0, (a, b) -> a + b);

        System.out.println(inputsumofreducemethod);

        int reduceusingreferencemehtods = input.stream().reduce(Integer::sum).get();

        System.out.println(reduceusingreferencemehtods);


        Integer maxinput = input.stream().reduce((a, b) -> a > b ? a : b).get();
        System.out.println(maxinput);

        Optional<Integer> reduce = input.stream().reduce(Integer::max);
        System.out.println(reduce.get());

        List<String>  stringlist = Arrays.asList("hello","buddy","welcome","hi","javascript");

        String lengthstringlist = stringlist.stream().reduce((i, j) -> i.length() > j.length() ? i : j).get();
        System.out.println(lengthstringlist);



    }

}
