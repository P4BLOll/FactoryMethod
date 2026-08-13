package com.example.abstractfactory;
import javax.swing.JOptionPane;

// Produto específico da família Volkswagen para a categoria Sedan.
public class VolksVirtus implements Sedan {
    public void exibirPortaMalas() { 
        JOptionPane.showMessageDialog(null, "VW Virtus\nPorta-malas: 521 L"); 
    }
}