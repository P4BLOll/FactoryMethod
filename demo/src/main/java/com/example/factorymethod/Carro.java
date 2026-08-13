package com.example.factorymethod;

import javax.swing.JOptionPane;

// Implementação real de um veículo tipo Carro.
public class Carro implements Veiculo {
    @Override
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, "Veículo: CARRO\nQuatro rodas, teto e volante.", "Factory Method", JOptionPane.INFORMATION_MESSAGE);
    }
}