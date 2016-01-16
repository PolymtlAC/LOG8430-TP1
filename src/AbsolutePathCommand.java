import java.io.File;

public class AbsolutePathCommand implements Command {

	@Override
	public String execute(File file) {
		return file.getAbsolutePath();
	}

	@Override
	public boolean fileCompatible() {
		return true;
	}

	@Override
	public boolean folderCompatible() {
		return true;
	}

	@Override
	public String getName() {
		return "Absolute path ";
	}

}
