/*
 * File:     Person
 * Package:  org.dromakin
 * Project:  netology_homework_pattern_builder
 *
 * Created by dromakin as 21.03.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.03.21
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package org.dromakin;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname, Integer age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public OptionalInt getAge() {
        return OptionalInt.of(this.age);
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAge() {
        return age > 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public void happyBirthday() {
        this.age += 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
