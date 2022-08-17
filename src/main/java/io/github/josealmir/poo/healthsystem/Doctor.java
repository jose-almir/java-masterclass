package io.github.josealmir.poo.healthsystem;

public final class Doctor extends Person {
    private String crm;
    private String speciality;
    private Hospital hospital;

    public Doctor(String name, int age, String address, String phone, String email, String crm, String speciality, Hospital hospital) {
        super(name, age, address, phone, email);
        this.crm = crm;
        this.speciality = speciality;
        this.hospital = hospital;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("My CRM is " + crm + " and I am a " + speciality + " doctor at " + hospital + ".");
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
