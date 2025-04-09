    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if (n == 1) {
                    return 2;
                } else {
                    return 2 + bunnyEars(n - 1);
                }
            }
        
            public static int factorial(int n){
                if (n == 1) {
                    return n;
                } else {
                    return n * factorial(n - 1);
                }
            }

            public static int sumNumbers(int n){
                if (n == 1) {
                    return n;
                } else {
                    return n + sumNumbers(n - 1);
                }
            }

            public static String countDown(int n){

                return "Blast Off!";
            }

            public static int power(int x, int n){
                if (n == 1) {
                    return x;
                } else {
                    return x * power(x, n - 1);
                }
            }

            public static int fib(int n){
                if (n <= 1) {
                    return n;
                }else{
                    return fib(n - 1) + fib(n - 2);
                }
            }

            public static int countX(String s){
                int count = 0;
                if (s.length() == 0) {
                    return count;
                } else {
                    if (s.substring(0,1).equals("x")) {
                        count++;
                    }
                    return count + countX(s.substring(1));
                }
            }

            public static String changePi(String s){
                String newString = "";
                if (s.length() == 0) {
                    return newString;
                } else {
                    if (s.startsWith("pi")) {
                        newString += "3.14";
                        return newString + changePi(s.substring(2));
                    }else{
                        newString += s.substring(0,1);
                        return newString + changePi(s.substring(1));
                    }
                }
            }


            public static String reverse(String s){
                if (s.length() == 0) {
                    return s;
                } else {
                    return reverse(s.substring(1)) + s.substring(0,1);
                }
            }

            public static Boolean isPalindrome(String s){
                if (reverse(s).equals(s)) {
                    return true;
                }else{
                    return false;
                }
            }
    }