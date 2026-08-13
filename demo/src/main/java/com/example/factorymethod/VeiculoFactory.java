package com.example.factorymethod;

// A Fábrica: ela decide qual objeto criar com base no texto recebido.
// Isso evita que o sistema espalhe vários "new Carro()" ou "new Moto()" pelo código.
public class VeiculoFactory {
    public Veiculo criarVeiculo(String tipo) {
        if (tipo != null && tipo.equalsIgnoreCase("CARRO")) return new Carro();
        if (tipo != null && tipo.equalsIgnoreCase("MOTO")) return new Moto();
        return null; // Retorna nulo se o tipo for desconhecido
    }
}