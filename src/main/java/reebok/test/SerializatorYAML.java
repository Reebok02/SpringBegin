package reebok.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.File;
import java.io.IOException;

@Component
public class SerializatorYAML implements Serializator{
    @Override
    public void serialize(Computer computer) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        try {
            mapper.writeValue(new File("test.yaml"), computer);
        } catch (IOException e){
            System.out.println("Ошибка сериализации " + e);
        }

        System.out.println("Объект был сериализован в test.yaml");

    }
}
