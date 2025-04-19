package pooJava.comparacao;

public class comparacaoApp {
    public static void main(String[] args) {
        Integer i1=128;
        Integer i2 =  Integer.parseInt("128");

        System.out.println(i1 .equals(i2));
    }
}

/* == (comparação de referência)
* Verifica se duas variáveis apontam para o mesmo objeto na memória.

* Funciona bem com tipos primitivos (como int, double, etc), porque compara os valores diretamente.

* Com objetos, não compara o conteúdo, apenas se são o mesmo objeto.
 */
/* .equals (comparação de conteúdo)

* Compara o conteúdo dos objetos.

*A classe String (e outras como Integer, List, etc) sobrescrevem .equals() pra fazer isso direitinho.

 *///Sempre use .equals() pra comparar conteúdo de objetos (especialmente String, Integer, Double, etc).

//Use == só pra tipos primitivos ou quando você REALMENTE quer saber se são o mesmo objeto.


