package view;

import java.util.Scanner;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		RedesController redeController = new RedesController();
		Scanner scan = new Scanner(System.in);
		String num = null;
		do {
			System.out.println("Ver Adaptadores e IP - digite 1 /// Ver a media de ping para google.com.br - digite 2");
			num = scan.nextLine();
			
			if (num.equals("1")){
				redeController.ip();
			} else if (num.equals("2")){
				redeController.ping();
			} else {
				System.out.println("Valor invalido, digite novamente");
				System.out.println("");
				num = null;
			}
		
		
		}while(!num.equals("1") && !num.equals("2"));
		scan.close();
		
	}

}
