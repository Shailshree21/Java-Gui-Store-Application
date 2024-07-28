/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mangaverse.controllers;

import com.mangaverse.models.MangaModel;

/**
 *
 * @author user
 */
public class MergeSortManga {

    /**
     * Default constructor for the MergeSortManga class.
     */
    
    public MergeSortManga() {
    }

    /**
     * Sorts an array of MangaModel objects using the merge sort algorithm.
     * The sorting criteria are specified by the 'sort' parameter.
     * 
     * @param model An array of MangaModel objects to be sorted.
     * @param sort The sorting criteria, such as "S.N" for Serial Number, "Title" for Title, etc.
     */
    public void sort(MangaModel[] model, String sort) {
        //If the array has one or zero elements, it is already sorted
        if (model.length <= 1) {
            return;
        }
        
        // Divide the array into two halves
        MangaModel[] first = new MangaModel[model.length / 2];
        MangaModel[] second = new MangaModel[model.length - first.length];

        // Copy elements to the first and second halves
        for (int i = 0; i < first.length; i++) {
            first[i] = model[i];
        }

        for (int i = 0; i < second.length; i++) {
            second[i] = model[first.length + i];
        }

        // Recursively sort each hal
        sort(first, sort);
        sort(second, sort);
        
        // Merge the sorted halves
        merge(first, second, model, sort);
    }

   /**
     * Merges two sorted arrays into a single sorted array.
     * The criteria for sorting are specified by the 'sort' parameter.
     * 
     * @param first The first sorted array.
     * @param second The second sorted array.
     * @param mainArray The array to store the merged result.
     * @param sort The sorting criteria, such as "S.N" for Serial Number, "Title" for Title, etc.
    */
    public void merge(MangaModel[] first, MangaModel[] second, MangaModel[] mainArray, String sort) {
        int firstCounter = 0;
        int secondCounter = 0;
        int mainArrayCounter = 0;
        int comparision;

        // Merge elements from the two arrays based on the specified sorting criteria
        while (firstCounter < first.length && secondCounter < second.length) {
            switch (sort) {
                case "S.N":
                    comparision = Integer.compare(first[firstCounter].getSerialNumber(), second[secondCounter].getSerialNumber());
                    break;

                case "Title":
                    comparision = first[firstCounter].getTitle().compareToIgnoreCase(second[secondCounter].getTitle());
                    break;

                case "Author":
                    comparision = first[firstCounter].getAuthor().compareToIgnoreCase(second[secondCounter].getAuthor());
                    break;
                
                case "Total_Chapter":
                    comparision = Integer.compare(first[firstCounter].getTotalChapter(), second[secondCounter].getTotalChapter());
                    break;
                    
                case "Rating":
                    comparision = Double.compare(first[firstCounter].getRating(), second[secondCounter].getRating());
                    break;
                    
                case "Status":
                    comparision = first[firstCounter].getStatus().compareToIgnoreCase(second[secondCounter].getStatus());
                    break;

                case "Publisher":
                    comparision = first[firstCounter].getPublisher().compareToIgnoreCase(second[secondCounter].getPublisher());
                    break;

                case "Release_Date":
                    comparision = first[firstCounter].getReleaseDate().compareToIgnoreCase(second[secondCounter].getReleaseDate());
                    break;
                default:
                    // Handle unexpected case
                    return;
            }
           
            // Place the smaller element in the main array
            if (comparision < 0) {
                mainArray[mainArrayCounter] = first[firstCounter];
                firstCounter++;
            } else {
                mainArray[mainArrayCounter] = second[secondCounter];
                secondCounter++;
            }

            mainArrayCounter++;
        }

        // Copy any remaining elements from the first and second arrays
        while (firstCounter < first.length) {
            mainArray[mainArrayCounter] = first[firstCounter];
            firstCounter++;
            mainArrayCounter++;
        }

        while (secondCounter < second.length) {
            mainArray[mainArrayCounter] = second[secondCounter];
            secondCounter++;
            mainArrayCounter++;
        }
    }
}
