package Clinic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class VeterinaryClinic {
    /**
     * Список пациентов
     */
    public List<Animal> patients = new ArrayList<>();

    /**
     * Добавление пауиента
     */
    public void addPatient(Animal animal) {
        patients.add(animal);
    }

    /**
     * Добавление списком
     */
    public void addPatients(Animal... animals) {
        Collections.addAll(patients, animals);
    }

    /**
     * Возвращает список пациентов
     */
    public List<Animal> getPatients() {
        return patients;
    }

    /**
     * Возвращает бегающих животных
     */
    public List<Goable> getGoables() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }

    /**
     * Возвращает летающих животных
     */
    public List<Flyable> getFlyables() {
        List<Flyable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Flyable)
                result.add((Flyable) animal);
        }
        return result;
    }

    /**
     * Возвращает плавающих животных
     */
    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Swimable)
                result.add((Swimable) animal);
        }
        return result;
    }

    /**
     * Методы для персонала
     */
    public List<Doctor> doctors;
    public List<Nurse> nurses;

    public VeterinaryClinic() {
        this.doctors = new ArrayList<>();
        this.nurses = new ArrayList<>();
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    public List<Nurse> getAllNurses() {
        return nurses;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor " + doctor + " was added");
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
        System.out.println("Nurse " + nurse + " was added");
    }
}

