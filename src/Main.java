// SPDX-FileCopyrightText: 2024 2024 Florian Trimborn
//
// SPDX-License-Identifier: MIT

public class Main {

    //The following code was used to solve the first weeks exercise
    public static int computeValue(int x, int y) {
        int result = 0;

        if (x > 0) {
            result += x; //add x to result
        } else {
            result -= x; //subtract x from result
        }

        if (y > 0) {
            result += y;
            for (int i = 0; i < 3; i++){
                result += 2 * x; //add 2 x to result until i = 3
            }
        }

        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                result += i;  //add even numbers
            } else {
                result -= i;  //subtract odd numbers
            }
        }

        while (y > 0) {
            result += y; //add y to  result
            y--; //lower result by one and repeat until result = 0
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Computed Value: " + computeValue(5, 3)); //test with x:5 and y:3 should return 46
    }
}