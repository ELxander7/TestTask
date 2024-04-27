package ru.itis.inf304.lab7;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileJoiner {
    public static File mergeFiles(File file1, File file2, File fileresult){
        try (FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);
        FileOutputStream fos = new FileOutputStream(fileresult)) {
            byte[] buffer = new byte[1024];
            int readByte;
            while ((readByte = fis1.read(buffer)) != -1) {
                fos.write(buffer,0,readByte);
            }
            while ((readByte = fis2.read(buffer)) != -1) {
                fos.write(buffer,0,readByte);
            }
            System.out.println("Файлы успешно объединены в файл " + fileresult);
        } catch (IOException e){
            System.out.println("Ошибка при объединениее файлов " + e.getMessage());
        } return fileresult;

    }
}
