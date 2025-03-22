package com.rajat.botscript;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScriptStorage {
    private static final String SCRIPT_PATH = "config/botscript/script.txt";

    public static void saveScript(String script) {
        try {
            Files.write(Paths.get(SCRIPT_PATH), script.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String loadScript() {
        try {
            return new String(Files.readAllBytes(Paths.get(SCRIPT_PATH)));
        } catch (IOException e) {
            return "";
        }
    }
}
