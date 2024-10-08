package pac;

public class Client {
	public static void main(String[] args) {
		FileSystem file1 = new File("file1");
		FileSystem file2 = new File("file2");
		FileSystem file3 = new File("file3");
		FileSystem file4 = new File("file4");
		FileSystem file5 = new File("file5");
		
		Directory subDirectory = new Directory("subDirectory");
		subDirectory.addFile(new File("sub directory file1"));
		subDirectory.addFile(new File("subdirectory file2"));
		
		Directory directory = new Directory("directory1");
		directory.addFile(file1);
		directory.addFile(file2);
		directory.addFile(subDirectory);
		directory.addFile(file3);
		directory.addFile(file4);
		directory.addFile(file5);

		directory.ls();
	}
}
