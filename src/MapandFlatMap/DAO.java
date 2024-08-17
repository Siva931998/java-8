package MapandFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DAO {
    public static List<Customer> getCustomersDetails() {
        return Stream.of(
                new Customer(101, "siva",26,"siva@gmail.com", Arrays.asList("2939495022","2932220221")),
                new Customer(102, "gopi",22,"gopi@gmail.com", Arrays.asList("3294239484","3950350934")),
                new Customer(103, "suga",27,"suga@gmail.com", Arrays.asList("9349543855","3934923999")),
                new Customer(104, "theju",31,"theju@gmail.com", Arrays.asList("4594395433","9398383292")),
                new Customer(105, "mama",20,"mama@gmail.com", Arrays.asList("8459348548","9394983598")),
                new Customer(106, "mapla",18,"mapla@gmail.com", Arrays.asList("9348594584","8459359544"))
        ).collect(Collectors.toList());
    }
}
