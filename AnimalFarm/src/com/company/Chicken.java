package com.company;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setAge(age);
        setName(name);

    }

    private void setName(String name) {
        if (name.length() >= 1 && !name.equals("null") && !name.equals(" ")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    private void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }

    }

    public double productPerDay() {
        return calculateProductPerDay(age);
    }

    private double calculateProductPerDay(int age) {
        if (age >= 0 && age <= 5) {
            return 2;
        } else if (age >= 6 && age <= 11) {
            return 1;
        }
        return 0.75;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",
                this.name, this.age, productPerDay());
    }
}
