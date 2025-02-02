package com.gdn.onboarding.day1.gdnDay1.BubbleSort;

public class BubbleSort {
    public int[] bubbleSort(int[] arr)
    {
        if(arr==null){
            throw new IllegalArgumentException("array must not be null");
        }
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }
}
