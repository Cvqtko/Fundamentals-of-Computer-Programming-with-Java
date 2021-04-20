
public class FileParseException extends Exception {
	private String fileName;
	private int line;

	public FileParseException(String msg, String filename, int line) {
		super(msg);
		this.fileName = filename;
		this.line = line;
	}

	public String getFileName() {
		return fileName;
	}

	public int getLine() {
		return line;
	}
}
