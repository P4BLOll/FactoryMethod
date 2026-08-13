package com.example.abstractfactory;
import javax.swing.JOptionPane;

// Produto específico da família Fiat para a categoria Sedan.
public class FiatCronos implements Sedan {
    public void exibirPortaMalas() { 
        JOptionPane.showMessageDialog(null, "Fiat Cronos\nPorta-malas: 525 L"); 
    }
}