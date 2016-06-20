package com.programit.week2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CException ce = new CException();
        try {
            ce.thrower(1);
            ce.thrower(2);
            ce.thrower(3);
            ce.thrower(4);
            ce.thrower(5);
            ce.thrower(6);
            ce.thrower(7);
            ce.thrower(8);
            ce.thrower(9);
        } catch (MyException3 e) {
            System.out.println(e.beschrijving);
        }
    }
}
