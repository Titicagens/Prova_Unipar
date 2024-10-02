import java.util.Scanner;

    public class LIstaDeAlimentos{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Digite a quantidade de alimentos: ");
            int quantidade = scanner.nextInt();


            if (quantidade <= 0) {
                System.out.println("A quantidade deve ser maior que zero.");
                return;
            }


            double[] avaliacoes = new double[quantidade];


            for (int i = 0; i < quantidade; i++) {
                while (true) {
                    System.out.print("Digite a nota para o alimento " + (i + 1) + " (0 a 10): ");
                    double nota = scanner.nextDouble();


                    if (nota >= 0 && nota <= 10) {
                        avaliacoes[i] = nota;
                        break;
                    } else {
                        System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
                    }
                }
            }


            double soma = 0;
            int bons = 0;
            int ruins = 0;

            for (double nota : avaliacoes) {
                soma += nota;
                if (nota >= 6) {
                    bons++;
                } else {
                    ruins++;
                }
            }

            double media = soma / quantidade;


            System.out.printf("\nMédia das avaliações: %.2f\n", media);
            System.out.println("Quantidade de alimentos avaliados como bons: " + bons);
            System.out.println("Quantidade de alimentos avaliados como ruins: " + ruins);

            scanner.close();
        }
    }


