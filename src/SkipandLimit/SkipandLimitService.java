package SkipandLimit;

import javax.swing.text.Document;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipandLimitService {

    public static void main(String[] args) throws IOException {

        List<Integer>  list = Arrays.asList(1, 2, 3, 1, 5, 9, 7, 8, 9, 1);
        List<Integer>  skipinput = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Distinct the list
        List<Integer> integerList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(integerList);

        List<Integer> skipoutput = skipinput.stream().skip(2).limit(7).collect(Collectors.toList());
        System.out.println(skipoutput);

        List<String> FileReading = Files.readAllLines(Paths.get("Document.txt"));
        FileReading.stream().skip(1).limit(5).forEach(System.out::println);


    }

}
