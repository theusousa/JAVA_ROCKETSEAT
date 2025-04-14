package controle_fluxo.condicional;

public class ResultadoEscola {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
              /*vareavel*/ /*A vareavel criada*/ //( ? ) significa se é verdadeiro é o ( : ) se não
        System.out.println(resultado);
    }
}
// Cenário 2
/*  public class ResultadoEscolar {
    public static void main (String[] args){
        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : nota>=5 && nota <7 ? "Recuperação": "Reprovado";
        System.out.println(resultado);
    }
}*/