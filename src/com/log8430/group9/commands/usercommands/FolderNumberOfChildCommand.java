package com.log8430.group9.commands.usercommands;

import java.io.File;

import com.log8430.group9.commands.Command;

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
