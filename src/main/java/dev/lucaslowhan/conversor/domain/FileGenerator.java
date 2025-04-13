package dev.lucaslowhan.conversor.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    public void saveJsonFile(Conversion conversion) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter("log.json");
        writer.write(gson.toJson(conversion));
        writer.close();
    }
}
