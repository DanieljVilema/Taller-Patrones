/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;


/**
 *
 * @author fnand
 */
public class Basic extends CreditCard{
    
    @Override
    public void transaccion() {
        //Hace la transaccion con el porcentaje de basic
    }

    @Override
    Card createCard() {
        Card Basic = new Card();
        return Basic;
    }

   
    
}
