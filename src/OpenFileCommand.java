import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFileCommand implements Command {
	
	@Override
	public String execute(File file) {
		if(!Desktop.isDesktopSupported()){
            return "Desktop is not supported, the file can't be opened.";
        }
         
        Desktop desktop = Desktop.getDesktop();
		try {
			desktop.open(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return "Done !";
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
		return "Open file";
	}
	
}

