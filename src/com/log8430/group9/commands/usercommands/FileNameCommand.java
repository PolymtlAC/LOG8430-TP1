package com.log8430.group9.commands.usercommands;

import java.io.File;

import com.log8430.group9.commands.Command;

public class FileNameCommand implements Command {

	@Override
	public String execute(File file) {
		return file.getName();
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
		return "File name";
	}

}
