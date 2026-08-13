package com.example.abstractfactory;
import javax.swing.JOptionPane;

// Produto específico da família Volkswagen para a categoria Hatch.
public class VolksPolo implements Hatch {
    public void exibirConsumo() { 
        JOptionPane.showMessageDialog(null, "VW Polo\nConsumo: 14 km/l"); 
    }
}