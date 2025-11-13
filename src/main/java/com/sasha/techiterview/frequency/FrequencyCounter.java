package com.sasha.techiterview.frequency;

import java.util.List;

/**
 * Implement the method {@link #findTopNFrequentTypeOfAnimals(List, int)}.
 *
 * <p>
 * Goal: find the top N most frequent animal types in the given list.
 * The returned list should contain the types ordered by their frequency (from most to least frequent).
 *
 * <p>
 * Try to use Java Streams where possible.
 *
 * <p>
 * Example 1:
 * n = 1
 * animals = [(Type.DOG, "Buddy", 3), (Type.CAT, "Fluffy", 1), (Type.CAT, "Max", 5)]
 * Expected result: [Type.CAT]
 *
 * <p>
 * Example 2:
 * n = 2
 * animals = [(Type.DOG, "Max", 5), (Type.CAT, "Luna", 4), (Type.HORSE, "Kiwi", 1),
 *          (Type.DOG, "Bubbles", 2), (Type.HORSE, "Star", 7), (Type.DOG, "Rocky", 6)]
 * Expected result: [Type.DOG, Type.HORSE]
 *
 * <p>
 * Notes:
 *  1) different types always has different frequency in input list
 *  2) 0 <= n <= number of distinct animal types
 *  3) no need to modify the Animal or Type classes
 */

public class FrequencyCounter {

    public List<Type> findTopNFrequentTypeOfAnimals(List<Animal> animals, int n) {
        // implement solution here
        return null;
    }
}
