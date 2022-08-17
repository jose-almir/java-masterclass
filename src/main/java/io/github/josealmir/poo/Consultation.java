package io.github.josealmir.poo;

import java.time.LocalDate;

public final class Consultation {
    private Doctor doctor;
    private Patient patient;
    private LocalDate date;
    private String diagnosis;
    private String prescription;

    public Consultation(Doctor doctor, Patient patient, LocalDate date, String diagnosis, String prescription) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}
