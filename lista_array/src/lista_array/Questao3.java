package lista_array;
import java.util.Scanner;
public class Questao3 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\"Qual o melhor Sistema Operacional para uso em servidores?\"");
		System.out.println("As possíveis respostas são:");
		System.out.println("1- Windows Server");
		System.out.println("2- Unix");
		System.out.println("3- Linux");
		System.out.println("4- Netware");
		System.out.println("5- Mac OS");
		System.out.println("6- Outro");
		
		int[] resposta = new int[10000];
		int i = 0;
		int pergunta = 0;
		
		int respostaporcentagem = 0;
		
		String[] categorias = new String[] {"Windows Server","Unix","Linux","Netware","Mac OS","Outro"};
		
		float[] resQuantidade = new float[6];
		float[] porcent = new float[6]; 
		
		pergunta = read.nextInt();
		
		while(pergunta != 0) {
			
			resposta[i] = pergunta;
			
			if(resposta[i] == 1) {
				resQuantidade[0] += 1;
			}else if(resposta[i] == 2) {
				resQuantidade[1] += 1;
			}else if(resposta[i] == 3) {
				resQuantidade[2] += 1;
			}else if(resposta[i] == 4) {
				resQuantidade[3] += 1;
			}else if(resposta[i] == 5) {
				resQuantidade[4] += 1;
			}else if(resposta[i] == 6) {
				resQuantidade[5] += 1;
			}
			
			i += 1;
			
			System.out.println("\"Qual o melhor Sistema Operacional para uso em servidores?\"");
			System.out.println("As possíveis respostas são:");
			System.out.println("1- Windows Server");
			System.out.println("2- Unix");
			System.out.println("3- Linux");
			System.out.println("4- Netware");
			System.out.println("5- Mac OS");
			System.out.println("6- Outro");
			
			pergunta = read.nextInt();
		}
		
		float total = 0;
		total = resQuantidade[0] + resQuantidade[1] + resQuantidade[2] + resQuantidade[3] + resQuantidade[4] + resQuantidade[5];
		
		for(int j = 0; j < porcent.length; j++) {
			
			porcent[j] = (resQuantidade[j] / total) * 100;
			
		}
		
		int[] resMaior = new int[6];
		String MaisVotado = "";
		float porcentMaisVotado = 0;
		float quantidadeMaior = 0;
		
		for(int m = 0; m < resQuantidade.length; m++) {
			
			for(int n = 0; n < resQuantidade.length; n++) {
				
				if(resQuantidade[m] > resQuantidade[n] ) {
					
					resMaior[m] += 1;
					
					if(resMaior[m] == 5) {
						
						MaisVotado = categorias[m];
						porcentMaisVotado = porcent[m];
						quantidadeMaior = resQuantidade[m];
						
					}
					
				}else if(resQuantidade[m] == resQuantidade[n] || resQuantidade[m] <= resQuantidade[n]) {
					continue;
				}
			}
		}
		
for(int b = 0; b < resMaior.length; b++) {
			System.out.println(resMaior[b]);
			
		}
		

		
		for(int x = 0; x < resMaior.length; x++) {
			
			for(int z = 0; z < resMaior.length; z++) {
				
				if(resMaior[x] == 1 && resMaior[z] == 1) {
					
					if(porcent[x] > porcent[z] && resQuantidade[x] > resQuantidade[z]){
						MaisVotado = categorias[x];
						porcentMaisVotado = porcent[x];
						quantidadeMaior = resQuantidade[x];
					}
					
				}else if(resMaior[x] == resMaior[z] || resMaior[x] < resMaior[z]) {
					continue;

				}
			}	
		}
		
		System.out.println("Sistema Operacional    Votos     %");
		System.out.println("-------------------    ------   ---");
		System.out.println("Windows Server          "+ resQuantidade[0] + "   " + porcent[0]+ "%") ;
		System.out.println("Unix                    "+ resQuantidade[1] + "   " + porcent[1]+ "%");
		System.out.println("Linux               	"+ resQuantidade[2] + "   " + porcent[2]+ "%");
		System.out.println("Netware             	"+ resQuantidade[3] + "   " + porcent[3]+ "%");
		System.out.println("Mac OS              	"+ resQuantidade[4] + "   " + porcent[4]+ "%");
		System.out.println("Outro               	"+ resQuantidade[5] + "   " + porcent[5]+ "%");
		System.out.println("-------------------    ---------");
		System.out.println("Total                    " + total);
		String valorFormatado = String.format("%.2f", porcentMaisVotado);
		System.out.println("O Sistema Operacional mais votado foi o " + MaisVotado + ", com "+ quantidadeMaior +" votos, correspondendo a "+ valorFormatado + "% dos votos.");
		
	}
}
