package executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import classes.Funcionario;

public class Principal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int [][] matriz = new int[M][N];
		
		for(int i = 0; i < matriz.length; i++) { // Linha
			for( int j = 0; j < matriz[i].length; j++) { // Coluna
				matriz[i][j] = sc.nextInt();
				
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Posição " + i + ", " + j + ":");
					if(j > 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Cima: " + matriz[i-1][j]);
					}
					if(j < matriz[i].length -1) {
						System.out.println("Direita: " + matriz[i][1+j]);
					}
					if(i <  matriz.length -1) {
						System.out.println("Baixo: " + matriz[i + 1][j]);
					}
				}
			}
		}
		
		
	sc.close();
	}
	
}
