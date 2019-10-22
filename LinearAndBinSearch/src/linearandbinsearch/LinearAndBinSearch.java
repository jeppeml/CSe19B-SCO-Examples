/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearandbinsearch;

import java.util.Random;

/**
 *
 * @author jeppjleemoritzled
 */
public class LinearAndBinSearch {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 8, 9, 11, 21, 27, 31, 80};
        System.out.println("Rhello cruel world!");
        System.out.println("Element number 4: " + numbers[4]);
        JeppeSearch searcher = new JeppeSearch();
        
        int search = 81;
        int index = searcher.searchLinear(numbers, search);
        if(index==-1){
            System.out.println("These are not the droids you are looking for! (Waves hand)");
        }
        else{
            System.out.println(search + " is at: " + index);
        }
        
        Random rand = new Random(1337);
        for (int i = 0; i < 100; i++) {
            double num = Math.random();
            
            int myNum = (int)(num*10)+15;
            
            
            System.out.println("Num "+ i + " " + rand.nextInt(16));
        }
        
        
    }

}
