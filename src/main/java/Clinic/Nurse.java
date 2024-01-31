package Clinic;

public class Nurse extends Doctor{
    public Nurse(String name, String specialization, int experience) {
        super(name, specialization, experience);
    }
    /**
     Помогаем врачу с пациентом
     */
    public void assistDoctor(Doctor doctor, Animal patient) {
        System.out.println("Nurse " + name + " is assisting Doctor " + doctor.name + " with patient " + patient.getName());
    }

    /**
     Лечение пациента
     */
    public void treatment(Animal patient, String medication) {
        System.out.println("Nurse " + name + " is treatment " + medication + " to patient " + patient.getName());
    }

    /**
     Наблюдение за состоянием пациента
     */
    public void monitoring(Animal patient) {
        System.out.println("Nurse " + name + " is monitoring of patient " + patient.getName());
    }
    @Override
    public String toString() {
        return "Nurses {" +
                "Name ='" + name + '\'' +
                ", Specialization =" + specialization +
                ", EXP Years ='" + experience +
                '}' + " \n";
    }
}
