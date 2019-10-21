/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearandbinsearch;

/**
 *
 * @author jeppjleemoritzled
 */
public class LinearAndBinSearch {

    private static int searchLinear(int[] arr, int searchNumber){
        // Linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                return i;
            }
        }
        return -1;
    }
    
    private static int searchBinary(int[] arr, int searchNumber, int start, int end){
        int mid = start + (end-start)/2;
        
        if(arr[mid]>searchNumber)
        {
            return searchBinary(arr, searchNumber, start, mid-1);
        }
        else if(arr[mid]<searchNumber){
            return searchBinary(arr, searchNumber, mid+1, end);
        }
        else if(arr[mid]==searchNumber){
            return mid;
        }
        return -1;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 8, 9, 11, 21, 27, 31, 80};
        System.out.println("Rhello cruel world!");
        System.out.println("Element number 4: " + numbers[4]);
        
        int index = searchBinary(numbers, 27, 0, numbers.length-1);
        if(index==-1){
            System.out.println("These are not the droids you are looking for! (Waves hand)");
        }
        else{
            System.out.println("81 is at: " + index);
        }
    }

}
