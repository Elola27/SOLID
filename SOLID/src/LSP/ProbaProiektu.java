package LSP;

public class ProbaProiektu {

	public static void main(String[] args) {
		Project a= new Project();
		ProjectFile b= new ProjectFile("a.txt");
		ReadOnlyProjectFile c= new ReadOnlyProjectFile("b.jpg");
		ProjectFile d= new ProjectFile("c.pdf");
		
		a.addProject(b);
		a.addProject(c);
		a.addProject(d);
		
		a.storeAllFiles();
		a.loadAllFiles();
		

	}

}
