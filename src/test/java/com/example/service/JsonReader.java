package com.example.service;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {
    private static final JSONObject locatorJson;
    private static final JSONObject urlJson;
    private static final JSONObject dataJson;

    static {
        try {
            urlJson = loadJson("src/test/resources/prod/url.json");
            locatorJson = loadJson("src/test/resources/prod/locator.json");
            dataJson = loadJson("src/test/resources/prod/data.json");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load JSON file");
        }
    }

    private static JSONObject loadJson(String filePath) throws IOException {
        String content = Files.readString(Paths.get(filePath));
        return new JSONObject(content);
    }

    public static String getLocator(String key) {
        return locatorJson.optString(key, null);
    }

    public static String getUrl(String key) {
        return urlJson.optString(key, null);
    }

    public static String getData(String key) {
        return dataJson.optString(key, null);
    }
}
