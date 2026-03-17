import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
    List<Integer> ans = new ArrayList<>();
    
    HashMap<Integer , Integer> hm1 = new HashMap<>();
    HashMap<Integer , Integer> hm2 = new HashMap<>();
    
    int n = arr.size();
    int m = brr.size();
    
    for (int i=0; i<n; i++){
        int val1 = arr.get(i);
        if (hm1.containsKey(val1) == true){
            hm1.put(val1 , hm1.get(val1)+1);
        } else {
            hm1.put(val1 , 1);
        }  
    }
    
    for (int i=0; i<m; i++){
        int val2 = brr.get(i);
        if (hm2.containsKey(val2) == true){
            hm2.put(val2 , hm2.get(val2)+1);
        } else {
            hm2.put(val2 , 1);
        }
    }
    
    for (int key : hm2.keySet()){
        int countInArr = hm1.getOrDefault(key , 0);
        int countInBrr = hm2.get(key);
        
        if(countInBrr > countInArr){
            ans.add(key);
        }
    }
    Collections.sort(ans);
    return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
