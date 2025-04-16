package pooJava;

public class Cliente {
    String nome;
    Double limiteCredito = 100.0;
    public void solicitarLimiteCredito(Double valorSolicitado){
        limiteCredito = valorSolicitado;

    }
    public void comprar(Double valorproduto){
        limiteCredito=limiteCredito-valorproduto;
    }
    public Cliente (String nome){
        this.nome=nome;
    }
}
