package com.example.page.reader;


import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {
    private static final JSONObject jsonObject;

    static {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/test/locator.json")));
            jsonObject = new JSONObject(content);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load JSON file");
        }
    }

    public static String getLocator(String key) {
        return jsonObject.getString(key);
    }
}
