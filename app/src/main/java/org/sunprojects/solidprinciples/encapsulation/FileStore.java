package org.sunprojects.solidprinciples.encapsulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author sunil
 */
public class FileStore {
    private Path workingDirectory;

    public Path getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(Path workingDirectory) {
        this.workingDirectory = workingDirectory;
    }
    
    public String Save(int id, String message) throws IOException {
        var path = getWorkingDirectory().toString() + id + ".txt";
        Files.write(Paths.get(path), message.getBytes());
        return path;
    }
    
    public void Read(int id) throws IOException {
        var path = getWorkingDirectory().toString() + id + ".txt";
        var msg = Files.readString(Paths.get(path));
    }
    
}
