package com.company.dsa.leetcode.array;

import java.util.Arrays;

public class inversion_count {
    static int merge(int a[], int beg, int mid, int end)
    {
        int inversion = 0;
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        /* temporary Arrays */
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg;  /* initial index of merged sub-array */

        while (i < n1 && j < n2)
        {
            if(LeftArray[i] <= RightArray[j])
            {
                inversion++;
                a[k] = LeftArray[i];
                i++;
            }
            else
            {
                inversion++;
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            a[k] = RightArray[j];
            j++;
            k++;
        }
        return inversion;
    }

    static int mergeSort(int a[], int beg, int end)
    {
        int res = 0;
        if (beg < end)
        {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            res = merge(a, beg, mid, end);
        }
        return res-1;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5,6};
        System.out.println("Before : " + Arrays.toString(a));
        int ab = mergeSort(a,0,(a.length-1));
        System.out.println(ab);
        System.out.println("After : " + Arrays.toString(a) );
    }
}
