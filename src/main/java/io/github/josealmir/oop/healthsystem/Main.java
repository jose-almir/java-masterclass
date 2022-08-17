package io.github.josealmir.oop.healthsystem;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Santo Amaro");
        HealthSystemBase healthSystem = new HealthSystem(hospital);


        hospital.addDoctor(
                new Doctor("João", 30, "Rua A", "12345678", "joao@gmail.com", "12345", "Cardiologista", hospital)
        );
        hospital.addDoctor(
                new Doctor("Maria", 25, "Rua B", "87654321", "maria@gmail.com", "54321", "Neurologista", hospital)
        );

        hospital.addPatient(
                new Patient("João", 30, "Rua A", "12345678", "", List.of("febre", "tosse", "cansaço"))
        );

        hospital.addConsultation(
                new Consultation(hospital.getDoctors().get(0), hospital.getPatients().get(0), LocalDate.of(2022, 8, 25), "", "")
        );
        healthSystem.checkSystem();
    }
}
