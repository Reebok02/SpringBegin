package reebok.test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ProcessorIntel implements Processor {
    private int cores;
    private  int frequency;

    public ProcessorIntel() {
        this.cores = 4;
        this.frequency = 2500;
        System.out.println("Создание процессора с " + cores + " ядрами и " + frequency + " частотой");
    }

    @Override
    public String toString() {
        return "Intel";
    }

    @Override
    public int getCores() {
        return cores;
    }

    @Override
    public int getFrequency() {
        return frequency;
    }
}
