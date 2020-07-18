package MedianCalc;

import java.util.Arrays;

/*
 * was doing stats hw and didn't feel like trying to figure out the median of a dataset by hand
 */
public class Median {

    public static void main(String[] args) {
        double[] numArray = {75.9,	71.4,	69.6,	69.0,	68.6,	67.5,	66.7,	66.3,	66.1,	66.0,	66.0,
        65.2,	64.6,	64.3,	63.8,	63.7,	62.8,	62.6,	61.8,	61.8,	61.5,	61.1,
        59.2,	59.0,	58.7,	57.3,	57.1,	55.9,	55.9,	55.5,	55.3,	54.9,	54.7,
        54.5,	54.0,	54.0,	53.8,	53.4,	52.8,	52.5,	50.2,	50.2,	48.9,	48.7,
        48.2,	47.4,	43.4,	40.4,	35.6,	28.4};

        Arrays.sort(numArray);
        double median;
        if (numArray.length % 2 == 0)
            median = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
        else
            median = (double) numArray[numArray.length/2];
        System.out.println(median);
    }
}