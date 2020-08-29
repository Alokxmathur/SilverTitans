package org.firstinspires.ftc.teamcode.education;

public class ShepherdHound extends Dog {
    public ShepherdHound(String name, int ageInYears) {
        super(name, ageInYears);
    }

    @Override
    public void bark() {
        System.out.println("Woof woof woof");
    }
}
