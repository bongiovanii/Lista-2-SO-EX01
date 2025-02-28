package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RedesController {
	public RedesController() {
		super();
	}
	
	public String os(String sistema) {
		String os = System.getProperty("os.name");
		String version =  System.getProperty("os.version");
		String arch = System.getProperty("os.arch");
		System.out.println(os + " - " + version + " - " + arch);
		
		sistema = os;
		return sistema;
		
	}
	
	public void ip(String sistema, String proc) {
		
		boolean contemWindows = sistema.contains("Windows");
		boolean contemLinux = sistema.contains("Linux");
		
		
		if(contemWindows == true) {
			System.out.println("contem windows, pode chamar ip windows");
			callProcess(proc);
		}
		else if(contemLinux == true) {
			System.out.println("contem linux, pode chamar ip linux");

		}
	}
	

	public void callProcess(String proc) {
	    try {
	        
	        String[] cmdArray = {"cmd.exe", "/c", proc};
	        
	        Process process = Runtime.getRuntime().exec(cmdArray);
	        
	        
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
		        if(line.contains("IPv4")) {
		        	System.out.println(line);
		        }
	        }
	        
	        // Espera o processo terminar (opcional)
	        process.waitFor();
	        
	    } catch (Exception e) {
	        String msg = e.getMessage();
	        System.out.println("Erro: " + msg);
	    }
	}


}
