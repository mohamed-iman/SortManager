package com.sparta.mi.display;

import com.sparta.mi.exceptions.SorterLoaderException;
import com.sparta.mi.sorters.RandomArrayGenerator;
import com.sparta.mi.sorters.Sortable;
import org.junit.jupiter.api.Test;
import start.SortFactory;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayManager {

    public static void displayRunner (int chosenNumber) {

        switch (chosenNumber) {
            case 1 -> {
                System.out.println("You have chosen the BinarySort method");
                ;
            }
            case 2 -> {
                System.out.println("You have chosen the BubbleSort method");
                ;
            }
            case 3 -> {
                System.out.println("You have chosen the MergeSort method");
            }
            default -> throw new SorterLoaderException();
        }
    }

    public static int[] displayBeforeSorting(int chosenArraySize){
        System.out.println("Here is the unsorted array generated:");
        int[] array = RandomArrayGenerator.generateArray(chosenArraySize);
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void displayAfterSorting(int chosenNumber, int chosenArraySize) {
        long startTime = System.nanoTime();
        Sortable sortArray = SortFactory.getChosenMethod(chosenNumber);
        String sortedArray = sortArray.getSortedArray(displayBeforeSorting(chosenArraySize));
        long endTime = System.nanoTime();
        System.out.println("Here is the sorted array:");
        System.out.println(sortedArray);
        System.out.println("Time taken = " + (endTime-startTime) + "ns");
    }
}