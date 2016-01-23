
import java.io.File;

public class FolderNumberOfChildCommand implements Command {

	@Override
	public String execute(File file) {
		return Integer.toString(file.list().length);
	}

	@Override
	public boolean fileCompatible() {
		return false;
	}

	@Override
	public boolean folderCompatible() {
		return true;
	}

	@Override
	public String getName() {
		return "Folder number of children";
	}

}
