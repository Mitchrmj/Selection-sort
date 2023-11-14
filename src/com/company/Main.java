package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {22, 13, 10, 80, 19, 54, 51, 81, 30, 99, 91, 73, 65, 36, 35, 74, 82, 12, 43, 6};

        int iMin = numbers[0];
        int minPos = 0;

        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < numbers[i]) {
                    iMin = numbers[j];
                    minPos = j;
                }

            }
            numbers[minPos] = numbers[i];
            numbers[i] = iMin;
        }
        for(int i: numbers) {
            System.out.print(i + ", ");
        }
    }
}
