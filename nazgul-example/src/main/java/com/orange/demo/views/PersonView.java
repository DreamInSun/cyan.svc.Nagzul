package com.orange.demo.views;

import com.orange.demo.entities.Person;
import io.dropwizard.views.View;

/**
 * Created by DreamInSun on 2016/7/22.
 */
public class PersonView extends View {

    /*========== Properties ==========*/
    private Person person;

    /*========== Getter & Setter ==========*/
    public Person getPerson() {
        return person;
    }

    /*========== Constructor ==========*/
    public PersonView(Person person) {
        super("person.ftl");
        this.person = person;
    }

}
