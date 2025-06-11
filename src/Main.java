import ex04.*;

import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ex06();

    }

    public static void ex01(){
        //Escreva um programa em Java e crie uma variável chamada "Planeta" e atribua-a um valor "Plutão".
        //Exiba o valor para o usuário.

        String planeta = "Plutão";
        System.out.printf("%s", planeta);
    }

    public static void ex02(){
        //Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.printf("Olá, %s", nome);

        sc.close();
    }

    public static void ex03(){
        //Escreva um programa em Java em que o usuário informe o seu nome e
        // em seguida o programa perguntará a idade do usuário. Agora o
        // programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        sc.close();

        System.out.printf("Olá, %s, sua idade é %d", nome, idade);
    }

    public static void ex04(){
        //Considerando a figura abaixo, escreva um programa para cada forma que
        // calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá
        // informar os valores de cada variável.
        // Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cálculo de Áreas ===");
        System.out.println("Escolha a figura:");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Losango");
        System.out.println("4 - Trapézio");
        System.out.println("5 - Paralelogramo");
        System.out.println("6 - Triângulo");
        System.out.println("7 - Círculo");
        System.out.print("Digite sua opção (1 a 7): ");

        int opcao = sc.nextInt();
        double area = 0;

        switch (opcao) {
            case 1:
                area = Retangulo.calcularArea();
                break;
            case 2:
                area = Quadrado.calcularArea();
                break;
            case 3:
                area = Losango.calcularArea();
                break;
            case 4:
                area = Trapezio.calcularArea();
                break;
            case 5:
                area = Paralelogramo.calcularArea();
                break;
            case 6:
                area = Triangulo.calcularArea();
                break;
            case 7:
                area = Circulo.calcularArea();
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        System.out.println("Área calculada: " + area);
        sc.close();
    }

    public static void ex05(){
        //Faça um programa que leia um valor informado pelo
        // usuário e diga se o valor informado é positivo, negativo ou neutro.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero:");
        float numero = sc.nextFloat();

        if (numero > 0){
            System.out.print("Numero positivo");
        }else if (numero == 0) {
            System.out.println("Numero neutro");
        }else {
            System.out.println("Numero negativo");
        }

        sc.close();
    }

    public static void ex06(){
        //Faça um programa para ler 3 valores (considere que não serão
        // informados valores iguais) e escrever o maior deles.

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° \n",i+1);
            numeros[i] = sc.nextInt();
        }

        sc.close();

        int maior = Arrays.stream(numeros).max().getAsInt();

        System.out.printf("Maior numero %d", maior);
    }

    public static void ex06_1(){
        //Faça um programa para ler 4 valores (considere que não serão
        // informados valores iguais) e escrever o maior deles.

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° \n",i+1);
            numeros[i] = sc.nextInt();
        }

        sc.close();

        int maior = Arrays.stream(numeros).max().getAsInt();

        System.out.printf("Maior numero %d", maior);
    }

    public static void ex07(){
        //Faça um programa que leia 3 valores (considere que não serão
        // informados valores iguais) e escrever a soma dos 2 maiores.

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos números você quer digitar? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o %d° número: ", i + 1);

            numeros.add(sc.nextInt());
        }

        sc.close();

        int primeiroMaior = numeros.stream().max(Comparator.naturalOrder()).get();

        numeros.remove(numeros.indexOf(primeiroMaior));

        int segundoMaior = numeros.stream().max(Comparator.naturalOrder()).get();

        System.out.printf("Soma dos dois maiores numero %d", primeiroMaior + segundoMaior);
    }

    public static void ex07_1(){
        //Faça um programa que leia 5 valores (considere que não serão informados
        // valores iguais) e escrever a soma dos 2 maiores.

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %d° número: ", i + 1);

            numeros.add(sc.nextInt());
        }

        sc.close();

        int primeiroMaior = numeros.stream().max(Comparator.naturalOrder()).get();

        numeros.remove(numeros.indexOf(primeiroMaior));

        int segundoMaior = numeros.stream().max(Comparator.naturalOrder()).get();

        System.out.printf("Soma dos dois maiores numero %d", primeiroMaior + segundoMaior);
    }

    public static void ex08(){
        //Faça um programa para ler 2 valores informados pelo usuário e se o
        // segundo valor informado for neutro, deve ser lido um novo valor -
        // ou seja, para o segundo valor não pode ser aceito o valor zero nem
        // um valor negativo. O programa deve imprimir o resultado da divisão
        // do primeiro valor lido pelo segundo valor lido.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        double valor2;
        do {
            System.out.print("Digite o segundo valor (maior que 0): ");
            valor2 = sc.nextDouble();

            if (valor2 <= 0) {
                System.out.println("Valor inválido! O número deve ser maior que zero.");
            }

        } while (valor2 <= 0);

        double resultado = valor1 / valor2;
        System.out.println("Resultado da divisão: " + resultado);

        sc.close();
    }

    public static void ex09(){
        //Faça um programa que leia 10 valores informados pelo
        // usuário, calcule, exiba os números informados e escreva a
        // média aritmética desses valores lidos.

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> valores = new ArrayList<>();

        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº valor: ", i + 1);
            double valor = sc.nextDouble();
            valores.add(valor);
            soma += valor;
        }

        System.out.println("\nValores informados:");
        for (Double valor : valores) {
            System.out.println(valor);
        }

        double media = soma / valores.size();
        System.out.printf("\nMédia aritmética: %.2f\n", media);

        sc.close();
    }

    public static void ex10(){
        //Escreva um programa para ler as notas das 4 avaliações de um
        // aluno no semestre, calcular e escrever a média do semestre e a seguinte
        // mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado
        // (considere 6.0 a média mínima para aprovação e 4 notas informadas).

        Scanner sc = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.printf("Digite a %dª nota: ", i);
            double nota = sc.nextDouble();
            soma += nota;
        }

        double media = soma / 4;

        System.out.printf("\nMédia do semestre: %.2f\n", media);

        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }else {
            System.out.println("Você foi reprovado");
        }

        sc.close();
    }

    public static void ex11() throws InterruptedException {
        //Crie uma bomba relógio (usando somente código - para deixar claro!)
        // cuja contagem regressiva vá de 30 a 0. Escreva a contagem em tela e no
        // final da repetição escreva "EXPLOSÃO".

        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("💥 EXPLOSÃO 💥");
    }

    public static void ex12(){
        //Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente.

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void ex13(){
        //Faça um algoritmo que calcule e escreva a média aritmética dos
        // dois números inteiros informados pelo usuário e todos os números
        // inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número (menor): ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número (maior): ");
        int num2 = sc.nextInt();

        if (num1 >= num2) {
            System.out.println("Erro: o primeiro número deve ser menor que o segundo.");
            sc.close();
            return;
        }

        int soma = 0;
        int quantidade = 0;

        for (int i = num1; i <= num2; i++) {
            soma += i;
            quantidade++;
        }

        double media = (double) soma / quantidade;

        System.out.println("A média aritmética dos números entre " + num1 + " e " + num2 + " é: " + media);

        sc.close();
    }

    public static void ex14(){
        //Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a
        // média final. Considere que a nota de aprovação é 6,5. Logo após escrever
        // a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta.
        // Se a resposta for "S", o programa deve ser executado novamente, caso contrário
        // deve ser encerrado exibindo a quantidade de alunos aprovados.

        Scanner sc = new Scanner(System.in);
        int aprovados = 0;
        String resposta;

        do {
            double somaNotas = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite a " + i + "ª nota: ");
                double nota = sc.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / 6;
            System.out.printf("Média final: %.2f\n", media);

            if (media >= 6.5) {
                System.out.println("PARABÉNS! Você foi aprovado!");
                aprovados++;
            } else {
                System.out.println("Infelizmente você não foi aprovado.");
            }

            System.out.print("Calcular a média de outro aluno (S/N)? ");
            sc.nextLine();
            resposta = sc.nextLine().trim().toUpperCase();

        } while (resposta.equals("S"));

        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        sc.close();
    }

    public static void ex15(){
        //Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O
        // metro e cresce 3 centímetros por ano.
        //Construa um programa que calcule e imprima quantos anos serão necessários para
        // que Felisberto seja maior que Anacleto.

        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;
        int anos = 0;

        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += 0.02;
            alturaFelisberto += 0.03;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Felisberto seja mais alto que Anacleto.");
    }

    public static void ex16(){
        //Escreva um programa para ler:
        //
        //    o número total de eleitores de um município.
        //
        //Agora o programa deve receber a quantindade (percentual):
        //
        //    o número de votos brancos;
        //    o número de votos válidos;
        //    o número de votos nulos.
        //
        //Por fim, o programa vai calcular e escrever a quantidade de votos que cada categoria (brancos, nulos e válidos) representa em relação ao total
        //de eleitores.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = sc.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = sc.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = sc.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = sc.nextInt();

        int somaVotos = votosBrancos + votosNulos + votosValidos;
        if (somaVotos > totalEleitores) {
            System.out.println("Erro: A soma dos votos não pode ultrapassar o número total de eleitores.");
        } else {
            double percBrancos = (votosBrancos * 100.0) / totalEleitores;
            double percNulos = (votosNulos * 100.0) / totalEleitores;
            double percValidos = (votosValidos * 100.0) / totalEleitores;

            System.out.printf("Percentual de votos brancos: %.2f%%\n", percBrancos);
            System.out.printf("Percentual de votos nulos: %.2f%%\n", percNulos);
            System.out.printf("Percentual de votos válidos: %.2f%%\n", percValidos);
        }

        sc.close();
    }

    public static void ex17(){
        //O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
        // porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
        //Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%
        // sobre o valor da fábrica, escreva um programa para ler o custo de fábrica de
        // um carro, calcular e escrever o custo final ao consumidor.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = sc.nextDouble();

        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double valorDistribuidor = custoFabrica * percentualDistribuidor;
        double valorImpostos = custoFabrica * percentualImpostos;

        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.printf("Custo final ao consumidor: R$ %.2f\n", custoFinal);

        sc.close();
    }

    public static void ex18(){
        //Desenvolva um programa para uma revendedora de carros usados que calcula o salário
        // final de seus funcionários vendedores. O algoritmo deve receber como entrada o número
        // de carros vendidos, o valor total das vendas, o salário fixo mensal do vendedor e a
        // comissão fixa por carro vendido.
        //O salário final do vendedor é calculado somando o salário fixo mensal, a comissão fixa por
        // carro vendido e 5% do valor total das vendas realizadas pelo vendedor.
        //Considere que o salário inicial é de R$ 5.000,00.
        //O Programa deve exibir e detalhar cada venda, a comissão e o percentual e exibir o valor final.

        Scanner sc = new Scanner(System.in);

        final double salarioFixo = 5000.00;

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = sc.nextInt();

        System.out.print("Digite o valor total das vendas: R$ ");
        double valorTotalVendas = sc.nextDouble();

        System.out.print("Digite a comissão fixa por carro vendido: R$ ");
        double comissaoPorCarro = sc.nextDouble();

        double totalComissao = carrosVendidos * comissaoPorCarro;
        double percentualVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + totalComissao + percentualVendas;

        System.out.println("\nRELATÓRIO DE PAGAMENTO");
        System.out.printf("Salário fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Comissão por carro (R$ %.2f) × %d carros: R$ %.2f\n", comissaoPorCarro, carrosVendidos, totalComissao);
        System.out.printf("5%% sobre o total de vendas (R$ %.2f): R$ %.2f\n", valorTotalVendas, percentualVendas);
        System.out.printf(">>> Salário final do vendedor: R$ %.2f\n", salarioFinal);

        sc.close();
    }

    public static void ex19(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double c = sc.nextDouble();

        boolean formaTriangulo = (a < b + c) && (b < a + c) && (c < a + b);

        if (formaTriangulo) {
            System.out.println("Os valores informados FORMAM um triângulo.");
        } else {
            System.out.println("Os valores informados NÃO FORMAM um triângulo.");
        }

        sc.close();
    }

    public static void ex20(){
        //Faça um programa para ler:
        //
        //    O nome do produto,
        //    A quantidade adquirida do produto,
        //    O preço unitário do produto.
        //
        //Agora o programa deve calcular e escrever:
        //
        //    O valor da venda (valor da venda = quantidade adquirida * preço unitário),
        //    O percentual de desconto,
        //    O valor fixo de imposto que é 20%.
        //    O total a pagar (total a pagar = valor da venda - desconto).
        //
        //Sabendo-se que:
        //
        //    Se quantidade <= 5 o desconto será de 2%
        //     -
        //    Se quantidade > 5 e quantidade <=10 o desconto será de 3%
        //     -
        //    Se quantidade > 10 o desconto será de 5%
        //
        //No fim, escreva um recibo que detalhe a compra como uma nota fiscal.

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Quantidade adquirida: ");
        int quantidade = sc.nextInt();

        System.out.print("Preço unitário (R$): ");
        double precoUnitario = sc.nextDouble();

        double valorVenda = quantidade * precoUnitario;

        double percentualDesconto;
        if (quantidade <= 5) {
            percentualDesconto = 0.02;
        } else if (quantidade <= 10) {
            percentualDesconto = 0.03;
        } else {
            percentualDesconto = 0.05;
        }

        double valorDesconto = valorVenda * percentualDesconto;
        double valorImposto = valorVenda * 0.20;
        double totalPagar = valorVenda - valorDesconto;


        System.out.println("\n NOTA FISCAL");
        System.out.printf("Produto: %s\n", nome);
        System.out.printf("Quantidade: %d\n", quantidade);
        System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Valor total da venda: R$ %.2f\n", valorVenda);
        System.out.printf("Desconto aplicado (%.0f%%): R$ %.2f\n", percentualDesconto * 100, valorDesconto);
        System.out.printf("Imposto fixo (20%%): R$ %.2f\n", valorImposto);
        System.out.printf(">>> Total a pagar: R$ %.2f\n", totalPagar);

        sc.close();
    }

    public static void ex21(){
        //Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou
        // não. Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
        //
        // - Ter no mínimo 65 anos de idade.
        // - Ter trabalhado no mínimo 30 anos.
        // - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
        //
        //Com base nas informações acima, faça um algoritmo que leia: o número do empregado
        // (código), o ano de seu nascimento e o ano de seu ingresso na empresa. O programa
        // deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer
        // aposentadoria' ou 'Não requerer'.

        Scanner sc = new Scanner(System.in);

        // Pega o ano atual dinamicamente
        int anoAtual = Year.now().getValue();

        System.out.print("Código do empregado: ");
        int codigo = sc.nextInt();

        System.out.print("Ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Ano de ingresso na empresa: ");
        int anoIngresso = sc.nextInt();

        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        System.out.println("\n");
        System.out.println("Código: " + codigo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        boolean podeAposentar =
                idade >= 65 ||
                        tempoTrabalho >= 30 ||
                        (idade >= 60 && tempoTrabalho >= 25);

        if (podeAposentar) {
            System.out.println("Resultado: Requerer aposentadoria");
        } else {
            System.out.println("Resultado: Não requerer aposentadoria");
        }

        sc.close();
    }

    public static void ex22(){
        //Escreva um algoritmo que imprima as seguintes seqüências de números:
        //
        //    (1, 1 2 3 4 5 6 7 8 9 10)
        //    (2, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        //    (3, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
        //
        //
        //E assim sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 20.

        int contador = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.print("(" + i + ", ");
            for (int j = 0; j < 10; j++) {
                System.out.print(contador);
                if (j < 9) {
                    System.out.print(", ");
                }
                contador++;
            }
            System.out.println(")");
        }
    }

    public static void ex23(){
        int contador = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.print("(" + i + ", ");
            contador = 1;
            for (int j = 0; j < 10; j++) {
                System.out.print(contador);
                if (j < 9) {
                    System.out.print(" ");
                }
                contador++;
            }
            System.out.println(")");
        }
    }

    public static void ex24(){
        //A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
        // mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
        //Escreva um programa que leia o número de horas trabalhadas em um mês,
        // o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras,
        // caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.print("Digite o valor da hora trabalhada (R$): ");
        double valorHora = sc.nextDouble();

        double horasRegulares = 160;
        double salarioTotal;

        if (horasTrabalhadas > horasRegulares) {
            double horasExtras = horasTrabalhadas - horasRegulares;
            double valorHoraExtra = valorHora * 1.5;
            salarioTotal = (horasRegulares * valorHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horasTrabalhadas * valorHora;
        }

        System.out.printf("Salário total do funcionário: R$ %.2f%n", salarioTotal);

        sc.close();
    }

    public static void ex25(){
        //Escreva um programa que para ler doze números informados pelo usuário e que serão
        // armazenados em um vetor/array.
        //
        //No fim o programa deve dar duas saídas:
        //1) o programa deve processar os dados invertendo a posição dos elementos
        // trocando o primeiro elemento com o último, o segundo com penúltimo etc.
        //2) o programa deve processar os dados invertendo a posição dos elementos trocando,
        // mas separando os dados por tipo.
        //
        //Exemplo:
        //Usuário informa: A, 1, B, 2, C, 3 D, 4, E, 5, F, 6
        //Saída 1:  6, F, 5, E, 4, D, 3, 2, B, 1
        //Saída 2:  6, 5, 4, 3, 2, 1 - F, E, D, C, A, B

        Scanner sc = new Scanner(System.in);

        String[] dados = new String[12];
        System.out.println("Digite 12 valores (letras ou números):");

        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + "° valor: ");
            dados[i] = sc.next();
        }

        // Saida 1
        System.out.print("\nSaída 1 (inversão total): ");
        for (int i = dados.length - 1; i >= 0; i--) {
            System.out.print(dados[i]);
            if (i > 0) System.out.print(", ");
        }

        // Separar por tipo
        List<String> numeros = new ArrayList<>();
        List<String> letras = new ArrayList<>();

        for (String d : dados) {
            if (d.matches("\\d+")) {
                numeros.add(d);
            } else {
                letras.add(d);
            }
        }

        Collections.reverse(numeros);
        Collections.reverse(letras);

        // Saida 2
        System.out.print("\n\nSaída 2 (separado por tipo): ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) System.out.print(", ");
        }

        System.out.print(" - ");

        for (int i = 0; i < letras.size(); i++) {
            System.out.print(letras.get(i));
            if (i < letras.size() - 1) System.out.print(", ");
        }

        sc.close();
    }
}