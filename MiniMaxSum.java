/* https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
//------------------------------------------------------------------------------------------------------------------------------------------
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            int tempSum = 0;
            for(int j=0;j<arr.size();j++){
                if(i!=j)
                {
                    tempSum+=arr.get(j);
                }
            }
            maxSum = Math.max(maxSum,tempSum);
            minSum = Math.min(minSum,tempSum);
        }
        System.out.println(minSum + " " + maxSum);
    }
//------------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
