package ru.itis.inf304.lab7;
import org.junit.Assert;
import org.junit.Test;
public class MergeSortTest {
    @Test
    public void sortTeast(){
        int[] array1Sorted = {1, 3, 5, 7, 9};
        int[] array1 = {5, 9, 1, 7, 3};
        int[] array2sorted = {2, 12, 44, 222, 403, 432, 2323};
        int[] array2 = {403, 222, 12, 2323, 2, 432, 44};
        Assert.assertArrayEquals(array1Sorted, MergeSort.mergeSort(array1,5));
        Assert.assertArrayEquals(array2sorted, MergeSort.mergeSort(array2,7));
    }
}
