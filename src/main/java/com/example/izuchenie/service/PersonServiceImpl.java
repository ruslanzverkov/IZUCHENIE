package com.example.izuchenie.service;

import com.example.izuchenie.domain.Driver;
import com.example.izuchenie.domain.Person;
import com.example.izuchenie.domain.TruckDriver;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    Person[] persons={
            new Person(
                    "Jan",
                    "Reno",
                    "12345"
            ),
            new Person(
                    "Luk",
                    "besson",
                    "54321"
            ),
            new Person(
                    "Jerar",
                    "Depardje",
                    "41232"
            ),
            new Driver(
                    "Jason",
                    "Statheam",
                    "928374",
                    "3491"
            ),
            new TruckDriver(
                    "Robert",
                    "Patrick",
                    "1000",
                    "2345"
            )
    };

    @Override
    public String getPerson(Integer number) {
        final Person person;
        person = persons[number];
        final String personDescription=" "+
                person.getName()+" "+
                person.getSurName()+" "+
                person.getPassport();
        return personDescription;
    }
}
