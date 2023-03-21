/*
 * File:     ChildBuilder
 * Package:  org.dromakin.builder
 * Project:  netology_homework_pattern_builder
 *
 * Created by dromakin as 21.03.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.03.21
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package org.dromakin.builder;

import org.dromakin.Person;

public class ChildBuilder implements PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalStateException("Age must be > 0!");
        }

        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        if (name == null && surname == null && age == 0 && address == null) {
            throw new IllegalStateException("No args!");
        }

        return new Person(name, surname, age, address);
    }
}
