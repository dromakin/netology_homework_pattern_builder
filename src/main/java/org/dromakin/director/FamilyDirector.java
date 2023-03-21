/*
 * File:     FamilyDirector
 * Package:  org.dromakin.director
 * Project:  netology_homework_pattern_builder
 *
 * Created by dromakin as 21.03.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.03.21
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package org.dromakin.director;

import org.dromakin.Person;
import org.dromakin.builder.ParentBuilder;
import org.dromakin.builder.PersonBuilder;

public class FamilyDirector {

    private PersonBuilder builder;

    public FamilyDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(PersonBuilder builder) {
        setBuilder(builder);
    }

    public PersonBuilder getBuilder() {
        return builder;
    }

    protected void setBuilder(PersonBuilder builder) {
        this.builder = builder;
    }

    public Person getMom() {
        return builder
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
    }

    public Person getSon(ParentBuilder mom) {
        return mom.newChildBuilder()
                .setName("Антошка")
                .build();
    }


}
