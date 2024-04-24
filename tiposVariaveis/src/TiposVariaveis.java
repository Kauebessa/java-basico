public class TiposVariaveis {

    /*
     int - numero normal
     short - numero pequeno
     long - numero grande
     float - numero quebrado
     char - caractere ('')
     string - conjunto de caracteres ("")
     boolean - valor verdadeiro ou falso (true/false)

     expressao final antes do tipo da variavel quer dizer que ela nao pode ser alterada
     */


    public static void main(String[] args) throws Exception {
        short numeroPequeno = 1;
        int numeroNormal = 123;
        long numeroGrande = 1234567890L;
        float numeroQuebrado = 3.14F;

        final double variavelFinal = 3.15;

        //System.out.println(variavelFinal);
        int a = 6;
        int b = 6;

        String resultado = a==b ? "1" : "0";

        System.out.println(resultado);

        int c = 1;
        int d = 2;
        boolean simNao = c==d;

        System.out.println("C eh igual a D? " + simNao );

        simNao = c>d;

        System.out.println("C eh maior que D? " + simNao );

        simNao = c<d;

        System.out.println("C eh menor a D? " + simNao );
    }
}
