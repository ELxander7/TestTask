package ru.itis.inf304.lab7;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class FileJoinerBinaryTest {
    @Test
    public void joinBinaryTest() throws IOException{
        File file1 = new File("file1.bin");
        File file2 = new File("file2.bin");
        File fileResult = new File("fileResult.bin");
        FileJoiner.mergeFiles(file1,file2,fileResult);
        String fileName1 = "fileResult.bin";
    }
}
