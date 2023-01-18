package com.sparta.mi;

import com.sparta.mi.sorters.BubbleSorter;
import com.sparta.mi.sorters.MergeSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class SortTester {

    @Nested
    class BubbleSortTester {
        @Test
        @DisplayName("The test compares sorted array with bubblesort result array")
        public void testBubbleSortingNumbers() {
            BubbleSorter bs = new BubbleSorter();
            int[] numbers = {2, 78, 3, 6, 21, 8, 452, 12, 3};
            String sortedNumbers = "[2, 3, 3, 6, 8, 12, 21, 78, 452]";
            Assertions.assertEquals(sortedNumbers, bs.getSortedArray(numbers));
        }
    }

    @Nested
    class MergeSortTester {
        @Test
        @DisplayName("The test compares sorted array with mergesort result array")
        public void testMergeSortingNumbers() {
            MergeSorter ms = new MergeSorter();
            int[] numbers = {2, 78, 3, 6, 21, 8, 452, 12, 3};
            String sortedNumbers = "[2, 3, 3, 6, 8, 12, 21, 78, 452]";
            Assertions.assertEquals(sortedNumbers, ms.getSortedArray(numbers));
        }
    }

}