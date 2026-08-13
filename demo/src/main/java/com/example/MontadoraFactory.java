package com.example;

interface Sedan {
    void exibirPortaMalas();
}

interface Hatch {
    void exibirConsumo();
}

interface SUV {
    void exibirCategoria();
}


public interface MontadoraFactory {
    Sedan criarSedan();
    Hatch criarHatch();
    SUV criarSUV();
}