package controller;

public class RedesController {
	public RedesController() {
		super();
	}
	
	public void os() {
		String os = System.getProperty("os.name");
		String version =  System.getProperty("os.version");
		String arch = System.getProperty("os.arch");
		System.out.println(os + " - " + version + " - " + arch);
		
	}

}
