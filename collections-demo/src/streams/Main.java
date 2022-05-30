package streams;

import java.util.List;

public class Main {


    public static String doSomething(String name, String prefix) {
        return prefix + name + " Doe";
    }

    public static void main(String[] args) {

        List<String> namen = List.of("Bob", "Jane", "John", "Alice", "Kate", "Jasper");


        //  (name) ->  name.length > 2
        //
        // (x, y) -> x + y

        // (2, 3) ====> 5

        // (x, y) -> {
        //    int z = getSomeOtherValue()
        //    return x+ y + z;
        // }
        //
        //


        List<String> newList = namen.stream()
                .filter(name -> {
                    if (name.startsWith("B")) {
                        return true;
                    } else return name.startsWith("A");
                })
                .toList();


        List<String> nameString = namen.stream()
                //      Bob       false --> filter out
                //      Jane       true --> keep
                //      John       true --> keep
                //     Alice       false --> filter
                //      Kate        false --> filter
                .filter(name -> name.startsWith("J"))
                .filter(name -> name.length() <= 4)
                //    Jane --> JANE
                //    John --> JOHN
                .map(String::toUpperCase)
                .toList();


        List<String> nameString2 = namen.stream()
                .filter(name -> name.startsWith("J"))
                .filter(name -> name.length() <= 4)
                .map(String::toUpperCase)
                .toList();

    }
}
