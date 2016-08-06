package com.codekul.brushup.file;


import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 * Created by aniruddha on 6/8/16.
 */
public class FileTool {

    public void writeFile() throws IOException {

        Path path =
                Paths.get("/home/aniruddha/just/my.txt");

        if(!Files.exists(path))
            Files.createFile(path);

        String data = "codekul android";
        Files.write(path,data.getBytes(),
                StandardOpenOption.APPEND);
    }

    public void readFile() throws IOException {

        Path path = Paths.get("/home/aniruddha/just/my.txt");
        byte []rawData = Files.readAllBytes(path);
        String data = new String(rawData);
        System.out.println(data);
    }

    public void copy(String source, String destination) throws IOException{

        Path pathSource = Paths.get(source);

        Path pathDestination = Paths.get(destination);

        Files.copy(pathSource,pathDestination,StandardCopyOption.REPLACE_EXISTING);
    }
}
