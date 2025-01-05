//Exercícios Propostos

//Faça um programa que receba a temperatura média dos 6
//primeiros meses do ano e armazene-as em uma lista.

//Após isto, calcule a média semestral das temperaturas e
//mostre todas as temperaturas acima desta média, e em que
//mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
//– Fevereiro e etc).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class exercicio1 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String[] mes = {"Janeiro", "Fevereiro","Março","Abril","Maio","Junho"};

        List<Double> temperaturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < mes.length; i++) {
            System.out.print("Digite a temperatura média de " + mes[i] + ": ");
            double temperatura = scanner.nextDouble();
            temperatura = scanner.nextDouble();
            temperaturas.add(temperatura);
        }

    double soma = 0;
    for (double temp : temperaturas){
        soma += temp;
    }    
    
    double mediaSemestral = soma / temperaturas.size();    
    System.out.println("\nA média semestral das temperaturas é: " + mediaSemestral);

    }

    
}