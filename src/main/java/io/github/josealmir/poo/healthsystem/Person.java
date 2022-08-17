package io.github.josealmir.poo.healthsystem;

public abstract sealed class Person permits Doctor, Patient {
    protected Integer id;
    private String name;
    private Integer age;
    private String address;
    private String phone;
    private String email;

    Person(String name, int age, String address, String phone, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
