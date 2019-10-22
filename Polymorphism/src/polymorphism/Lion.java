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
public class Lion extends Animal {
    public void roar(){
        System.out.println("Lion: " + "ROAR!");
    }

    @Override
    public void makeSound() {
        roar();
    }
}
