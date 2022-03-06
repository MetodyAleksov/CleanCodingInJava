package com.company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private int extraHours;

    public Employee(int baseSalary, int hourlyRate, int extraHours){
        this.setExtraHours(extraHours);
        this.setBaseSalary(baseSalary);
        this.setHourlyRate(hourlyRate);
    }

    public int calculateWage(){
        return getBaseSalary() + (getHourlyRate() * getExtraHours());
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }
}
