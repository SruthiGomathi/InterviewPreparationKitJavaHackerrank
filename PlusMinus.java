/https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int positiveNumberCount = 0, negativeNumberCount = 0, zeroCounter = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0)
                ++positiveNumberCount;
            else if(arr.get(i)<0)
                ++negativeNumberCount;
            else 
                ++zeroCounter;
        }
        System.out.printf("%.6f\n",(float)positiveNumberCount/arr.size());
        System.out.printf("%.6f\n",(float)negativeNumberCount/arr.size());
        System.out.printf("%.6f",(float)zeroCounter/arr.size());
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
