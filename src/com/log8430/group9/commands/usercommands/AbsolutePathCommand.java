package com.log8430.group9.commands.usercommands;

import java.io.File;

import com.log8430.group9.commands.Command;

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
		return "Absolute path";
	}

}
