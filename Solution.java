import java.util.*;

class Solution {
    public static int different(int num1, int num2){
        if(num1<num2){
            return num2-num1;
        }
        return num1-num2;
    }
    public static int twoSum(int[] nums, int target) {

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int diff = different(nums[i], target);
             
            boolean isPresent = mp.containsKey(diff);
            if(isPresent){
                mp.put(diff, mp.get(diff)+1);
            }else{
                mp.put(diff, 1);
            }
        }
        for (Map.Entry<Integer, Integer> i : mp.entrySet()) {
            int key = i.getKey();
            int value = i.getValue();
            System.out.println(key + "   " + value);
        }
        return 0;
    }

    public static void main(String args[]){
         
        int[] arr = {2, 7, 11, 15};
        int value = twoSum(arr, 9);
        System.out.println(value);
    }
}