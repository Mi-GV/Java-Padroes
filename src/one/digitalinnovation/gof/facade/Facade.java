package one.digitalinnovation.gof.facade;


import one.digitalinnovation.gof.Subsistema1.crm.CrmService;
import one.digitalinnovation.gof.Subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome,String cep){
        String cidade = CepApi.getIntancia().recuperarCidade(cep);
        String estado = CepApi.getIntancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade, estado);

    }

}
