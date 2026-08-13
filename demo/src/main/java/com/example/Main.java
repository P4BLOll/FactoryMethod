package com.example;

import com.example.factorymethod.VeiculoFactory;
import com.example.abstractfactory.MontadoraFactory;
import com.example.abstractfactory.FiatFactory;
import com.example.abstractfactory.VolksFactory;

import javax.swing.*;
import java.awt.*;

// A tela que atua como nosso "Cliente". Ela só conversa com as fábricas
// e com as interfaces, nunca dá um "new FiatCronos()" direto.
public class Main extends JFrame {

    public Main() {
        setTitle("Padrões: Factory Method & Abstract Factory");
        setSize(500, 440);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new GridLayout(3, 1, 10, 10));

        // --- PAINEL 1: Factory Method ---
        JPanel panelFactoryMethod = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panelFactoryMethod.setBorder(BorderFactory.createTitledBorder("Factory Method"));
        
        VeiculoFactory veiculoFactory = new VeiculoFactory();

        JButton btnCarro = new JButton("Criar Carro");
        btnCarro.addActionListener(e -> veiculoFactory.criarVeiculo("CARRO").exibirDetalhes());
        
        JButton btnMoto = new JButton("Criar Moto");
        btnMoto.addActionListener(e -> veiculoFactory.criarVeiculo("MOTO").exibirDetalhes());

        panelFactoryMethod.add(btnCarro);
        panelFactoryMethod.add(btnMoto);

        // --- PAINEL 2: Abstract Factory (FIAT) ---
        JPanel panelFiat = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panelFiat.setBorder(BorderFactory.createTitledBorder("Abstract Factory - FIAT"));
        
        MontadoraFactory fiatFactory = new FiatFactory(); // Usando a fábrica da Fiat

        JButton btnFiatSedan = new JButton("Sedan (Cronos)");
        btnFiatSedan.addActionListener(e -> fiatFactory.criarSedan().exibirPortaMalas());
        
        JButton btnFiatHatch = new JButton("Hatch (Argo)");
        btnFiatHatch.addActionListener(e -> fiatFactory.criarHatch().exibirConsumo());
        
        JButton btnFiatSUV = new JButton("SUV (Pulse)");
        btnFiatSUV.addActionListener(e -> fiatFactory.criarSUV().exibirCategoria());

        panelFiat.add(btnFiatSedan);
        panelFiat.add(btnFiatHatch);
        panelFiat.add(btnFiatSUV);

        // --- PAINEL 3: Abstract Factory (VOLKSWAGEN) ---
        JPanel panelVolks = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panelVolks.setBorder(BorderFactory.createTitledBorder("Abstract Factory - VOLKSWAGEN"));
        
        MontadoraFactory volksFactory = new VolksFactory(); // Trocamos para a fábrica da Volks

        JButton btnVolksSedan = new JButton("Sedan (Virtus)");
        btnVolksSedan.addActionListener(e -> volksFactory.criarSedan().exibirPortaMalas());
        
        JButton btnVolksHatch = new JButton("Hatch (Polo)");
        btnVolksHatch.addActionListener(e -> volksFactory.criarHatch().exibirConsumo());
        
        JButton btnVolksSUV = new JButton("SUV (T-Cross)");
        btnVolksSUV.addActionListener(e -> volksFactory.criarSUV().exibirCategoria());

        panelVolks.add(btnVolksSedan);
        panelVolks.add(btnVolksHatch);
        panelVolks.add(btnVolksSUV);

        add(panelFactoryMethod);
        add(panelFiat);
        add(panelVolks);
    }

    public static void main(String[] args) {
        // Usa o visual padrão do Windows/Mac/Linux em vez do visual antigo do Java.
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception e) {}
        
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}