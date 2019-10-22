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
public class JeppeSearch {
    public int searchLinear(int[] arr, int searchNumber){
        // Linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                return i;
            }
        }
        return -1;
    }
    
    private int searchBinary(int[] arr, int searchNumber, int start, int end){
        int mid = start + (end-start)/2;
        
        if(start>end){
            return -1;
        }
        
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
        
        return -2;
        
    }
    
    public int searchBinary(int[] arr, int searchNumber)
    {
        return searchBinary(arr, searchNumber, 0, arr.length-1);
    }
}
