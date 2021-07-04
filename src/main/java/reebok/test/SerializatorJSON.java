package reebok.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class SerializatorJSON implements Serializator{

    @Override
    public void serialize(Computer computer) {
        ObjectMapper mapper = new ObjectMapper();

        try{
            mapper.writeValue(new File("test.json"), computer);
        } catch (IOException e){
            System.out.println("Ошибка сериализации" + e);
        }

        System.out.println("Объект был сериализован в test.json");
    }
}
