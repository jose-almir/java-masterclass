package io.github.josealmir.oop.healthsystem;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private final String name;
    private final List<Doctor> doctors = new ArrayList<>();
    private final List<Patient> patients = new ArrayList<>();
    private final List<Consultation> consultations = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctor.setId(doctors.size() + 1);
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patient.setId(patients.size() + 1);
        patients.add(patient);
    }

    public void addConsultation(Consultation consultation) {
        consultations.add(consultation);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Consultation> getConsultations() {
        return consultations;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
