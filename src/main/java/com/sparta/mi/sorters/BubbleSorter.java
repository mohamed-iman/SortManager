package com.sparta.mi.sorters;

import com.sparta.mi.utility.CustomConfigureLogger;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSorter implements Sortable {
    public static final Logger logger = Logger.getLogger("BubbleSort-logger");
    public BubbleSorter() {
    }

    @Override
    public String getSortedArray(int[] array) {
        return bubbleSorter(array);
    }

    public static String bubbleSorter(int[] bubble) {
        CustomConfigureLogger.configureLogger(logger);

        logger.log(Level.INFO, "BubbleSorter has been initiated!");
        logger.log(Level.INFO, "Unsorted array is " + Arrays.toString(bubble));

        if(bubble.length <2){
            logger.log(Level.INFO, "Sorted array: " + Arrays.toString(bubble));
            return Arrays.toString(bubble);
        }


        for (int i = 0; i < bubble.length; ++i) {
            logger.log(Level.FINE, "Comparing " + bubble[i]);
            for (int j = 1; j < bubble.length; ++j) {
                logger.log(Level.FINER, "With " + bubble[j]);
                if (bubble[j - 1] > bubble[j]) {
                    logger.log(Level.FINEST, bubble[j-1] + " is larger than " + bubble[j] + "-> Commencing swap");
                    int bigNum = bubble[j-1];
                    int smallNum = bubble[j];
                 bubble[j-1] = smallNum;
                 bubble[j] = bigNum;
                }
                logger.log(Level.INFO, "Current array is " + Arrays.toString(bubble));
            }
        }
        logger.log(Level.INFO, "Sorted array: " + Arrays.toString(bubble));
        return Arrays.toString(bubble);
    }

}