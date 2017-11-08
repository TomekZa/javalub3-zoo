package pl.sdacademy.animals.bear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void bearShouldBeAliveIfHasEatenWithin10Days() {
        Bear bear = new BlackBear(1);
        bear.eat();

        boolean result = bear.isAlive();

        assertTrue(result == true);
    }

    @Test
    void isHibernating() {

        Bear bearHibernating = new BlackBear(3);
    }

}