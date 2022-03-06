package com.company;

public class Employee {
    public int baseSalary;
    public int hourlyRate;
    public int extraHours;

    public Employee(int baseSalary, int hourlyRate, int extraHours){
        this.extraHours = extraHours;
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
    }

    public int calculateWage(){
        return baseSalary + (hourlyRate * extraHours);
    }
}
