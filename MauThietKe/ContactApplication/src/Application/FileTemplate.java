package Application;

public abstract class FileTemplate {
	protected static String nameFile = "dataApp.txt";
	abstract boolean writeData();
	abstract boolean readData();

}
