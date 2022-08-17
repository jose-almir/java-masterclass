package io.github.josealmir.poo;

import java.util.List;

public final class Patient extends Person {
    private final List<String> symptoms;

    Patient(String name, int age, String address, String phone, String email, List<String> symptoms) {
        super(name, age, address, phone, email);
        this.symptoms = symptoms;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("My symptoms are: " + symptoms);
    }

    public List<String> getSymptoms() {
        return symptoms;
    }
}
