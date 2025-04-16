package controle_fluxo_excecao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
         //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = "";
        try {
             nome = scanner.next();
        }catch (InputMismatchException e){
            System.out.println("Digite seu Nome");
        }


        System.out.println("Digite seu sobrenome");
        String sobrenome = "";
        try {
            sobrenome = scanner.next();
        }catch (InputMismatchException e){
            System.out.println("Digite da forma que se pede");
        }


        System.out.println("Digite sua idade");
        int idade = 0;
        try {
            idade = scanner.nextInt();
        }catch (InputMismatchException e ){
            System.err.println("Digite sua IDADE em forma numerica");
        }

        System.out.println("Digite sua altura");
        double altura = 0;
        try {
             altura = scanner.nextDouble();
        }catch (InputMismatchException e ){ // É usado quando não é o valor esperado pelo programa
            System.err.println("A altura deve ser digitado no padrao americano 0.00");
        }


        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo "+ nome.toUpperCase()  +  " " + sobrenome.toUpperCase());
        System.out.println("tenho " + idade  + " anos");
        System.out.println("Minha altura é " + altura + "cm");
        scanner.close();


    }
}
