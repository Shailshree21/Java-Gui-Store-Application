package com.mangaverse.controllers;

public class BinarySearchManga {

    /**
     * Search for a string value in a sorted array using binary search.
     *
     * @param arr       The sorted array of strings to be searched.
     * @param low       The lowest index in the search range.
     * @param high      The highest index in the search range.
     * @param searchKey The string value to be searched in the array.
     * @return The index of the searchKey in the array, or -1 if not found.
     */
    
    public int searchValue(String[] arr, int low, int high, String searchKey) {
        if (high >= low) {
            // Calculate the middle index of the current search range
            int mid = low + (high - low) / 2;

            // If the element is present at the middle itself
            if (arr[mid].equals(searchKey))
                return mid;

            // If the element is smaller than mid, then it can only be present in the left subarray
            if (arr[mid].compareTo(searchKey) > 0)
                return searchValue(arr, low, mid - 1, searchKey);
            
            // Else the element can only be present in the right subarray
            return searchValue(arr, mid + 1, high, searchKey);
        }
        // Element is not present in the array
        return -1;
    }

    /**
     * Search for an integer value in a sorted array using binary search.
     *
     * @param arr       The sorted array of integers to be searched.
     * @param low       The lowest index in the search range.
     * @param high      The highest index in the search range.
     * @param searchKey The integer value to be searched in the array.
     * @return The index of the searchKey in the array, or -1 if not found.
     */
    public int searchByID(int[] arr, int low, int high, int searchKey) {
        if (high >= low) {
            // Calculate the middle index of the current search range
            int mid = (low + high) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == searchKey)
                return mid;

            // If the element is smaller than mid, then it can only be present in the left subarray
            if (arr[mid] > searchKey) {
                return searchByID(arr, low, mid - 1, searchKey);
            }
            // Else the element can only be present in the right subarray
            return searchByID(arr, mid + 1, high, searchKey);
        }
        // Element is not present in the array
        return -1;
    }
}
