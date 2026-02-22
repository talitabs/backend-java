package javaFundamentosSistemaMercado;
import java.util.Scanner;


public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcaoMenu, opcaoProduto, quantidadeProduto, contQuantidade;
		double precoProduto,totalParcial, totalFinal, desconto;

		totalParcial = 0;
		contQuantidade = 0;
		totalFinal = 0;
		
		// ===== MENU PRINCIPAL DO SISTEMA =====
		// O sistema permanece executando até o usuário escolher sair
		do {
			
			System.out.println("======== MENU MERCADO ========");
			System.out.println("[1] Adiconar produto");
			System.out.println("[2] Ver total parcial");
			System.out.println("[3] Finalizar Compra");
			System.out.println("[4] Sair");
			opcaoMenu = sc.nextInt();
			
			if (opcaoMenu >=1 && opcaoMenu <= 4) {
				
				// Estrutura de decisão principal do sistema		
				switch(opcaoMenu) {
				case 1:
					// ===== SUBMENU DE PRODUTOS =====
					// Permanece ativo até o usuário escolher voltar ao menu principal
					do {
						System.out.println("======= PRODUTOS ========");
						System.out.println("1 - Arroz (R$ 25.00)");
						System.out.println("2 - Feijão (R$ 8.00)");
						System.out.println("3 - Carne (R$ 40.00)");
						System.out.println("4 - Refrigerante (R$ 6.00)");
						System.out.println("5 - VOLTAR AO MENU");
						opcaoProduto = sc.nextInt();
						
						if (opcaoProduto >=1 && opcaoProduto <= 4) {
							System.out.println("Quantidades: ");
							quantidadeProduto = sc.nextInt();
							// Valida se a quantidade digitada é maior que zero
							if(quantidadeProduto > 0) {
								switch(opcaoProduto) {
								case 1:
									precoProduto = 25 * quantidadeProduto;
									contQuantidade += quantidadeProduto;
									totalParcial += precoProduto;
									break;
								case 2:
									precoProduto = 8 * quantidadeProduto;
									contQuantidade += quantidadeProduto;
									totalParcial += precoProduto;
									break;
								case 3:
									precoProduto = 40 * quantidadeProduto;
									contQuantidade += quantidadeProduto;
									totalParcial += precoProduto;
									break;
								case 4:
									precoProduto = 6 * quantidadeProduto;
									contQuantidade += quantidadeProduto;
									totalParcial += precoProduto;
									break;
								default:
									break;
								}
							}
							else {
								System.out.println("Quantidade Inválida");
							}
						}
						else if (opcaoProduto == 5) {
							System.out.println("VOLTANDO AO MENU...");
						}
						else {
							System.out.println("Opção inválida, tente novamente");
						}
					}while(opcaoProduto != 5);
					break;
					
				case 2:
					if (contQuantidade == 0) {
						System.out.println("======== VALOR PARCIAL ========");
						System.out.println("Nenhum produto adcionado até o momento");
						System.out.println("VOLTANDO AO MENU...");
					}
					else {
						System.out.println("======== VALOR PARCIAL ========");
						System.out.printf("R$%.2f%n", totalParcial);
						System.out.println("Quantidade total de produtos: "+ contQuantidade);
						System.out.println("VOLTANDO AO MENU...");
						
					}
					break;
					
				case 3:
					// ===== FINALIZAÇÃO DA COMPRA =====

					// Zera o desconto para evitar valor residual de execuções anteriores
					desconto = 0;
					if (totalParcial >= 100) {
						// Aplica 10% de desconto para compras acima de 100
						desconto = totalParcial * 0.10;
						
					}
					totalFinal = totalParcial - desconto;			

					
					if (contQuantidade > 0) {
						System.out.println("==============================");
						System.out.println("RESUMO DA COMPRA");
						System.out.println("Quantidade total de itens: "+ contQuantidade);
						System.out.printf("Total bruto: R$%.2f%n", totalParcial);
						System.out.printf("Desconto: R$%.2f%n", desconto);
						System.out.printf("Total final: R$%.2f%n", totalFinal);
						System.out.println("==============================");
					}
					else {
						System.out.println("==============================");
						System.out.println("RESUMO DA COMPRA");
						System.out.println("Nenhum produto adcionado até o momento");
						System.out.println("VOLTANDO AO MENU...");
					}
					break;
					
				case 4:
					System.out.println("======== MUITO OBRIGADA ========");
					break;
				
				}
			}
			else {
				System.out.println("Opção inválida, tente novamente");
			}
		}while(opcaoMenu != 4);
		
		sc.close();
		
		
	}

}
