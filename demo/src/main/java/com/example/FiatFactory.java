package com.example;

import javax.swing.JOptionPane;

class FiatCronos implements Sedan {
    public void exibirPortaMalas() {
        JOptionPane.showMessageDialog(null, "Fiat Cronos (Sedan)\nPorta-malas: 525 L", "Fiat", JOptionPane.INFORMATION_MESSAGE);
    }
}

class FiatArgo implements Hatch {
    public void exibirConsumo() {
        JOptionPane.showMessageDialog(null, "Fiat Argo (Hatch)\nConsumo: 13 km/l", "Fiat", JOptionPane.INFORMATION_MESSAGE);
    }
}

class FiatPulse implements SUV {
    public void exibirCategoria() {
        JOptionPane.showMessageDialog(null, "Fiat Pulse (SUV)\nCategoria: Compacto", "Fiat", JOptionPane.INFORMATION_MESSAGE);
    }
}

public class FiatFactory implements MontadoraFactory {
    public Sedan criarSedan() { return new FiatCronos(); }
    public Hatch criarHatch() { return new FiatArgo(); }
    public SUV criarSUV() { return new FiatPulse(); }
}