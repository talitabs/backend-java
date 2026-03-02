package fundamentosSistemaNotasTurma;

import java.util.Locale;
import java.util.Scanner;


public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeAluno, maiorMediaNome, menorMediaNome;
		double nota1, nota2, media, maiorMedia, porcentagemAprovacaoTurma, menorMedia, mediaGeralTurma, somaMedias;
		int qtdAluno, contAprovado, contReprovado,condicao;
		
		
		
		do {
			
			contAprovado = 0;
			contReprovado = 0;
			somaMedias = 0;
			maiorMedia = 0;
			menorMedia = 0;
			maiorMediaNome = "";
			menorMediaNome = "";
			

			do {
				System.out.println("===SISTEMA DE NOTAS===");
				System.out.println("Quantos alunos? ");
				qtdAluno = sc.nextInt();
				if(qtdAluno >= 1) {
				
					for (int i = 1; i<=qtdAluno;i++) {
						System.out.println("-------------------");
						System.out.println("Nome do "+ i+"° aluno: ");
						nomeAluno = sc.next();
						
						do {
							System.out.println("Primeira nota: ");
							nota1 = sc.nextDouble();
							
							if(nota1 < 0 || nota1 > 10) {
								System.out.println("Nota Inválida");
								System.out.println("--------------------");
							}
						}while(nota1 < 0 || nota1 > 10);
							
						do {
							System.out.println("Segunda nota: ");
							nota2 = sc.nextDouble();
							
							if(nota2 < 0 || nota2 > 10) {
								System.out.println("Nota Inválida");
								System.out.println("--------------------");
							}
						}while(nota2 < 0 || nota2 > 10);
			
						
						media = (nota1+nota2)/2.0;
						System.out.printf("Media do aluno (%s): %.2f%n",nomeAluno, media);
						
						if (media >= 6) {
							contAprovado += 1;
						}
						else {
							contReprovado += 1;
						}
						
	
						 if (i == 1) {
		                        maiorMedia = media;
		                        menorMedia = media;
		                        maiorMediaNome = nomeAluno;
		                        menorMediaNome = nomeAluno;
		                    } else {
	
		                        if (media > maiorMedia) {
		                            maiorMedia = media;
		                            maiorMediaNome = nomeAluno;
		                        }
	
		                        if (media < menorMedia) {
		                            menorMedia = media;
		                            menorMediaNome = nomeAluno;
		                        }
		                    }
						
					somaMedias += media;	
					}
					
					mediaGeralTurma = somaMedias/qtdAluno;
					porcentagemAprovacaoTurma = (double) contAprovado * 100/qtdAluno;
					System.out.println("===== RELATÓRIO =====");
					System.out.println("Aprovados: " + contAprovado);
					System.out.println("Reprovados: " + contReprovado);
					System.out.printf("Percentual de aprovação: %.2f%n", porcentagemAprovacaoTurma);
					System.out.printf("Maior média: %.2f (%s)%n", maiorMedia, maiorMediaNome);
					System.out.printf("Menor média: %.2f (%s)%n", menorMedia, menorMediaNome);
					System.out.printf("Média geral da turma: %.2f%n", mediaGeralTurma);
				}
				
				else {
					System.out.println("Quantidade de Alunos inválida...");
				}
			}while(qtdAluno<=0);
			
			do {

				System.out.println("Deseja continuar com outra turma? [1] SIM [2] NÃO");
				condicao = sc.nextInt();
				if (condicao != 1 && condicao != 2) {
					System.out.println("Opção inválida");
				}
				else {
					if (condicao == 1) {
						System.out.println("=============================");	
					}
					else {
						System.out.println("====OBRIGADA====");
					}
				}
				
			}while(condicao != 1 && condicao != 2);
			
		}while(condicao == 1);
		
		sc.close();			
			
	}

 }

