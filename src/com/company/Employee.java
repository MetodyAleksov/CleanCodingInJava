package com.company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private int extraHours;

    public Employee(){
        this.setExtraHours(1);
        this.setHourlyRate(20);
        this.setBaseSalary(50000);
    }

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

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 1000){
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if(baseSalary < 50000 || baseSalary > 1000000){
            throw new IllegalArgumentException();
        }
        this.baseSalary = baseSalary;
    }

    public int getExtraHours() {
        return extraHours;
    }

    private void setExtraHours(int extraHours) {
        if(extraHours < 0 || extraHours > 100){
            throw new IllegalArgumentException();
        }
        this.extraHours = extraHours;
    }
}
