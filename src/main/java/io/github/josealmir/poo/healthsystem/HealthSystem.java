package io.github.josealmir.poo.healthsystem;

import java.util.ArrayList;
import java.util.List;

public class HealthSystem implements HealthSystemBase {
    private final Hospital hospital;

    HealthSystem(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public void checkSystem() {
        System.out.println("Checking the health system...");
        System.out.println("Hospital: " + hospital);
        System.out.println("Doctors: " + hospital.getDoctors().size());
        System.out.println("Patients: " + hospital.getPatients().size());
        System.out.println("Consultations: " + hospital.getConsultations().size());

        List<Person> people = new ArrayList<>();
        people.addAll(hospital.getDoctors());
        people.addAll(hospital.getPatients());

        for (Person person : people) {
            person.introduce();
        }
    }
}
