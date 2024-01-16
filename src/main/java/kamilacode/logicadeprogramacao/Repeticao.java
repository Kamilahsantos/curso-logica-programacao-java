package kamilacode.logicadeprogramacao;

import java.util.Scanner;

public class Repeticao {

    public static void main (String [] args){
//        for(int i = 0; i <=1000; i++){
//            System.out.println("nessa repeticao i tem o valor de   " + i);
//        }


//        Scanner scanner = new Scanner(System.in);
//        var valorMisterioso =  0;
//
//        while (valorMisterioso !=26){
//            System.out.println(" advinhe o valor misterioso ");
//            valorMisterioso = scanner.nextInt();
//            if (valorMisterioso == 26) {
//                System.out.println("ihu voce acertou");
//            } else {
//                System.out.println("nao é esse o valor, tente novamente");
//            }
//        }

        int valor = 0;
        do{
            System.out.println(valor);
            valor++;
        }while (valor <1234);

    }


}
