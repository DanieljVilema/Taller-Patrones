/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;



/**
 *
 * @author fnand
 */
public class VIP extends CreditCard{

    @Override
    public void transaccion() {
        //Hace la transaccion con el porcentaje de VIP
    }

    @Override
    Card createCard() {
        Card VIP = new Card();
        return VIP; }

    
}
