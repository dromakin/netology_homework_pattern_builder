/*
 * File:     PersonBuilder
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

public interface PersonBuilder {

    public PersonBuilder setName(String name);

    public PersonBuilder setSurname(String surname);

    public PersonBuilder setAge(int age);

    public PersonBuilder setAddress(String address);

    public Person build();


}
