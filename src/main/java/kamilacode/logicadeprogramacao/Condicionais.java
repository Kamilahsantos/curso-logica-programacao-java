package kamilacode.logicadeprogramacao;

public class Condicionais {

    public static void main (String [] args){

        long valor1 = 1L;
        long valor2 = 1000L;

//        if(valor1 > valor2){
//            System.out.println("é maior");
//        } else if (valor1== valor2) {
//            System.out.println("sao iguais");
//        }else{
//            System.out.println("nenhum dos dois");
//        }

        String mesDoAno = "janeiro";

        switch (mesDoAno){
            case ("Janeiro"):
                System.out.println(1);
            break;
            case ("Fevereiro"):
                System.out.println(2);
            break;
            case ("Marco"):
                System.out.println(3);
            break;
            case ("Abril"):
                System.out.println(4);
            break;
            case ("Maio"):
                System.out.println(5);
            break;
            case ("Junho"):
                System.out.println(6);
            break;
            case ("Julho"):
                System.out.println(7);
            break;
            case ("Agosto"):
                System.out.println(8);
            break;
            case ("Setembro"):
                System.out.println(9);
            break;
            case ("Outubro"):
                System.out.println(10);
            break;
            case ("Novembro"):
                System.out.println(11);
            break;
            case ("Dezembro"):
                System.out.println(12);
            break;
            default:
                System.out.println("mes invalido");
                break;
        }
    }
}
