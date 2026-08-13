package com.example.abstractfactory;
import javax.swing.JOptionPane;

// Produto específico da família Volkswagen para a categoria SUV.
public class VolksTCross implements SUV {
    public void exibirCategoria() { 
        JOptionPane.showMessageDialog(null, "VW T-Cross\nMotor: TSI"); 
    }
}