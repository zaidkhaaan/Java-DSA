package Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashingbASICS {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();


        /*
        TO STUDY HASHMAP FUNCTION SIMPLY
        WRITE HM. AND SEE ITS DIFFRENT FUNCTIONS

         */
        //        hm.put(1,"geeks");
//        hm.put(2,"forgeeks");
//        System.out.println(hm);


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//         int[] arr = new int[n];

        /*
        int [] arr={1,2,2,3,3,3};
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);(
            count=1;
        }

         */

        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(ModeFREQ(arr));
//        System.out.println(countFreq(arr,n));

//        Map<Integer,Integer> map = new HashMap<>();
//        map.containsKey();
//        map.put();
//        map.get();
//        map.entrySet();
//        Map.entry();
//
//
//        Map.Entry<Integer,Integer> entry;
//        map.entrySet();
//        entry.getValue();

    }

    static void Frequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    static int countFreq(int arr[], int n) {
        int maxcount = 0;
        int secMaxFreq = 0;

        int mostFrequentElement = -1;
        int secEle = -1;
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (maxcount < count) {
                maxcount = count;
                mostFrequentElement = arr[i];
                secMaxFreq = maxcount;
                secEle = mostFrequentElement;
            } else if (maxcount == count) {
                Math.min(mostFrequentElement, arr[i]);
            } else if (count > mostFrequentElement) {
                secMaxFreq = count;
                secEle = arr[i];
            } else if (count == secMaxFreq) {
                secEle = Math.min(secEle, arr[i]);
            }

        }
        return secEle;
    }

    static int ModeFREQ(int nums[]) {
        // Variable to store the size of array
        int n = nums.length;

        /* Variable to store maximum
        and minimum frequency */
        int maxFreq = 0;
        int minFreq = n;

        // Visited array
        boolean[] visited = new boolean[n];

        // First loop
        for (int i = 0; i < n; i++) {
            // Skip second loop if already visited
            if (visited[i]) continue;

            /* Variable to store frequency
            of current element */
            int freq = 0;

            // Second loop
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                    visited[j] = true;
                }
            }

            /* Update maximum and
            minimum frequencies */
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);

        }

        // Return the required sum
        return maxFreq + minFreq;
    }



/*
if (maxcount < count) {
    maxcount = count;
    mostFrequentElement = arr[i];
    secMaxFreq = maxcount;
    secEle = mostFrequentElement;
} else if (count == maxcount) {
    mostFrequentElement = Math.min(mostFrequentElement, arr[i]);
} else if (count > secMaxFreq) {
    secMaxFreq = count;
    secEle = arr[i];
} else if (count == secMaxFreq) {
    secEle = Math.min(secEle, arr[i]);
}
 */
}