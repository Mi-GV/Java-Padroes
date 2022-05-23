package one.digitalinnovation.gof.Subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();

    }

    public static CepApi getIntancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Boituva";

    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}

