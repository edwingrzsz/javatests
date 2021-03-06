package edu.desarrollowi.javatests.util;

public class StringUtil {

    public static String repeat(String str, int times){
        if(times < 0){
            throw new IllegalArgumentException("negative input not allowed");
        }

        String result = "";

        for (int i = 0; i < times ; i++) {
            result += str;
        }

        return result;
    }

    public static boolean isEmpty(String str) {
        if (str.length() < 1) {
            return true;
        }
        if (str == "") {
            return true;
        }
        if (str == null) {
            return true;
        }
        return false;
    }
}