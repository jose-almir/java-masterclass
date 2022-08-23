package io.github.josealmir.designpatterns.creation.demo;

import java.util.Objects;

public class PrototypeDemo {
    public static void main(String[] args) {
        User user1 = new User("John", 19, "johndoe@gmail.com", new Address("Rua 1", "123", "CE"));
        User user2 = (User) user1.copy();
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.equals(user2));
    }


    interface Prototype {
        Prototype copy();
    }

    static class Address implements Prototype {
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        private Address(Address address) {
            this.street = address.street;
            this.city = address.city;
            this.state = address.state;
        }

        @Override
        public Prototype copy() {
            return new Address(this);
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Address address = (Address) o;
            return street.equals(address.street) && city.equals(address.city) && state.equals(address.state);
        }

        @Override
        public int hashCode() {
            return Objects.hash(street, city, state);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Address{");
            sb.append("street='").append(street).append('\'');
            sb.append(", city='").append(city).append('\'');
            sb.append(", state='").append(state).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    static class User implements Prototype  {
        private String name;
        private int age;
        private String email;

        private Address address;

        public User(String name, int age, String email, Address address) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.address = address;
        }

        private User(User user) {
            this.name = user.name;
            this.age = user.age;
            this.email = user.email;
            this.address = (Address) user.address.copy();
        }

        @Override
        public Prototype copy() {
            return new User(this);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("User{");
            sb.append("name='").append(name).append('\'');
            sb.append(", age=").append(age);
            sb.append(", email='").append(email).append('\'');
            sb.append(", address=").append(address);
            sb.append('}');
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age && name.equals(user.name) && email.equals(user.email) && address.equals(user.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, email, address);
        }
    }
}
