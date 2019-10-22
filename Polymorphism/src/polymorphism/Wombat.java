/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author jeppjleemoritzled
 */
public class Wombat extends Animal{
    public void sniggle(){
        System.out.println("Wombat: " + "SNIGGLE!");
    }

    @Override
    public void makeSound() {
        sniggle();
    }
}
