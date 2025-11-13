package com.sasha.techiterview.frequency;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class FrequencyCounterTest {

    private final FrequencyCounter underTest = new FrequencyCounter();

    @Test
    void shouldFindTop1FrequentTypeOfAnimals() {
        List<Animal> animals = List.of(
            new Animal(Type.DOG, "Buddy", 3),
            new Animal(Type.CAT, "Fluffy", 1),
            new Animal(Type.CAT, "Max", 5)
        );
        int n = 1;

        List<Type> expected = List.of(Type.CAT);

        List<Type> result = underTest.findTopNFrequentTypeOfAnimals(animals, n);

        assertThat(result)
            .isNotNull()
            .isNotEmpty()
            .hasSize(n)
            .isEqualTo(expected);
    }

    @Test
    void shouldFindTop2FrequentTypeOfAnimals() {
        List<Animal> animals = List.of(
            new Animal(Type.DOG, "Max", 5),
            new Animal(Type.CAT, "Luna", 4),
            new Animal(Type.HORSE, "Kiwi", 1),
            new Animal(Type.DOG, "Bubbles", 2),
            new Animal(Type.HORSE, "Star", 7),
            new Animal(Type.DOG, "Rocky", 6)
        );
        int n = 2;

        List<Type> expected = List.of(Type.DOG, Type.HORSE);

        List<Type> result = underTest.findTopNFrequentTypeOfAnimals(animals, n);

        assertThat(result)
            .isNotNull()
            .isNotEmpty()
            .hasSize(n)
            .isEqualTo(expected);
    }

    @Test
    void shouldFindTop3FrequentTypeOfAnimals() {
        List<Animal> animals = List.of(
            new Animal(Type.DOG, "Rocky", 6),
            new Animal(Type.HORSE, "Thunder", 9),
            new Animal(Type.CAT, "Snowball", 4),
            new Animal(Type.DOG, "Charlie", 5),
            new Animal(Type.CAT, "Simba", 2),
            new Animal(Type.HORSE, "Rio", 3),
            new Animal(Type.HORSE, "Blue", 1),
            new Animal(Type.DOG, "Bubbles", 2),
            new Animal(Type.HORSE, "Star", 7)
        );
        int n = 3;

        List<Type> expected = List.of(Type.HORSE, Type.DOG, Type.CAT);

        List<Type> result = underTest.findTopNFrequentTypeOfAnimals(animals, n);

        assertThat(result)
            .isNotNull()
            .isNotEmpty()
            .hasSize(n)
            .isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyListWhenAnimalsListIsEmpty() {
        List<Animal> animals = List.of();
        int n = 3;

        List<Type> result = underTest.findTopNFrequentTypeOfAnimals(animals, n);

        assertThat(result)
            .isNotNull()
            .isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenAnimalsListIsNull() {
        int n = 3;
        List<Type> result = underTest.findTopNFrequentTypeOfAnimals(null, n);

        assertThat(result)
            .isNotNull()
            .isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenN0() {
        List<Animal> animals = List.of(
            new Animal(Type.DOG, "Max", 5),
            new Animal(Type.CAT, "Luna", 4),
            new Animal(Type.DOG, "Bubbles", 2)
        );
        int n = 0;

        List<Type> result = underTest.findTopNFrequentTypeOfAnimals(animals, n);

        assertThat(result)
            .isNotNull()
            .isEmpty();
    }
}
