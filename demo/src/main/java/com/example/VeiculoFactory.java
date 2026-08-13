package com.example;

import javax.swing.JOptionPane;

interface Veiculo {
    void exibirDetalhes();
}

class Carro implements Veiculo {
    @Override
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, "Veículo criado: CARRO\nQuatro rodas, teto e volante.", "Detalhes", JOptionPane.INFORMATION_MESSAGE);
    }
}

class Moto implements Veiculo {
    @Override
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, "Veículo criado: MOTO\nDuas rodas e guidão.", "Detalhes", JOptionPane.INFORMATION_MESSAGE);
    }
}

public class VeiculoFactory {
    public Veiculo criarVeiculo(String tipo) {
        if (tipo != null && tipo.equalsIgnoreCase("CARRO")) return new Carro();
        if (tipo != null && tipo.equalsIgnoreCase("MOTO")) return new Moto();
        return null;
    }
}