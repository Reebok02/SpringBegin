package reebok.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;


@Component
@Primary
public class MotherboardAsus implements Motherboard{
    private final String typeOfRAM;
    private Processor processor;
    private final String[] videoOutputs;

    public MotherboardAsus(Processor processor) {
        this.typeOfRAM = "DDR4";
        this.processor = processor;
        this.videoOutputs = new String[]{"DVI-D", "VGA", "HDMI"};
        System.out.println("Создание материнской платы с " +
                "типом оперативной памяти " + typeOfRAM +
                ", процессором " + processor + " и видео выходами " +
                Arrays.stream(videoOutputs).map(String::valueOf).collect(Collectors.joining(", ")) + ".");
    }
    @Override
    public String toString(){ return "Motherboard с типом ОЗУ" + typeOfRAM +
            ", процессором " + processor + " и видео выходами " +
            Arrays.stream(videoOutputs).map(String::valueOf).collect(Collectors.joining(", "));}

    @Override
    public String getTypeOfRAM() {
        return typeOfRAM;
    }

    @Override
    public Processor getProcessor() {
        return processor;}

    public String[] getVideoOutputs() {
        return videoOutputs;
    }
}
