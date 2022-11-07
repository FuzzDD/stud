package com.company;

import java.util.List;
import java.util.Map;

public class MathLogic {
    NumbersAndSigns numbersAndSigns = new NumbersAndSigns();
    List<String> rome = numbersAndSigns.romeNumbers();
    List<String> signs = numbersAndSigns.signs();
    Map<Integer, String> romanArabic = numbersAndSigns.romanArabic();

    public String mathLogic(String[] input) {
        for (Map.Entry<Integer, String> entry : romanArabic.entrySet()) {
            if (input[0].equals(entry.getKey().toString())) {
                int first = Integer.parseInt(input[0]);
                int second;
                try {
                    second = Integer.parseInt(input[2]);
                } catch (Exception e) {
                    return "null";
                }
                if (second > 0 && second < 11) {
                    if (input[1].equals(signs.get(0))) {
                        return String.valueOf(first + second);
                    }
                    if (input[1].equals(signs.get(1))) {
                        return String.valueOf(first - second);
                    }
                    if (input[1].equals(signs.get(2))) {
                        return String.valueOf(first * second);
                    }
                    if (input[1].equals(signs.get(3))) {
                        return String.valueOf(first / second);
                    }
                }
            } else if (input[0].equals(entry.getValue())) {
                int first = entry.getKey();
                for (Map.Entry<Integer, String> entrySecond : romanArabic.entrySet()) {
                    if (input[2].equals(entrySecond.getValue())) {
                        int second = entrySecond.getKey();
                        if (input[1].equals(signs.get(0))) {
                            return rome.get(first + second);
                        }
                        if (input[1].equals(signs.get(1))) {
                            return rome.get(first - second);
                        }
                        if (input[1].equals(signs.get(2))) {
                            return rome.get(first * second);
                        }
                        if (input[1].equals(signs.get(3))) {
                            return rome.get(first / second);
                        }
                    }
                }
            }
        }
        return "null";
    }
}