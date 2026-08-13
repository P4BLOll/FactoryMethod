package com.example;

import javax.swing.JOptionPane;

class VolksVirtus implements Sedan {
    public void exibirPortaMalas() {
        JOptionPane.showMessageDialog(null, "VW Virtus (Sedan)\nPorta-malas: 521 L", "Volkswagen", JOptionPane.INFORMATION_MESSAGE);
    }
}

class VolksPolo implements Hatch {
    public void exibirConsumo() {
        JOptionPane.showMessageDialog(null, "VW Polo (Hatch)\nConsumo: 14 km/l", "Volkswagen", JOptionPane.INFORMATION_MESSAGE);
    }
}

class VolksTCross implements SUV {
    public void exibirCategoria() {
        JOptionPane.showMessageDialog(null, "VW T-Cross (SUV)\nCategoria: Motor TSI", "Volkswagen", JOptionPane.INFORMATION_MESSAGE);
    }
}

public class VolksFactory implements MontadoraFactory {
    public Sedan criarSedan() { return new VolksVirtus(); }
    public Hatch criarHatch() { return new VolksPolo(); }
    public SUV criarSUV() { return new VolksTCross(); }
}