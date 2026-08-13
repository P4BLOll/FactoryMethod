package com.example.abstractfactory;
import javax.swing.JOptionPane;

// Produto específico da família Fiat para a categoria SUV.
public class FiatPulse implements SUV {
    public void exibirCategoria() { 
        JOptionPane.showMessageDialog(null, "Fiat Pulse\nCategoria: Compacto"); 
    }
}