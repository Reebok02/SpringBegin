package reebok.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SystemBlockRes implements SystemBlock{
    private String typeOfCorpus;

    private Motherboard motherboard;

    public SystemBlockRes(Motherboard motherboard) {
        this.motherboard = motherboard;
        this.typeOfCorpus = "Midi tower";
        System.out.println("Создание системного блока.");
    }

    @Override
    public String getTypeOfCorpus() {
        return typeOfCorpus;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
