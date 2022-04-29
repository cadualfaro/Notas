/*
Faça um programa que lê 5 notas de um aluno e mostra na tela
A média das notas
A menor nota
 */
package programa3;
import java.util.Scanner;
public class Programa3 {

    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        
        double nota = 0;
        double v[];
        v = new double[5];
        double maior = 0;
        //Entrada de notas
        for(int i=0;i<5;i++){
            System.out.println("Digite a " +(i+1)+ " nota do aluno: ");
                v[i] = my_scan.nextDouble();
        }
        //Variável "menor" declarada com o valor da primeira posição do vetor (depois dos valores digitados)
        double menor = v[0];
        //Cálculo da média
        for(int i=0;i<5;i++){
            nota = v[i]+nota;
        }
        double media = nota/5;
            System.out.println("\nA media do aluno e: "+media);
        //Mostrar o menor valor
        for(int i=0;i<5;i++){
            if(v[i]>maior){
                maior = v[i];
            }
            else if(v[i]<menor){
                menor = v[i];
            }
        }
        System.out.println("\nA menor nota e: "+menor);
    }
}
