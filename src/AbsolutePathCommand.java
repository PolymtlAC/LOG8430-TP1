import java.io.File;

public class AbsolutePathCommand implements Command {

	@Override
	public String execute(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean fileCompatible() {
		return true;
	}

	@Override
	public boolean folderCompatible() {
		return true;
	}

}