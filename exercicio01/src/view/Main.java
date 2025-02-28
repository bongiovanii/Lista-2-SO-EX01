package view;
import java.util.Scanner;

import controller.RedesController;
public class Main {
	public static void main(String[]args) {
		RedesController redeCont = new RedesController();
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		String sistema ="";
		String proc = "IPCONFIG";
		
		while(opc!=9) {
			System.out.println("Menu Exercício 01 \n1-Mostrar SO\n2-Verifica IP\n3-Chamada do PING\n9-Sair");
			opc = sc.nextInt();
			
			switch(opc) {
				case 1:
					sistema = redeCont.os(sistema);					
					break;
				case 2:
					redeCont.ip(sistema, proc);
						
					break;
				case 3:
					
					break;
				case 9:
					
					break;
				default:
					System.out.println("Insira um valor válido");
					break;
			}
		}
	}

}