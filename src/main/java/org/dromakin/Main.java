package org.dromakin;

import org.dromakin.builder.ParentBuilder;
import org.dromakin.director.FamilyDirector;

public class Main {
    public static void main(String[] args) {
        ParentBuilder parentBuilder = new ParentBuilder();
        FamilyDirector director = new FamilyDirector(parentBuilder);
        System.out.println(director.getMom());
        System.out.println(director.getSon((ParentBuilder) director.getBuilder()));

        try {
            // Не хватает обязательных полей
            new ParentBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new ParentBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


    }
}