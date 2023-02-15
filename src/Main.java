import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sexoMaior="";
        String sexoMenor="";
        int sexo;
        double altura;
        int numeroHomens=0;
        int numeromulheres=0;
        double mediaHomem=0;
        double mediaMulher=0;
        double alturaHomem=0;
        double alturaMulher=0;
        double totalHomem=0;
        double totalMulher=0;
        double maiorAltura=0;
        double menorAltura=10000000;
        double maior=0;
        double menor=0;
        double valor;
        double i;
        double j;
        Scanner s = new Scanner(System.in);
        //1 = homem;
        //2 = mulher;

        do {
            System.out.println("Digite o sexo");
            sexo = s.nextInt();
            System.out.println("Digite a altura");
            altura = s.nextDouble();

            if (sexo == 1) {
                numeroHomens++;
                totalHomem = totalHomem + altura;

            } else if (sexo == 2) {
                numeromulheres++;
                totalMulher += altura;
            } else {
                System.out.println("Comando inválido. Digite novamente");
            }

            if(altura>maiorAltura){
                maiorAltura=altura;
                if(sexo==1){
                    sexoMaior="Homem";
                }else {
                    sexoMaior="Mulher";
                }
            }

            if (altura<menorAltura) {
                menorAltura=altura;
                if (sexo==1) {
                    sexoMenor="Homem";
                } else {
                    sexoMenor="Mulher";
                }
            }


        } while (numeroHomens+numeromulheres < 5);
        System.out.println("A maior altura é " +maiorAltura+ " e é de um(a) " +sexoMaior);
        System.out.println("A menor altura é " +menorAltura+ " e é de um(a) " +sexoMenor);

        mediaHomem = totalHomem/numeroHomens;
        mediaMulher = totalMulher/numeromulheres;
        System.out.println("A média dos homens é " +mediaHomem);
        System.out.println("A média das mulheres é " +mediaMulher);
    }
}

