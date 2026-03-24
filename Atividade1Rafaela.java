import java.util.Scanner;

public class Atividade1Rafaela {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
    do {
        System.out.println("----- Menu -----");
        System.out.println("Digite o número da opção:");
        System.out.println("1. Atividade 1");
        System.out.println("2. Atividade 2");
        System.out.println("3. Atividade 3");
        System.out.println("4. Atividade 4");
        System.out.println("5. Atividade 5");
        System.out.println("6. Atividade 6");   
        System.out.println("7. Atividade 7");
        System.out.println("8. Atividade 8");
        System.out.println("9. Atividade 9");
        System.out.println("10. Atividade 10");
        System.out.println("0. Sair");
        opcao = entrada.nextInt();

        if(opcao == 1) {
        atividade1(entrada);
    } else if (opcao == 2) {
        atividade2(entrada);
    } else if (opcao == 3) {
        atividade3(entrada);
    } else if (opcao == 4) {
        atividade4(entrada);
    } else if (opcao == 5) {
        atividade5(entrada);
    } else if (opcao == 6) {
        atividade6(entrada);
    } else if (opcao == 7) {
        atividade7(entrada);
    } else if (opcao == 8) {
        atividade8(entrada);
    } else if (opcao == 9) {
        atividade9(entrada);
    } else if (opcao == 10) {
        atividade10(entrada);
    } else if (opcao == 0) {
        System.out.println("Saindo do programa...");
    } else {
        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
    }

    }

