package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        int[] arr = {1, 3, 4, 7, 2};
        inserSort(arr);


    }

    public static void  inserSort(int arr[]) {
        /*int low=0;

        int hight =array.length-1;
        while (low<=hight){
            int middle=(low+hight)/2;
            if(value==array[middle]){
                return middle;
            }

            if(value>array[middle]){
                low=middle+1;
            }
            if(value<array[middle]){
                hight= middle-1;
            }
        }
        return-1;*/

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));

    }

}
