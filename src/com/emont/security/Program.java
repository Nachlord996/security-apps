package com.emont.security;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program {

    private static String CONFIG_FILE_PATH = "data/config.json";
    private static String CONNECTION_HOST;
    private static String CONNECTION_USERNAME;
    private static String CONNECTION_PASSWORD;

    public static void main(String[] args) {
        try{
            initialize(CONFIG_FILE_PATH);
            Database db = new Database("jdbc:postgresql://", 5432, "apps_seguridad");
            db.initConnection(CONNECTION_HOST, CONNECTION_USERNAME, CONNECTION_PASSWORD);
            Application main_app = new Application("app_seguridad", db);
            clearConnectionInfo();
        } catch (Exception e){
            System.out.println("Fatal Error occurred, exiting...\n" + e.getMessage());
        }
    }

    private static void initialize(String configurationFilePath) throws Exception {
        try {
            Object parsedFile = new JSONParser().parse(new FileReader(configurationFilePath));
            JSONObject configOptions = (JSONObject) parsedFile;

            CONNECTION_HOST = (String) configOptions.get("host");
            CONNECTION_USERNAME = (String) configOptions.get("user");
            CONNECTION_PASSWORD = (String) configOptions.get("password");

        }
        catch (FileNotFoundException e){
            throw new Exception("Config file not found");
        }
        catch (Exception e){
            throw new Exception("Error while parsing config content");
        }
        if (CONNECTION_HOST == null || CONNECTION_USERNAME == null || CONNECTION_PASSWORD == null){
            throw new Exception("Missing connection field");
        }
    }

    private static void clearConnectionInfo(){
        CONNECTION_HOST = null;
        CONNECTION_USERNAME = null;
        CONNECTION_PASSWORD = null;
    }

}
