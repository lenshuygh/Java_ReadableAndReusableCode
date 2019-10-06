package classes.coupling;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CouplingExample01_Better {
    //List<String> list = new LinkedList<>();
    List<String> list = new ArrayList<>();

    void doSomething(List<String> list){
        String firstElement = list.get(0);

        // do things with firstElement
    }

    void doSomethingElse(List<String> list){
        String lastElement = list.get(list.size()-1);

        // do things with lastElement
    }
}
