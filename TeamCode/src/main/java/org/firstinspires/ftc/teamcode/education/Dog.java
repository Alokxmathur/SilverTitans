package org.firstinspires.ftc.teamcode.education;

public class Dog {
    private static String species="Dog";

    private String name;
    private int ageInYears;


    public Dog(String name, int ageInYears) {
        this.name = name;
        this.ageInYears = ageInYears;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeInYears() {
        return this.ageInYears;
    }

    public void bark() {
        System.out.println("Woof");
    }

}
