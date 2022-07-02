/*https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String updatedString="";
        if(s.charAt(8) == 'P'){
            if(!s.substring(0,2).equals("12")){
                int hour = Integer.parseInt(s.substring(0,2)) + 12;
                System.out.println(hour);
                updatedString = Integer.toString(hour) + s.substring(2,8);
            }
            else{
                updatedString = s.substring(0,8);
            }
        }
        else{
            if(s.substring(0,2).equals("12")){
                updatedString = "00"+s.substring(2,8);
            }
            else{
                updatedString = s.substring(0,8);
            }
        }
        return updatedString;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
