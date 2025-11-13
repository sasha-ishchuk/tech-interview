package com.sasha.techiterview.equals;

import java.util.Objects;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person other = (Person) o;
        boolean nameEquals = (this.name == null && other.name == null)
            || (this.name != null && this.name.equals(other.name));
        boolean ageEquals = this.age == other.age;
        return nameEquals && ageEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

