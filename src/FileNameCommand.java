import java.io.File;

public class FileNameCommand implements Command {

	@Override
	public String execute(File file) {
		return file.getName();
	}

	@Override
	public boolean fileCompatible() {
		return true;
	}

	@Override
	public boolean folderCompatible() {
		return false;
	}

	@Override
	public String getName() {
		return "File name";
	}

}
