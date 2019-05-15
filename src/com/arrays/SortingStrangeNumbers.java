package com.arrays;

public class SortingStrangeNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[]{111,5,2,1,11,8};
        SortingStrangeNumbers sort = new SortingStrangeNumbers();
        sort.insertionSort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }


    }

    private void insertionSort(int[] numbers) {

        if (numbers.length <=0 )
            return;

        for(int i =0;i<numbers.length;i++){
            int key = numbers[i];
           // int convertedValue = convert(key);
            int j = i - 1;
            while (j >= 0 && convert(numbers[j]) > convert(key)) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
    }

    private int convert(int key) {
        if (key > 10){
            String number = Integer.toString(key);
            int finalKey = 0;
            for (int i =0 ; i<number.length();i++){
                char c = number.charAt(i);
                finalKey +=Character.getNumericValue(c);
            }
            return finalKey;
        }
        return key;
    }
}
