package Clinic;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected String illness;
    protected String ownerName;


    public Animal(String name, LocalDate birthDate, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.illness = illness;
        this.ownerName = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return ownerName;
    }

    private void wakeup() {
        System.out.println("Animal is wakeup !! ");
    }

    private void wakeup(int time) {
        System.out.println("Animal is wakeup in " + time);
    }

    private void eat() {
        System.out.println("Animal ate ");
    }

    private void play() {
        System.out.println("Animal played ");
    }

    private void sleep() {
        System.out.println("Animal sleeping ");
    }

    @Override
    public String toString() {
        return "Animal {" +
                "Name='" + name + '\'' +
                ", BirthDate=" + birthDate +
                ", Illness='" + illness + '\'' +
                ", Owner='" + ownerName + '\'' +
                '}' + " \n";

    }
}
