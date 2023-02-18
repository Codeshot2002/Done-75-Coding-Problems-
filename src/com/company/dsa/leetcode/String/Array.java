package com.company.dsa.leetcode.String;

import java.util.*;

public class Array {
    //best time to buy and sell stock
    public static class prob121 {
        static int best(int[] prices){
            int size = prices.length;
            int profit = 0;
            int min = prices[0];
            for(int i=1; i<size; i++) {
                if (prices[i] < min)
                    min = prices[i];
                else if (prices[i] - min > profit) {
                    profit = prices[i] - min;
                }
                System.out.println("Profit : " + profit);
                System.out.println("min : " + min);
            }
            return profit;
        }
        public static void main(String[] args) {
            int[] a = {2,1};
            System.out.println(best(a));
        }
    }

    //Median of two SOrted Array     DIFF:  HARD
    public static class prob_4 {
        static double median(int[] ar1,int[] ar2){
            double med = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(Integer a:ar1){
                arrayList.add(a);
            }
            for(Integer b:ar2){
                arrayList.add(b);
            }
            Collections.sort(arrayList);
            if(arrayList.size() % 2 == 1){
                med = arrayList.get((int)arrayList.size()/2);
            }
            else {
                med = ((double) arrayList.get((arrayList.size()/2)-1)+ (double)arrayList.get(arrayList.size()/2))/2;
            }
            return med;
        }
        public static void main(String[] args) {
            int[] ar1 = {1,3};
            int[] ar2 = {2};
            System.out.println(median(ar1,ar2));
        }
    }

    public static class prob_13 {
        public static int romanToInt(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            char[] roman = s.toCharArray();
            int num = 0;
            int ans = 0;
            for(int i=0;i<roman.length;i++){
                num = map.get(roman[i]);
                if (4 * num < ans) ans -= num;
                else ans += num;
            }
            return ans;
        }

        public static void main(String[] args) {
            System.out.println(romanToInt("VIX"));
        }
    }

    //3sum diff: med
    public static class prob_15 {
        static List<List<Integer>> threeSum(int[] nums){
            Set<Integer> num = new HashSet<Integer>();
            for(Integer a: nums){
                num.add(a);
            }
            int[] arr = new int[nums.length-1];
            int b = 0;
            for(Integer a : num){
                arr[b++] = a;
            }
            List<List<Integer>> res = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    for(int k = j+1;k<arr.length-1;k++){
                        if(arr[i] + arr[j] + arr[k] == 0){
                            List<Integer> res1 = new ArrayList<>();
                            res1.add(arr[i]);res1.add(arr[j]);res1.add(arr[k]);
                            res.add(res1);
                        }
                    }
                }
            }
            return res;
        }

        public static void main(String[] args) {
            int[] ar = {-1,0,1,2,-1,-4};
            System.out.println(threeSum(ar));
        }
    }

    //remove the duplicates from the array with o(1) space complexity
    public static class prob_26 {
        static int duplicate(int[] nums){
            int k = 0;
            Set<Integer> set = new LinkedHashSet<>();
            for(Integer a:nums){
                set.add(a);
            }
            Iterator<Integer> it = set.iterator();
            k = set.size();
            int i =0;
            while(it.hasNext()){
                nums[i++] = it.next();
            }
            return k;
        }
        static void shiftLeft(int[] arr,int start, int end){
            for(int i=start;i<end;i++){
                int temp = arr[i];
                arr[i-1] = temp;
            }
        }
        static int duplicate2(int[] arr){
            int val = 0;
            int len = arr.length;
            for(int i=0;i<len;i++){
                for(int j=i+1;j<len;j++){
                    if(arr[i] == arr[j]){
                        val++;
                        int temp = arr[j];
                        shiftLeft(arr,j+1,arr.length);
                        arr[arr.length - 1] = temp;
                        len--;
                    }
                }
            }
            System.out.println("val : " + val);
            int k = arr.length-val;
            return k;
        }

        public static void main(String[] args) {
            int[] arr = {1,1,2};
            System.out.println(duplicate2(arr));
            System.out.println(Arrays.toString(arr));
        }
    }

    //remove element
    public static class prob_27 {
        static void shiftLeft(int[] arr,int start, int end){
            for(int i=start;i<end-1;i++){
                arr[i] = arr[i+1];
            }
        }
        static int removeElement(int[] nums, int val) {
            int len = nums.length;
            int k =0;
            for(int i=0;i<len;i++){
                if(nums[i] == val){
                    shiftLeft(nums,i,len);
                    i--;
                    k++;
                }
            }
            return nums.length-k;
        }
        static int removeElement2(int[] nums, int val){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(nums[i] == val ){
                    continue;
                }
                list.add(nums[i]);
            }
            for(int j=0;j<list.size();j++){
                nums[j] = list.get(j);
            }
            return list.size();
        }

        public static void main(String[] args) {
            int[] arr = {1,2,2,3,4};
            //System.out.println(removeElement(arr,2));
            System.out.println(removeElement2(arr,2));
            System.out.println(Arrays.toString(arr));

        }
    }

    //next permutation    diff: medium
    public static class prob_31 {
        static void swap(int[] array,int index1,int index2){
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
        static void nextPermutation(int[] nums){
            ArrayList<Integer> a = new ArrayList<>();
            for(Integer x : nums){
                a.add(x);
            }
            if(a.size()==3){
                if(a.get(2) > a.get(1)){
                    swap(nums,1,2);
                }
                else if(a.get(1) > a.get(2)){
                    swap(nums,0,2);
                }
                else if(a.get(0) > a.get(1)){
                    swap(nums,2,0);
                }
            }
            else if(a.size() == 2){
                swap(nums,0,1);
            }
            else {
                return;
            }
        }

        public static void main(String[] args) {
            int[] ar = {2,1};
            nextPermutation(ar);
            System.out.println(Arrays.toString(ar));
        }
    }

    public static class problem_187 {

    }
}
