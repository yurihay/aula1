import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String nome;

        nome ="";
        int idade =31;
        Scanner  teclado= new Scanner(System.in);


        System.out.print("Qual é seu nome:  ");

        nome = teclado.nextLine();
        System.out.print("qual é sua idade:");
        idade= teclado.nextInt();



        System.out.println("Olá "  + nome +  " é um Desprazer ter você aqui");
        System.out.println("sua idade é: " +idade+ " anos");

    }
    }
