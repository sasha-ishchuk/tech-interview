package com.sasha.techiterview.systemevent;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class TimeInSystemCounterTest {

    private final TimeInSystemCounter underTest = new TimeInSystemCounter();

    @Test
    void calculateTimeInSystem() {
        List<SystemEvent> events = List.of(
            new SystemEvent(2, 1, "10:54", "11:08"),
            new SystemEvent(3, 2, "14:34", "15:08"),
            new SystemEvent(3, 1, "21:01", "21:33"),
            new SystemEvent(3, 1, "10:54", "11:08"),
            new SystemEvent(2, 3, "21:00", "00:08"),
            new SystemEvent(1, 3, "23:42", "01:58")
        );

        List<User> expected = List.of(
            new User(2, 202),
            new User(1, 136),
            new User(3, 80)
        );

        List<User> actual = underTest.calculateTimeInSystem(events);

        assertThat(actual)
            .isNotNull()
            .isNotEmpty()
            .isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyListWhenInputIsEmpty() {
        assertThat(underTest.calculateTimeInSystem(Collections.emptyList()))
            .isNotNull()
            .isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenInputIsNull() {
        assertThat(underTest.calculateTimeInSystem(null))
            .isNotNull()
            .isEmpty();
    }
}
