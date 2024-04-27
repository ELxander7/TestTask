package ru.itis.inf304.lab7;
import org.junit.Test;
import org.junit.Assert;

import java.io.*;

public class FileJoinerTest {
    @Test
    public void testJoin(){
        File file1 = new File("C:\\javaprojects\\firstyear\\2 chapter\\2) class\\lab7\\src\\test\\java\\ru\\itis\\inf304\\lab7\\file1.txt");
        File file2 = new File("C:\\javaprojects\\firstyear\\2 chapter\\2) class\\lab7\\src\\test\\java\\ru\\itis\\inf304\\lab7\\file2.txt");
        File fileResult = new File("C:\\javaprojects\\firstyear\\2 chapter\\2) class\\lab7\\src\\test\\java\\ru\\itis\\inf304\\lab7\\fileResult");
        FileJoiner.mergeFiles(file1, file2, fileResult);
        String result;
        try(BufferedReader reader = new BufferedReader(new FileReader(fileResult))){
            result = reader.readLine();
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("1 2 3 4 5Hello world", result);
    }
}
