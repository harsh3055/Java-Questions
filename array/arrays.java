package org.example.array;

import java.util.Arrays;

class Student{
    public int roll_no;
    public String name;

    Student(int roll_no,String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class arrays {
    public static void main(String[] args) {
        //initialising the array
        int[] numbers = new int[5]; // all ele are 0
        int[] arr = {1, 2, 3, 4, 5};
        //size of the array
        int n = arr.length;
        //tranversing the array
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        Student list[];
        list = new Student[2];
        list[0] = new Student(1, "harsh");
        list[1] = new Student(2, "urvashi");
        for (Student s : list) {
            System.out.println(s.roll_no + " " + s.name);
        }
        //if we try to access elements outside the size of the array
        // then it will throw java.lang.ArrayIndexOutOfBoundsExcepetion

        //multi dimesinal arrays
        int[][] multi_arr = {{1, 2, 3}, {2, 3, 4}};
        for (int[] row : multi_arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println("sum " + sum(arr));
        System.out.println("sum " + sum(m1()));
//copying arrays
        int[] org = {1, 2, 3};
        int[] copy = Arrays.copyOf(org, 5);
        int[] cp = org.clone();
        copy[0] = 10;
        cp[0] = 12;
        System.out.println(org == copy);
        System.out.println(cp == org);

        System.out.println(org[0]);
        System.out.println(copy[0]);
        System.out.println(cp[0]);

        // jagged array : array with row of different lengths
        int[][] jaggarr = new int[3][];
        for (int i = 0; i < jaggarr.length; i++) {
            jaggarr[i] = new int[i + 1];
        }
        int count = 0;
        for (int i = 0; i < jaggarr.length; i++)
            for (int j = 0; j < jaggarr[i].length; j++)
                jaggarr[i][j] = count++;

        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");

        for (int i = 0; i < jaggarr.length; i++) {
            for (int j = 0; j < jaggarr[i].length; j++)
                System.out.print(jaggarr[i][j] + " ");
            System.out.println();
        }

    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i : arr){ // only copy
            sum += i;
        }
        return sum;
    }
    public static int[] m1(){
        return new int[]{1,2,3,4};
    }
 }
