package com.codekul.brushup.file;

import java.io.IOException;

/**
 * Created by aniruddha on 6/8/16.
 */
public class Main {

    public static void main(String[] args) {

        FileTool tool =
                new FileTool();

        try {
            tool.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            tool.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            tool.copy("/home/aniruddha/just/my.txt",
                    "/home/aniruddha/uuuu.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
