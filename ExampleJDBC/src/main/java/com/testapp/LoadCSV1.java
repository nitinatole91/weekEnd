package com.testapp;

import java.util.TreeSet;

public class LoadCSV1 {
	
	public static void main(String[] args) {
//		1.	Find the second largest element in an array.
		int[] arr = {4, 7, 1, 9, 2, 5, 9};
		// Step 1: Use TreeSet for unique & sorted elements
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        Integer largest = set.pollLast();  // Remove and get the largest
        Integer secondLargest = set.pollLast(); 
        System.out.println("Second largest element: " + secondLargest);
        
//        2.	Remove duplicates from an array.
        
        int[] arr2 = {4, 7, 1, 9, 2, 5, 9};
		// Step 1: Use TreeSet for unique & sorted elements
        TreeSet<Integer> remove = new TreeSet<>();
        for (int num : arr2) {
            set.add(num);
        }
        set.forEach(o->System.out.println(o));
        
        
//        3.	Sort an array without using Arrays.sort().
        int[] arr3 = {4, 7, 1, 9, 2, 5, 9};
        // Selection sort
        for (int i = 0; i < arr3.length - 1; i++) {
        	int temp1=i;
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[j] < arr3[temp1]) {
                   temp1= j;
                }
            }
            int temp = arr3[temp1];
            arr3[temp1] = arr3[i];
            arr3[i] = temp;
        }
        System.out.println("Sorted Array:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        
//        4.	Find the common elements in two integer arrays.
        int[] arrA = {1, 2, 3, 4, 5};
        int[] arrB = {3, 4, 5, 6, 7};
        System.out.print("Common elements:\n ");
        for (int i = 0; i < arrA.length; i++) {
            if (contains(arrB, arrA[i])) {
                System.out.print(arrA[i] + " ");
            }
        }
//        5.	Rotate an array by k positions (right rotation).
        rotateRightNaive(arrB, 3);
	}
	
	public static boolean contains(int[] arr , int key) {
        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }
	
//	5.	Rotate an array by k positions (right rotation).
	public static void rotateRightNaive(int[] arr, int k) {
	    int n = arr.length;
	    k = k % n; // handle k > n
	    for (int i = 0; i < k; i++) {
	        int last = arr[n - 1];
	        for (int j = n - 1; j > 0; j--) {
	            arr[j] = arr[j - 1];
	        }
	        arr[0] = last;
	    }
	}

}
