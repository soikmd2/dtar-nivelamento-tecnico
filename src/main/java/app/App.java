package app;

import dto.Viagem;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem("São Paulo");

        viagem.setDestino("Recife");

        System.out.println(viagem.getDestino());
    }
}
