package uz.bakhromjon.fastnate.person;

import lombok.Getter;
import org.fastnate.data.AbstractDataProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonData extends AbstractDataProvider {

    @Getter
    private final List<Person> entities = new ArrayList<>();

    @Override
    public void buildEntities() throws IOException {
        this.entities.add(new Person("Nate", "Smith"));
        this.entities.add(new Person("Natalie", "Smith"));
    }
}