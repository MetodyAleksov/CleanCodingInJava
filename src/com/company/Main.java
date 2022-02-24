package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var textBox = new TextBox();

        System.out.println(textBox.toString() == null ? "something" : textBox.toString());
    }
}
