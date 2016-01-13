import java.io.File;

public class FolderNameCommand implements Command {

	@Override
	public String execute(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean fileCompatible() {
		return false;
	}

	@Override
	public boolean folderCompatible() {
		return true;
	}

}
