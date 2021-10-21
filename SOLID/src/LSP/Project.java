package LSP;

import java.util.Vector;

public class Project {
	public Vector<ProjectFile> files = new Vector<ProjectFile>();

	public void addProject(ProjectFile p) {
		files.add(p);
	}

	public void loadAllFiles() {
		for (ProjectFile f : files)
			f.loadFile();
	}

	public void storeAllFiles() {
		for (ProjectFile f : files)
			f.storeFile();
	}
}
