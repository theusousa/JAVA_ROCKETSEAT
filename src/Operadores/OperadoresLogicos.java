package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1=false;
        boolean condiçao2=false;
         // Os dois valores são veradeiros ?? se sim entao vai emprimir
        if (condicao1 && condiçao2)
            System.out.println("Os dois valores precisam ser  verdadeiros");
        //Uma ou outra tem que ser verdadeiro não importa qual
        if (condicao1 || condiçao2)
            System.out.println("Um dos valores precisa ser verdadeiro");
    }
}
