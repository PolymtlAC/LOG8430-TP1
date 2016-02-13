package com.log8430.group9.tests;
import java.io.File;
import java.util.ArrayList;

import com.log8430.group9.commands.Command;
import com.log8430.group9.commands.CommandLoader;
import com.log8430.group9.commands.usercommands.AbsolutePathCommand;
import com.log8430.group9.commands.usercommands.FileNameCommand;
import com.log8430.group9.commands.usercommands.FolderNameCommand;
import com.log8430.group9.commands.usercommands.FolderNumberOfChildCommand;
import com.log8430.group9.commands.usercommands.ParentCommand;

import junit.framework.TestCase;

public class CommandTest extends TestCase {

	private AbsolutePathCommand absolutePathCommand;
	private FileNameCommand fileNameCommand;
	private FolderNameCommand folderNameCommand;
	private FolderNumberOfChildCommand folderNumberOfChildCommand;
	private ParentCommand parentCommand;
	private File fileTest;
	private File folderTest;
	
	private CommandLoader commandLoader;
	
	protected void setUp() throws Exception {
		super.setUp();
		this.absolutePathCommand = new AbsolutePathCommand();
		this.fileNameCommand = new FileNameCommand();
		this.folderNameCommand = new FolderNameCommand();
		this.folderNumberOfChildCommand = new FolderNumberOfChildCommand();
		this.parentCommand = new ParentCommand();
		this.fileTest = new File("dossierTest/fichierTest");
		this.folderTest = new File("dossierTest");
		
		this.commandLoader = new CommandLoader(CommandLoader.class.getClassLoader());
	}
	
	public void testAbsolutePath() {
		assertTrue(this.fileTest.getAbsolutePath().equals(this.absolutePathCommand.execute(this.fileTest)));
	}
	
	public void testFileName() {
		assertTrue(this.fileNameCommand.execute(this.fileTest).equals("fichierTest"));
	}
	
	public void testFolderName() {
		assertTrue(this.folderNameCommand.execute(this.folderTest).equals("dossierTest"));
	}
	
	public void testFolderNumberOfChild() {
		assertTrue(this.folderNumberOfChildCommand.execute(this.folderTest).equals("1"));
	}
	
	public void testParentName() {
		assertTrue(this.parentCommand.execute(this.fileTest).equals("dossierTest"));
	}
	
	public void testCommandLoader() {
		ArrayList<Command> commands = this.commandLoader.loadAllCommands();
		String[] tab = {"Absolute path", "File name", "Folder name", "Folder number of children", "Open", "Parent name"};
		for (int i=0;i<tab.length;i++) {
			assertTrue(commands.get(i).getName().equals(tab[i]));
		}
	}

}
