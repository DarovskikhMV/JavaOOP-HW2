package Clinic;

import java.time.LocalDate;

public class Cat extends Animal implements Goable {


    public Cat(String name, LocalDate birthDate, String illness, String owner, int legsCount) {
        super(name, birthDate, illness, owner);

    }


    @Override
    public double run() {
        return 9.0;
    }
}
