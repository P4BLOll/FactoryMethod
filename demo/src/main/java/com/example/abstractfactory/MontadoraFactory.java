package com.example.abstractfactory;

// A Fábrica Abstrata: obriga todas as montadoras a saberem fabricar esses três tipos de carros.
// Se adicionarmos uma nova categoria (ex: Picape), teremos que mexer aqui e em todas as fábricas.
public interface MontadoraFactory {
    Sedan criarSedan();
    Hatch criarHatch();
    SUV criarSUV(); 
}