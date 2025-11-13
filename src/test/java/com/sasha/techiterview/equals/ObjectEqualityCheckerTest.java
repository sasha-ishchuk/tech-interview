package com.sasha.techiterview.equals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ObjectEqualityCheckerTest {

    @Test
    void testPersonEqualsPerson() {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 30);

        assertThat(
            person1.equals(person2)
        ).isTrue();

        assertThat(
            person2.equals(person1)
        ).isTrue();
    }

    @Test
    void testPassengerEqualsPassenger() {
        Passenger passenger1 = new Passenger("John", 30, "TICKET-777");
        Passenger passenger2 = new Passenger("John", 30, "TICKET-777");

        assertThat(
            passenger1.equals(passenger2)
        ).isTrue();

        assertThat(
            passenger2.equals(passenger1)
        ).isTrue();
    }

    @Test
    void testPersonEqualsPassenger() {
        Person person = new Person("John", 30);
        Passenger passenger = new Passenger("John", 30, "TICKET-777");

        assertThat(
            person.equals(passenger)
        ).isFalse();
    }

    @Test
    void testPassengerEqualsPerson() {
        Passenger passenger = new Passenger("John", 30, "TICKET-777");
        Person person = new Person("John", 30);

        assertThat(
            passenger.equals(person)
        ).isFalse();
    }
}

