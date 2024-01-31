package Clinic;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, LocalDate birthDate, String illness, String owner) {
        super(name, birthDate, illness, owner);
    }

    @Override
    public double run() {
        return 15.0;
    }


    @Override
    public double swim() {
        return 10.0;
    }
}
