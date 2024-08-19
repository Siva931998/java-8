package ParallelStream;

import java.util.stream.IntStream;

public class PlainandParalledStreamService {

    public static void main(String[] args) {

        long Starttime = 0;
        long Endtime = 0;

       /* //plain stream
        Starttime = System.currentTimeMillis();
        IntStream.range(0,100).forEach(i-> System.out.println(i));
        Endtime = System.currentTimeMillis();

        System.out.println("processing Time: " + (Endtime - Starttime));

        System.out.println("*****************************************************");

        //parallel stream
        Starttime = System.currentTimeMillis();
        IntStream.range(0,100).parallel().forEach(i-> System.out.println(i));
        Endtime = System.currentTimeMillis();

        System.out.println("processing Time: " + (Endtime - Starttime));*/


        Starttime = System.currentTimeMillis();
        IntStream.range(1,10).forEach(x->{
            System.out.println("plain stream took time " + Thread.currentThread().getName() +" : "+ x);
        });
        Endtime = System.currentTimeMillis();

        System.out.println("processing Time: " + (Endtime - Starttime));

        Starttime = System.currentTimeMillis();
        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("parallel stream took time " + Thread.currentThread().getName() +" : "+ x);
        });
        Endtime = System.currentTimeMillis();

        System.out.println("processing Time: " + (Endtime - Starttime));


    }

}
