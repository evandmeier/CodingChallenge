package com.emeier.Test;

import java.util.Locale;

public class Main {

/*
    Your customer is a school. They want you to write a program that will accept a student's attendance record for a
    6-day week and return whether or not a student's attendance is satisfactory.

    The record will be a string containing 6 uppercase characters,
    representing the student's attendance for each day in the week,
    Monday through Saturday. The record contains the following three characters only:

    'A' : Absent.
    'L' : Late.
    'P' : Present.

    Within the 6-day week, the attendance is not satisfactory if the student is absent twice or is late more than 2 days in a row.

    Examples:
    Input: "PPALLP"
    Output: True

    Input: "PPALLL"
    Output: False

    Input: "PAPALL"
    Output: False

    Input: "PLPALL"
    Output: True
*/

    public static void main(String[] args) {
	    // write your code here
        System.out.println(IsSatisfactory("PPALLP"));
        System.out.println(IsSatisfactory("PPALLL"));
        System.out.println(IsSatisfactory("PAPALL"));
        System.out.println(IsSatisfactory("PLPALL"));
    }

    public static boolean IsSatisfactory(String att) {
        att = att.toLowerCase();

        int a = 0; // count of 'a' in att
        int check = att.indexOf("lll"); // -1 if doesn't exist

        for (int i = 0; i < att.length(); i++) {
            if (att.charAt(i) == 'a') a++;
        }

        return a < 2 && check == -1;
    }
}
