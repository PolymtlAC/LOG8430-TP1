package com.log8430.group9.commands.usercommands;

import java.io.File;

import com.log8430.group9.commands.Command;

public class FolderNameCommand implements Command {

	@Override
	public String execute(File file) {
		return file.getName();
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
		return "Folder name";
	}

}
