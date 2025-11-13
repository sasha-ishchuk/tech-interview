package com.sasha.techiterview.equals;

import java.util.Objects;

public class Passenger extends Person {

    String ticketNumber;

    public Passenger(String name, int age, String ticketNumber) {
        super(name, age);
        this.ticketNumber = ticketNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Passenger)) {
            return false;
        }
        Passenger other = (Passenger) o;
        boolean nameEquals = (this.name == null && other.name == null)
            || (this.name != null && this.name.equals(other.name));
        boolean ageEquals = this.age == other.age;
        boolean ticketNumberEquals = (this.ticketNumber == null && other.ticketNumber == null)
            || (this.ticketNumber != null && this.ticketNumber.equals(other.ticketNumber));
        return nameEquals && ageEquals && ticketNumberEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ticketNumber);
    }
}
