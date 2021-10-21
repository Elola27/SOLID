package LSP;

public class ReadOnlyProjectFile extends ProjectFile {
	public ReadOnlyProjectFile(String filePath) {
		super(filePath);
// TODO Auto-generated constructor stub
	}

	public void storeFile() {
		System.out.println("ERROR, can not be Saved");
	}
}