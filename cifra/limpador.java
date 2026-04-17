import java.util.Scanner;

public class limpador {
    
    public static String limpar(String p) {
        if(p == null){
            return "";
        }
        String limpoEspacoPont = p.replaceAll("[\\p{Punct}\\s]+", "");
        return limpoEspacoPont;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int indice = 0;

        System.out.println("Informe a palavra para cifrar:");
        String p = ler.nextLine();

        String textoLimpo = limpar(p).toUpperCase();
        int tamanhoP = textoLimpo.length();
        System.out.println("Texto limpo: " + textoLimpo);

        String cifra = "";
        for(int i = 0; i < tamanhoP; i++){
            char letra = textoLimpo.charAt(indice);
            System.out.print("indice: "+ indice + " Letra: "+ letra);
            indice = (indice + 3) % tamanhoP;
            cifra = cifra + letra;
        }
        System.out.println(cifra);
    }
}