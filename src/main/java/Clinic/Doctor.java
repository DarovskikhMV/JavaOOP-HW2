package Clinic;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    public String name;
    public String specialization;
    public int experience;
    private final List<Animal> patients;

    public Doctor(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.patients = new ArrayList<>();
    }

    /**
     * Обследование пациента
     */
    public void diagnostic(Animal patient) {
        System.out.println("Doctor " + name + " diagnostic patient '" + patient.getName() + "' " + patient.illness);
    }

    /**
     * Назначаем лечение
     */
    public void choiceTreatment(Animal patient, String medication) {
        System.out.println("Doctor " + name + " choice treatment " + medication + " for animals with " + patient.illness);
    }

    /**
     * Выписка
     */
    public void dischargePatient(Animal patient) {
        System.out.println("Doctor " + name + " cured animal " + patient.getName());
        patients.add(patient);
    }

    @Override
    public String toString() {
        return "Doctor {" +
                "Name ='" + name + '\'' +
                ", Specialization =" + specialization +
                ", EXP Years ='" + experience +
        '}' + " \n";
    }
}

