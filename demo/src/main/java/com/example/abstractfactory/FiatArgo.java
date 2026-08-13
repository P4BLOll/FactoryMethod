package com.example.abstractfactory;
import javax.swing.JOptionPane;

// Produto específico da família Fiat para a categoria Hatch.
public class FiatArgo implements Hatch {
    public void exibirConsumo() { 
        JOptionPane.showMessageDialog(null, "Fiat Argo\nConsumo: 13 km/l"); 
    }
}