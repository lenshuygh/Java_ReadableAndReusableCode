package classes.coupling;

import java.util.LinkedList;

public class CouplingExample01_Start {
    LinkedList<String> list = new LinkedList<>();

    void doSomething(LinkedList<String> list){
        String firstElement = list.getFirst();

        // do things with firstElement
    }

    void doSomethingElse(LinkedList<String> list){
        String lastElement = list.getLast();

        // do things with lastElement
    }
}
