package com.albtec.expadroesproj;

public class Cliente {
     private SomadorEsperado somador;

    public Cliente(SomadorEsperado somador) {
        this.somador = somador;
    }

    public void executar() {
        int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int soma = somador.somaVetor(vetor);
        System.out.println("Resultado: " + soma);
    }

    public static void main(String[] args) {
        SomadorExistente somadorExistente = new SomadorExistente();
        SomadorEsperado somadorAdapter = new SomadorAdapter(somadorExistente);
        Cliente cliente = new Cliente(somadorAdapter);
        cliente.executar();
    }

}