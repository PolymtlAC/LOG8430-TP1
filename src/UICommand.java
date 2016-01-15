import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UICommand extends JPanel {
	
	protected Command command;
	protected JButton commandButton;
	protected JLabel commandResult;
	protected File currentFile;
	
	public UICommand(Command command) {
		this.command = command;
		this.commandButton = new JButton(command.getName());
		this.commandButton.setEnabled(false);
		this.commandResult = new JLabel();
		
		this.commandButton.addActionListener(event -> {
			this.execute();
		});
		
		this.setLayout(new GridLayout(1,2));
		this.setMaximumSize(new Dimension(800,50));
		this.add(this.commandButton);
		this.add(this.commandResult);
	}

	public void execute() {
		this.commandResult.setText(this.command.execute(currentFile));
	}
	
	public void clear() {
		this.commandResult.setText("");
	}
	
	public void setCurrentFile(File file) {
		this.currentFile = file;
		this.commandButton.setEnabled(this.isEnabled());
		this.clear();
	}
	
	public boolean isEnabled() {
		if(this.currentFile.isDirectory() && !this.command.folderCompatible()) {
			return false;
		} else if(!this.currentFile.isDirectory() && !this.command.fileCompatible()) {
			return false;
		} else {
			return true;
		}
	}
	
}
