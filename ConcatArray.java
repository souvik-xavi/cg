package com.cg;
import java.util.Arrays;

public class ConcatArray {
	public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen+1];

        System.arraycopy(array1, 0, result, 0, aLen);//src,startingposition,destination,startingpositionofDestination,length
        System.arraycopy(array2, 0, result, aLen+1, bLen);

        System.out.println(Arrays.toString(result));
    }


}
