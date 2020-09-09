package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	public RedesController() {
		super();
	}
	
	public void ip() {
		String os = System.getProperty("os.name");
		String process = null;
		System.out.println(os);
		if(os.equals("Windows 10")) {
			process = "ipconfig";
		}
		
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			String adaptador = null;
			while (linha != null) {
				if(linha.contains("Adaptador")) {
					adaptador = linha;
				} else if (linha.contains("IPv4.")) {
					System.out.println(adaptador+" "+linha);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
