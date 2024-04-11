package Desafios;

import java.util.Scanner;

public class StatsFutebol {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont_time, cont_jog, idade;
        double peso, alt, qtde = 0, media_idade, media_altura = 0, porc, tot80 = 0;
        
        for (cont_time = 1; cont_time <= 5; cont_time++) {
            media_idade = 0;
            
            for (cont_jog = 1; cont_jog <= 11; cont_jog++) {
                System.out.println("Informe a idade, peso e altura do jogador " + cont_jog + " do time " + cont_time + ":");
                idade = scanner.nextInt();
                peso = scanner.nextDouble();
                alt = scanner.nextDouble();
                
                if (idade < 18) {
                    qtde++;
                }
                
                media_idade += idade;
                media_altura += alt;
                
                if (peso > 80) {
                    tot80++;
                }
            }
            
            System.out.println("Média de idade do time " + cont_time + ": " + (media_idade / 11));
        }
        
        System.out.println("Quantidade de jogadores menores de 18 anos: " + qtde);
        System.out.println("Média de altura de todos os jogadores: " + (media_altura / 55));
        porc = (tot80 * 100) / 55;
        System.out.println("Porcentagem de jogadores com peso maior que 80kg: " + porc);
    }
}