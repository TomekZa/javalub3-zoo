package pl.sdacademy.animals.bear;

import org.joda.time.LocalDate;
import pl.sdacademy.clock.Clock;

public class BlackBear extends Bear {
    public BlackBear(int weight, Clock clock) {
        super(weight, clock);
    }

    @Override
    public boolean isHibernating() {
        new LocalDate(clock.getCurrentTime().getYear(), 11, 20);
        
        return false;
    }

    public BlackBear(int weight) {
        super(weight);
    }
}