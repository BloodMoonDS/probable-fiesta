package eu.freecluster.bloodieysart.probablefiesta;

public class Main {

	public static void main(String[] args) {
		OglRenderer rnd = new OglRenderer();
		rnd.run();
		
	}
	public void createErrorMsg() {
		Form1 mainWindow = new Form1();
		mainWindow.create(640, 480, "Probable Fiesta");
		mainWindow.show();
		mainWindow.execute();
		
	}
}
