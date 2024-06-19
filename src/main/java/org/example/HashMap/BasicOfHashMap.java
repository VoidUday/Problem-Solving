package org.example.HashMap;

import java.util.HashMap;

public class BasicOfHashMap {
    public static void main(String[] args){
        int[] arr = {12, 5, 65, 23, 7};
        int target = 19;

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int gap = target - arr[i];
            if(map.containsKey(gap)){
                ans[0] = map.get(gap);
                ans[1] = i;
                break;
            }
            map.put(arr[i], i);
        }
        System.out.println((ans[0] + " "+ ans[1]));
    }
}
