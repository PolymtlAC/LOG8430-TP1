import java.io.File;

public interface Command {
	
	public String execute(File file);
	
	public boolean fileCompatible();
	
	public boolean folderCompatible();
	
	public String getName();
	
}
