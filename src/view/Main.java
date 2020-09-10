package view;

import java.util.Scanner;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		RedesController redeController = new RedesController();
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(num!=1 && num!=2){
			System.out.println("Ver Adaptadores e IP - digite 1 /// Ver a media de ping para google.com.br - digite 2");
			num = scan.nextInt();
			scan.close();
			if (num == 1){
				redeController.ip();
			} else if (num == 2){
				redeController.ping();
			} else {
				num = 0;
			}
		
		
		}
		
	}

}
