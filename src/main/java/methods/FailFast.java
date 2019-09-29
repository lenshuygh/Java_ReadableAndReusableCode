package methods;

public class FailFast {
    public static void main(String[] args) {
        int total = getTotalCompensation(0);

        System.out.println(total);
    }

    private static int getTotalCompensation(int someBonusVariable) {
        //after: check in the beginning of a method for possible division by zero
        if(someBonusVariable <= 0){
            throw new IllegalArgumentException("var cannot be < 0");
        }


        int intermediateResult = getBaseSalary() * someBonusVariable;

        int secondIntermediateResult = converToLocalCurreny(intermediateResult);

        return getSomeOtherMetric() / secondIntermediateResult;
    }

    private static int getSomeOtherMetric() {
        return 100;
    }

    private static int converToLocalCurreny(int intermediateResult) {
        return intermediateResult * 3;
    }

    private static int getBaseSalary() {
        return 3800;
    }
}
