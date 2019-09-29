package methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RetunEmptyListInSteadOfNullPointerException {
    List<String> getSampleData(){
        try{
            return Arrays.asList("one","two");
        }catch (Exception e){
            return Collections.emptyList();
        }
    }
}
