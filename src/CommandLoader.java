
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class CommandLoader extends ClassLoader{

    public CommandLoader(ClassLoader parent) {
        super(parent);
    }

    /**
     * Load a class of the commands folder.
     * 
     * @return a Class of the commands folder
     */
    public Class loadClass(String name) throws ClassNotFoundException {
    	if(name.contains("Command") && name != "Command") {
    		return super.loadClass(name);
    	}
    	
		try {
			System.out.println(name);
			InputStream input = new FileInputStream("commands/"+name+".class");
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	        int data = input.read();

	        while(data != -1){
	            buffer.write(data);
	            data = input.read();
	        }

	        input.close();

	        byte[] classData = buffer.toByteArray();

	        return this.defineClass(name, classData, 0, classData.length);
		} catch (IOException e) {
			e.printStackTrace();
		}

        return null;
    }
    
    /**
     * Create an instance of a Command class loaded dynamically.
     * 
     * @param name the file name of the command without extension
     * @return an instance of the command Class
     */
    public Command loadCommand(String name) {
		try {
			Class commandClass = this.loadClass(name);
			return (Command) commandClass.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    /**
     * Loads all commands located in the commands directory.
     * 
     * @return a list of Command instances
     */
    public ArrayList<Command> loadAllCommands() {
    	ArrayList<Command> commands = new ArrayList<>();
    	File commandFolder = new File("commands");
    	for(File commandClassFile : commandFolder.listFiles()) {
    		commands.add(this.loadCommand(commandClassFile.getName().replaceFirst("[.][^.]+$", "")));
    	}
    	return commands;
    }

}