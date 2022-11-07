package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        if (input.length != 3 || input[0].equals("0") || input[2].equals("0")) {
            throw new Exception();
        }
        MathLogic ml = new MathLogic();
        String answer = ml.mathLogic(input);
        if (answer.equals("null")) {
            throw new Exception();
        }
        System.out.println(answer);
    }
}