package TreinamentoJavaGFT;

import java.util.Scanner;


public class NumeroReverso {
    public static void numeroReverso(){
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe um número inteiro com quatro dígitos");
            int numeroInformado = scan.nextInt();

            String numeroInformadoStrig = String.valueOf(numeroInformado);
            if (numeroInformado >= 1000 && numeroInformado <= 9999){
                StringBuilder stringBuilder = new StringBuilder(numeroInformadoStrig);
                System.out.println(stringBuilder.reverse());
                break;
            } else if (numeroInformadoStrig.length() < 4);
            System.out.println("O número informado deverá conter 4 dígitos.");

            } while (true);
        }

}

