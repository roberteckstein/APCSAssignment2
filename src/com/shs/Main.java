package com.shs;

import java.util.*;

public class Main {

    //  Part 1:  Implement the 5 cases below to pop 2 items off
    //  the stack, evaluate, and push the result back on.

    //  Part 2:  Implement "=". Use the variables data structure
    //  below to store the "variables" in use (name, value) on
    //  the evaluation stack.

    Hashtable<String, Double> variables;

    /**
     * Computes the outcome of a given expression in Reverse Polish Notation
     *
     */
    public static void compute(String expr) throws
            ArithmeticException,
            EmptyStackException {

        Stack<Double> stack = new Stack<>();

        System.out.println(expr);
        System.out.println("Input\tOperation\tStack after (bottom<--->top)");

        for (String token : expr.split("\\s+")) {

            System.out.print(token + "\t\t");

            switch (token) {
                case "+":
                    System.out.print("Operate\t\t");

                    break;
                case "-":
                    System.out.print("Operate\t\t");

                    break;
                case "*":
                    System.out.print("Operate\t\t");

                    break;
                case "/":
                    System.out.print("Operate\t\t");

                    break;
                case "^":
                    System.out.print("Operate\t\t");

                    break;
                default:
                    System.out.print("Push\t\t");
                    stack.push(Double.parseDouble(token));
                    break;
            }

            System.out.println(stack);
        }

        System.out.println("Final Answer: " + stack.pop());
    }

    /**
     * Runs the calculation for the RPN expression
     */
    public static void main(String[] args) {

        //  Calculate postfix for -35 + 4 * 2 - 1

        String s = "-35 4 2 * + 1 -";

        try {
            compute(s);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }

}
