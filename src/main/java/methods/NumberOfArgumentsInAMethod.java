package methods;

import java.time.LocalDateTime;
import java.time.ZoneId;

import static java.time.LocalDate.now;

public class NumberOfArgumentsInAMethod {
    public static void main(String[] args) {
        new NumberOfArgumentsInAMethod();
    }

    public NumberOfArgumentsInAMethod() {
        //too many

        long millisSinceEpoch = nowPlusTime(0, 0, 4);

        new Order().setExpirationDate(millisSinceEpoch);

        //better

        new Order().setExpirationDate(nowPlusDays(4));
    }

    private long nowPlusTime(int months, int weeks, int days) {
        return LocalDateTime.now().plusMonths(months)
                .plusWeeks(weeks)
                .plusDays(days)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    private long nowPlusMonths(int months) {
        return LocalDateTime.now()
                .plusMonths(months)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }


    private long nowPlusWeeks(int weeks) {
        return LocalDateTime.now()
                .plusMonths(weeks)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    private long nowPlusDays(int days) {
        return LocalDateTime.now()
                .plusMonths(days)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    private class Order {
        private long expirationdate;

        public void setExpirationDate(long milisSinceEpoch) {
            this.expirationdate = milisSinceEpoch;
        }
    }
}
