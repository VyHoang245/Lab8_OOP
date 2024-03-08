/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observer;
import java.util.*;
/**
 *
 * @author vygir
 */
public class Observer {

    public static void main(String[] args) {
        Stock appleStock = new ConcreteStock("APP",100);
        Stock dellStock = new ConcreteStock("DELL", 100);
        
        Investor tomInvestor = new Simpleinvestor("Tom");
        Investor bobInvestor = new Simpleinvestor("Bob");
        appleStock.addObserver(tomInvestor);
        appleStock.addObserver(bobInvestor);
        dellStock.addObserver(tomInvestor);
        
        appleStock.notifyInvestors(100);
        appleStock.notifyInvestors(40);
        appleStock.notifyInvestors(10);
        appleStock.notifyInvestors(5);
        dellStock.notifyInvestors(300);
        dellStock.notifyInvestors(200);
    }
}
