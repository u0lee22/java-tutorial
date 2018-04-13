package study.ad.utils;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FileManager {
    String savePath = System.getProperty("user.dir") + "/adFile/";

    public String saveFile(String directory, String fileName, StringBuffer stringBuffer) {
        String filePath = savePath + directory + "/";
        fileName = fileName + "_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()) + ".txt";
        BufferedWriter bufferedWriter = null;
        try {

            File file = new File(filePath);
            if (!file.exists()) file.mkdirs();
            bufferedWriter = new BufferedWriter(new FileWriter(filePath + fileName));
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.flush();
            return fileName;
        } catch (Exception ex) {
            System.out.println(" save error ::: " + ex.getMessage());
            return null;
        } finally {
            try {
                if (bufferedWriter != null) bufferedWriter.close();
            } catch (Exception e) {
            }
        }
    }

    public List<String> getFileNames(String directory) {
        String filePath = savePath + directory + "/";
        List<String> results = new ArrayList<>();
        File[] files = new File(filePath).listFiles();
        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
            }
        }
        return results;
    }

    public void getFileContent(String directory, String filename) {
        String filePath = savePath + directory + "/" + filename;
        String content;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((content = reader.readLine()) != null) {
                System.out.println(content);
            }
        } catch (Exception ex) {

        }
    }

}