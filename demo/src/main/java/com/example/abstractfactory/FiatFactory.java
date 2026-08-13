package com.example.abstractfactory;

// Fábrica da Fiat: só cria carros que pertencem à família Fiat, garantindo compatibilidade.
public class FiatFactory implements MontadoraFactory {
    public Sedan criarSedan() { return new FiatCronos(); }
    public Hatch criarHatch() { return new FiatArgo(); }
    public SUV criarSUV() { return new FiatPulse(); }
}