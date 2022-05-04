package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,3,6,2,8,3};
        /*mergeSort(array);*/
        /*quickSort(array, 0, array.length-1);*/
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /*private static void quickSort(int[] array, int start, int ending) {
        if(ending<=start){return;}

        int pivot = partition(array,start,ending);
        quickSort(array,start,pivot-1);
        quickSort(array,pivot+1,ending);

        }

    private static int partition(int[] array, int start, int ending) {
        int pivot = array[ending];
        int i = start-1;

        for(int j = start; j<= ending -1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[ending];
        array[ending] = temp;

        return i;
    }*/





    /*private static void mergeSort(int[] array){
        int length = array.length;

        if(length <= 1){return;}

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        int i = 0; //left array
        int j = 0; // right array

        for(; i<length; i++){
            if(i<middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i=0,l=0,r=0; //indices

        // check the conditions for merging
        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }*/









    ///////////////////////////////////////////////////////////
    /*private static int binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length;

        while(low <= high){

            int middle = low+(high-low)/2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if(value < target)
                low = middle++;
            else if (value > target)
                high = middle--;
            else return middle;
        }
        return -1;
    }*/
    ///////////////////////////////////////////////////////////
}
