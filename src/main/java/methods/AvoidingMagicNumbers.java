package methods;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class AvoidingMagicNumbers {
    public static void main(String[] args) {
        //before
        long millisSinceEpoch = nowPlusTime(0,0,5);
        new Order().setExpirationDate(millisSinceEpoch);

        // after
        int moths = 0;
        int weeks = 0;
        int days = 4;

        millisSinceEpoch = nowPlusTime(moths,weeks,days);
        new Order().setExpirationDate(millisSinceEpoch);
    }

    private static long nowPlusTime(int months, int weeks, int days) {
        return LocalDateTime.now().plusMonths(months)
                .plusWeeks(weeks)
                .plusDays(days)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }



    static class Order {
        private long expirationdate;

        public void setExpirationDate(long milisSinceEpoch) {
            this.expirationdate = milisSinceEpoch;
        }
    }

}
