package com.example;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        setTitle("Padrões de Projeto: Factory Method & Abstract Factory");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 10, 10));

        JPanel panelParte1 = new JPanel();
        panelParte1.setBorder(BorderFactory.createTitledBorder("Parte 1: Factory Method (Veículos)"));
        JButton btnCarro = new JButton("Criar Carro");
        JButton btnMoto = new JButton("Criar Moto");
        
        VeiculoFactory veiculoFactory = new VeiculoFactory();

        btnCarro.addActionListener(e -> veiculoFactory.criarVeiculo("CARRO").exibirDetalhes());
        btnMoto.addActionListener(e -> veiculoFactory.criarVeiculo("MOTO").exibirDetalhes());

        panelParte1.add(btnCarro);
        panelParte1.add(btnMoto);

        JPanel panelFiat = new JPanel();
        panelFiat.setBorder(BorderFactory.createTitledBorder("Partes 2 e 3: Abstract Factory (Fiat)"));
        JButton btnFiatSedan = new JButton("Sedan (Cronos)");
        JButton btnFiatHatch = new JButton("Hatch (Argo)");
        JButton btnFiatSUV = new JButton("SUV (Pulse)");

        MontadoraFactory fiatFactory = new FiatFactory();

        btnFiatSedan.addActionListener(e -> fiatFactory.criarSedan().exibirPortaMalas());
        btnFiatHatch.addActionListener(e -> fiatFactory.criarHatch().exibirConsumo());
        btnFiatSUV.addActionListener(e -> fiatFactory.criarSUV().exibirCategoria());

        panelFiat.add(btnFiatSedan);
        panelFiat.add(btnFiatHatch);
        panelFiat.add(btnFiatSUV);

        JPanel panelVolks = new JPanel();
        panelVolks.setBorder(BorderFactory.createTitledBorder("Partes 2 e 3: Abstract Factory (Volks)"));
        JButton btnVolksSedan = new JButton("Sedan (Virtus)");
        JButton btnVolksHatch = new JButton("Hatch (Polo)");
        JButton btnVolksSUV = new JButton("SUV (T-Cross)");

        MontadoraFactory volksFactory = new VolksFactory();

        btnVolksSedan.addActionListener(e -> volksFactory.criarSedan().exibirPortaMalas());
        btnVolksHatch.addActionListener(e -> volksFactory.criarHatch().exibirConsumo());
        btnVolksSUV.addActionListener(e -> volksFactory.criarSUV().exibirCategoria());

        panelVolks.add(btnVolksSedan);
        panelVolks.add(btnVolksHatch);
        panelVolks.add(btnVolksSUV);

        add(panelParte1);
        add(panelFiat);
        add(panelVolks);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}