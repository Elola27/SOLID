package LSP;

public class ProjectFile {
	public String filePath;

	public ProjectFile(String filePath) {
		this.filePath = filePath;
	}

	public void loadFile() {
		System.out.println("file loaded from " + filePath);
	}

	public void storeFile() {
		System.out.println("file saved to " + filePath);
	}
}