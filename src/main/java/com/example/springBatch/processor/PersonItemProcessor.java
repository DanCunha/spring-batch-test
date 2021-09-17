package com.example.springBatch.processor;

import com.example.springBatch.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger LOG = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person item) throws Exception {
        String firstName = item.getFirstName().toUpperCase();
        String secondName = item.getSecondName().toUpperCase();
        String cpf = item.getCpf();

        Person person = new Person(firstName, secondName, cpf);

        LOG.info("Convertendo (" + item + ") a (" + person + ")");

        return person;
    }
}
