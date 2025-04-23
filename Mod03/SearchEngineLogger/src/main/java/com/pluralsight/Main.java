package com.pluralsight;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {
    String logFile;
    DateTimeFormatter formatter;

    public Main(String logFile) {
        this.logFile = logFile;
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }
    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }
    String getLogFile() {
        return logFile;
    }
    public void logAction(String action) {
        try(FileWriter writer = new FileWriter(logFile, true)) {
            String timestamp = LocalDateTime.now().format(formatter);
            writer.write(timestamp + " " + action + "\n");
        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }

}
