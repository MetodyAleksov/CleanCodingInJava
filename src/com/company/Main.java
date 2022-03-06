package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var employee = new Employee(50000, 20, 12);
        int wage = employee.calculateWage();

        System.out.println(wage);
    }
}
