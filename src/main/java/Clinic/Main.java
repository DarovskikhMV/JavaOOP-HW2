package Clinic;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Pushok", LocalDate.of(2018, 4, 15), "Chumka", "Owner Alexei", 4);
        Animal dog1 = new Dog("Doggy", LocalDate.of(2015, 5, 6), "Fracture", "Owner Petr");

        Doctor doctor1 = new Doctor("Petr", "Surgeon", 6);
        Nurse nurse1 = new Nurse("Snezhana", "Intern", 1);
        Doctor doctor2 = new Doctor("Vasiliy", "Surgeon", 8);
        Nurse nurse2 = new Nurse("Viktoria", "Intern", 1);


        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(cat1, dog1);
        System.out.println(clinic.patients);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(cat1);
        doctor1.diagnostic(cat1);
        nurse1.assistDoctor(doctor1, cat1);
        doctor1.choiceTreatment(cat1, "Tablet");
        nurse1.treatment(cat1, "Tablet");
        nurse1.monitoring(cat1);
        doctor1.dischargePatient(cat1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(dog1);
        doctor2.diagnostic(dog1);
        nurse2.assistDoctor(doctor2, dog1);
        doctor2.choiceTreatment(dog1, "Operation");
        nurse2.treatment(dog1, "Operation");
        nurse2.monitoring(dog1);
        doctor2.dischargePatient(dog1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        clinic.addDoctor(doctor1);
        clinic.addDoctor(doctor2);
        System.out.println(clinic.getAllDoctors());
        clinic.addNurse(nurse1);
        clinic.addNurse(nurse2);
        System.out.println(clinic.getAllNurses());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(clinic.getGoables());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(clinic.getFlyables());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(clinic.getSwimable());

    }
}
