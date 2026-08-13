package com.example.abstractfactory;

// Fábrica da Volks: só cria carros que pertencem à família Volkswagen.
public class VolksFactory implements MontadoraFactory {
    public Sedan criarSedan() { return new VolksVirtus(); }
    public Hatch criarHatch() { return new VolksPolo(); }
    public SUV criarSUV() { return new VolksTCross(); }
}