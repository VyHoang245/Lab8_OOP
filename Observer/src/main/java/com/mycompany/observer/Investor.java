/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.observer;

/**
 *
 * @author vygir
 */
public interface Investor {
    String getName();
    Strategy addaptStrategy();
    public void update(String stockBymbol, double priceChange);
}
