// Name: John McBride
// Berkeley CS 61b - Data Structures
// Description:
// ------------
// Homework 0 - Java syntax

public class HW0 {
    // Exercise 2
    public static int max(int[] m) {
        int i = 0;
        int max = m[0];
        while(m.length != i) {
            if(m[i] >= max) {
                max = m[i];
            }

            i++;
        }

        return max;
    }

    // Exercise 3
    public static int forMax(int[] m) {
        int max = m[0];
        for(int i = 0; i < m.length; i++) {
            if(m[i] >= max) {
                max = m[i];
            }
        }

        return max;
    }

    // The main method
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
        System.out.println(forMax(numbers));
    }
}
