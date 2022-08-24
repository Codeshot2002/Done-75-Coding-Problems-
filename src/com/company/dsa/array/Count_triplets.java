package com.company.dsa.array;
/*Count the triplets
    Problem #2 of GFG must do
 */
public class Count_triplets {
    static boolean check(int[] arr, int target){   //this will traverse all the elements to check the presence of target in the array
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    static int count(int[] arr, int n){
        int c = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(check(arr, (arr[i]+arr[j]))){
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,2};
        System.out.println(count(arr,arr.length));
    }
}
