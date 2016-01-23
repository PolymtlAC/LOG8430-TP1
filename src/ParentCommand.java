
import java.io.File;

public class ParentCommand implements Command {

	@Override
	public String execute(File file) {
		return file.getParentFile().getName();
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
		return "Parent name";
	}

}