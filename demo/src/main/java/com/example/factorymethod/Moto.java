package com.example.factorymethod;

import javax.swing.JOptionPane;

// Implementação real de um veículo tipo Moto.
public class Moto implements Veiculo {
    @Override
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, "Veículo: MOTO\nDuas rodas e guidão.", "Factory Method", JOptionPane.INFORMATION_MESSAGE);
    }
}