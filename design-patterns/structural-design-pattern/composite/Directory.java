package pac;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
	private String directoryName;
	private List<FileSystem> files;

	public Directory(String name) {
		this.directoryName = name;
		files = new ArrayList<>();
	}

	public void addFile(FileSystem fileSystem) {
		files.add(fileSystem);
	}

	@Override
	public void ls() {
		System.out.println("Directory name: " + directoryName);
		for (FileSystem fileSystem : files) {
			fileSystem.ls();
		}
	}
}