package com.sparta.mi;

import com.sparta.mi.sorters.BinarySorter;
import com.sparta.mi.sorters.BubbleSorter;
import com.sparta.mi.sorters.MergeSorter;
import com.sparta.mi.sorters.Sortable;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PerformanceTester {

    private static int[] inputArray;

    public static int[] generateArray() {
        Random random = new Random();
        inputArray = new int[100];
        for (int i = 0; i < 100; i++) {
            inputArray[i] = random.nextInt(1000);
        }
        return inputArray;
    }

    int[] testArray = PerformanceTester.generateArray();

        @Test
        public void BinarySortTester(){
            Sortable sortable = new BinarySorter();
            long startTime  = System.nanoTime();
            String sortedArray = sortable.getSortedArray(testArray);
            long endTime  = System.nanoTime();
            System.out.println(sortedArray + "\n" + "Time taken for BinarySort: " + (endTime-startTime) + "ns");
         }

        @Test
        public void bubbleSortTester(){
            Sortable sortable = new BubbleSorter();
            long startTime  = System.nanoTime();
            String sortedArray = sortable.getSortedArray(testArray);
            long endTime  = System.nanoTime();
            System.out.println(sortedArray + "\n" + "Time taken for Bubblesort: " + (endTime-startTime) + "ns");
        }


        @Test
        public void MergeSortTester(){
            Sortable sortable = new MergeSorter();
            long startTime  = System.nanoTime();
            String sortedArray = sortable.getSortedArray(testArray);
            long endTime  = System.nanoTime();
            System.out.println(sortedArray + "\n" + "Time taken for Mergesort: " + (endTime-startTime) + "ns");
        }


    }
