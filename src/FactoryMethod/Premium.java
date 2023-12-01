/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;



/**
 *
 * @author fnand
 */
public class Premium extends CreditCard{

    @Override
    public void transaccion() {
        //Hace la transaccion con el porcentaje de Premium
    }

    @Override
    Card createCard() {
        Card Premium = new Card();
        return Premium;
    }
    

   
    
}
