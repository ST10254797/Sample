/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture10classesprt3;
import javax.swing.*;

/**
 *
 * @author crist
 */
public class Lecture10Classesprt3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String sName=JOptionPane.showInputDialog(null,"Enter customer Name");
        double dblMinsTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the number of minutes talked"));
        double dblCostPerMin = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost of the minute"));
        
        Bill b = new Bill( sName , dblCostPerMin , dblMinsTalked);
        
    }
}