     while (opcao != 0);
}
    public static void atividade1(Scanner entrada) {
       System.out.println("Atividade 1: Executando código da Atividade 1");
       int numinteiro;

       System.out.println("Digite um número inteiro");
       numinteiro = entrada.nextInt();

       if (numinteiro % 2 == 0){
        System.out.println("O número informado é PAR.");
       }
       else {
        System.out.println("O número informado é ÍMPAR.");
       }
    
    }

    public static void atividade2(Scanner entrada) {
       System.out.println("Atividade 2: Executando código da Atividade 2");
       int numinteiroum, numinteirodois;

       System.out.println("Digite o primeiro número inteiro");
       numinteiroum = entrada.nextInt();
       System.out.println("Digite o segundo número inteiro");
       numinteirodois = entrada.nextInt();

       if (numinteiroum > numinteirodois){
        System.out.println("O primeiro número é maior que o segundo.");
       }
       else if (numinteiroum < numinteirodois) {
        System.out.println("O segundo número é maior que o primeiro.");
       }
       else {
        System.out.println("Os números são iguais.");
        
       }
    }

    public static void atividade3(Scanner entrad) {
       System.out.println("Atividade 3: Executando código da Atividade 3");

       double resultado;
        int n, n1, n2;

        do {
            System.out.println("----- CALCULADORA -----");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Voltar ao menu");
            n = entrada.nextInt();
            
            switch (n) {
                case 1:
                    System.out.println("Somar");
                    System.out.println("Digite um numero:");
                    n1 = entrada.nextInt();
                    System.out.println("Digite outro numero:");
                    n2 = entrada.nextInt();
                    result = n1 + n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("Subtrair");
                    System.out.println("Digite um numero:");
                    n1 = entrada.nextInt();
                    System.out.println("Digite outro numero:");
                    n2 = entrada.nextInt();
                    result = n1 - n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.println("Multiplicar");
                    System.out.println("Digite um numero:");
                    n1 = entrada.nextInt();
                    System.out.println("Digite outro numero:");
                    n2 = entrada.nextInt();
                    result = n1 * n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.println("Dividir");
                    System.out.println("Digite um numero:");
                    n1 = entrada.nextInt();
                    System.out.println("Digite outro numero:");
                    n2 = entrada.nextInt();
                    
                    if (n2 == 0) {
                        System.out.println("Erro: Não é possível dividir por zero.");
                    } else {
                        resultado = (double) n1 / n2; 
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
                case 0:
                    System.out.println("Voltando para o menu principal...");
                    break; 
                default:
                    System.out.println("Opção inválida.");
            }
        } while (n != 0);
    }

    public static void atividade4(Scanner entrada) {
       System.out.println("Atividade 4: Executando código da Atividade 4");

       System.out.println("----- VALIDAÇÃO DE ENTRADA -----");
        double nota;
        
        do {
            System.out.print("Digite uma nota válida (entre 0 e 10): ");
            nota = entrada.nextDouble();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Erro: A nota deve estar entre 0 e 10. Tente novamente!");
            }
            
        } while (nota < 0 || nota > 10); 
        
        System.out.println("Sucesso! A nota " + nota + " foi registrada.");
    }


    public static void atividade5(Scanner entrada) {
    System.out.println("Atividade 5: Executando código da Atividade 5");

    System.out.println("Digite um número (0 para sair):");
    float num = entrada.nextFloat();

    if (num == 0) {
        System.out.println("Nenhum número válido foi digitado.");
        return;
    }

    float maior = num;
    float menor = num;

    while (num != 0) {

        if (num > maior) {
            maior = num;
        }

        if (num < menor) {
            menor = num;
        }

        System.out.println("Digite outro número (0 para sair):");
        num = entrada.nextFloat();
    }

    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);
}

     

    public static void atividade6(Scanner entrada) {
       System.out.println("Atividade 6: Executando código da Atividade 6");

        float saldo, sacar, depositar, verSaldo, n1;
        saldo = 1000;
        int n;
        
        do{
            System.out.println("----- Simulador de caixa -----");
            System.out.println("1. Depositar: ");
            System.out.println("2. Sacar: ");
            System.out.println("3. Ver saldo: ");
            System.out.println("4. Sair: ");
            n = entrada.nextInt();
            switch (n){
                case 1 :
                    System.out.println("Depositar");
                    n1 = entrada.nextFloat();
                    depositar = saldo + n1;
                    saldo = depositar;
                    System.out.println("O seu saldo é: " + saldo);
                    break;
                case 2 :
                    System.out.println("Sacar");
                    n1 = entrada.nextFloat();
                    sacar = saldo - n1;
                    saldo = sacar;
                    System.out.println("O seu saldo é: " + saldo);
                    break;
                case 3 :
                    System.out.println("Ver saldo");
                    verSaldo = saldo;
                    System.out.println("O seu saldo é: " + verSaldo);
                    break;
                case 4 :
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida.");
            } 
        } while (n != 4); 
    }

    public static void atividade7(Scanner entrada) {
       System.out.println("Atividade 7: Executando código da Atividade 7");

        int valor;
                    int maior = Integer.MIN_VALUE;
                    int menor = Integer.MAX_VALUE;

                    do {
                        System.out.print("Número (0 para sair): ");
                        valor = entrada.nextInt();

                        if (valor != 0) {
                            if (valor > maior) maior = valor;
                            if (valor < menor) menor = valor;
                        }

                    } while (valor != 0);

                    System.out.println("Maior: " + maior);
                    System.out.println("Menor: " + menor);
    }

    public static void atividade8(Scanner entrada) {
       System.out.println("Atividade 8: Executando código da Atividade 8");

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;
        int numero;

        System.out.println("----- CONTADOR DE NÚMEROS -----");
        System.out.println("Por favor, digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = entrada.nextInt();

            if (numero > 0) {
                positivos++; 
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++; 
            }
        }

        System.out.println("----- RESULTADO FINAL -----");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }


    public static void atividade9(Scanner entrada) {
       System.out.println("Atividade 9: Executando código da Atividade 9");

       System.out.println("----- SOMA DE 1 ATÉ N -----");
        System.out.print("Digite o valor de N (um número inteiro positivo): ");
        int n = entrada.nextInt();
        int soma = 0;
        
        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que zero.");
        } else {
            for (int i = 1; i <= n; i++) {
                soma += i; 
            }
            
            System.out.println("A soma de todos os números de 1 até " + n + " é: " + soma);
        }
    }
    

    public static void atividade10(Scanner entrada) {
       System.out.println("Atividade 10: Executando código da Atividade 10");

       System.out.println("------ CONTAGEM REGRESSIVA E SOMA -----");
        System.out.print("Digite um número inteiro N (maior que zero): ");
        int n = entrada.nextInt();
        
        if (n <= 0) {
            System.out.println("Valor inválido! O número precisa ser maior que zero.");
        } else {
            int soma = 0;
            
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " "); 
                soma += i; 
            }
            
            System.out.println(); 
            System.out.println("Soma = " + soma);
        }
    }
}
