package methods;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class RefactorDuplicates {
    private long nowPlusMonths(int months) {
        if (months <= 0){
            throw new IllegalArgumentException("months cannot be < 0");
        }
        /*return LocalDateTime.now()
                .plusMonths(months)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();*/
        return toEpochMilli(LocalDateTime.now().plusMonths(months));
    }


    private long nowPlusWeeks(int weeks) {
        if (weeks <= 0){
            throw new IllegalArgumentException("weeks cannot be < 0");
        }
        /*return LocalDateTime.now()
                .plusMonths(weeks)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();*/
        return toEpochMilli(LocalDateTime.now().plusWeeks(weeks));
    }

    private long nowPlusDays(int days) {
        if (days <= 0){
            throw new IllegalArgumentException("days cannot be < 0");
        }
        /*return LocalDateTime.now()
                .plusMonths(days)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();*/
        return toEpochMilli(LocalDateTime.now().plusDays(days));
    }

    private long toEpochMilli(LocalDateTime time){
        return time.atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }
}
