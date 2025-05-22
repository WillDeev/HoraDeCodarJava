import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        exercicio3();
    }

    public static void exercicio1(){
        // 1 - Baby Steps: Escreva um programa em Java e crie uma variável chamada "Planeta" e atribua-a um valor "Plutão".
        String planeta = "Plutão";

        Scanner entrada = new Scanner(System.in);

        System.out.println("O planeta é: " + planeta);
    }

    public static void exercicio2(){
        // 2 -  Hello Clarice
        // Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]"        String nome = "";
        Scanner entrada = new Scanner(System.in);

        String nome = "";

        System.out.println("Qual é o seu nome?");
        nome = entrada.nextLine();
        System.out.println("Olá, " + nome);
    }

    public static void exercicio3(){
        // 3 - A Bit of Information
        //Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
        Scanner entrada = new Scanner(System.in);

        String nome = "";

        System.out.println("Qual é o seu nome?");
        nome = entrada.nextLine();

        int idade = 0;

        System.out.println("Qual é a sua idade?");
        idade = entrada.nextInt();
        System.out.println("Olá, " + nome + ", sua idade é: " + idade);
    }
}