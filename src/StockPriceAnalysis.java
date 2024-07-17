import java.util.ArrayList;
import java.util.Arrays;

public class StockPriceAnalysis {
    //Calculating average stock price
    public static double calculateAveragePrice(int[] stockPrices) {
        int sum = 0;    //initialize sum as 0
        for (int price : stockPrices) { //for any price inside the stockPricesArray
            sum += price;               // we add it to the sum we already have
        }
        return (double) sum / stockPrices.length;   // calculating average by dividing the number of prices by the sum
    }

    // Calculating stock price
    public static int findMaximumPrice(int[] stockPrices) {     // setting the stockPriceArray as the argument
        int maxPrice = stockPrices[0];      //initialize maxPrice with the first element of the array
        for (int price : stockPrices) {
            if (price > maxPrice) {     
                maxPrice = price;       // we set that price which is higher than the maxPrice as the new maxPrice
            }
        }
        return maxPrice;        // return the final maxPrice
    }

    // Calculating the occurence of a specific price
    public static int countOccurrences(int[] stockPrices, int targetPrice) {    // specifies that it takes stockPrices and targetPrice as arguments
        int count = 0;      // initialize count variable as zero
        for (int price : stockPrices) { //for any price inside the stockPricesArray
            if (price == targetPrice) { // compare is it is the target price
                count++;                // increment the count when price matches the targetPrice
            }
        }
            return count;               // return the counts of occurences of targetPrice
    }

    // Calculating the cumulative sum of stock prices
    public static ArrayList<Integer> computeCumulativeSum(ArrayList<Integer> stockPrices) { // specify argument as an int ArrayList
        ArrayList<Integer> cumulativeSum = new ArrayList<>();       // initialize an empty arrayList
        int sum = 0;            // initialize sum to zero
        for (int price : stockPrices) {     //iterate through the arrayList
            sum += price;               // add each price to the sum
            cumulativeSum.add(sum);     // add the sum to the cummulativeSum arrayList
        }
        return cumulativeSum;       // return the cummulative array List
    }

    //main class
    public static void main(String[] args) {
        int[] stockPricesArray = {201, 105, 302, 201, 110, 108, 77, 201, 515, 920};    //initializing our array as int
        ArrayList<Integer> stockPricesList = new ArrayList<>(Arrays.asList(201, 105, 302, 201, 110, 108, 77, 201, 515, 920)); //initializing our ArrayList as int

        // assigning varous data type for various variables for our 4 methods
        double averagePrice = calculateAveragePrice(stockPricesArray);  // takes the stockPriceArray as input
        int maxPrice = findMaximumPrice(stockPricesArray);      //same
        int occurrenceCount = countOccurrences(stockPricesArray, 201);  // takes the array as well as a target price set at 201
        ArrayList<Integer> cumulativeSum = computeCumulativeSum(stockPricesList);   // takes the  ArrayList as input

        // Display various outputs for our methods
        System.out.println("Welcome to the SUPERJCYBS Stock Price Analysing System");   // greeting message
        System.out.println("Average Stock Price: " + averagePrice);
        System.out.println("Maximum Stock Price: " + maxPrice);
        System.out.println("Occurrences of Price 210: " + occurrenceCount);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSum);
    }
}
