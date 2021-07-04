package reebok.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reebok.test.*;

@Configuration
public class SpringConfig {

    @Bean
    public Monitor getMonitorHp(){ return new MonitorHP(); }

    @Bean
    public Processor getProcessorIntel(){
        return new ProcessorIntel();
    }

    @Bean
    public Motherboard getMotherboardAsus(){ return new MotherboardAsus(getProcessorIntel());}

    @Bean
    public SystemBlock getSystemBlockRes(){ return new SystemBlockRes(getMotherboardAsus());}

    @Bean
    public Computer getComputerMain() { return new Computer(getMonitorHp(), getSystemBlockRes());}

    @Bean
    public SerializatorJSON getSerializatorJSON(){
        return new SerializatorJSON();
    }

    @Bean
    public SerializatorXML getSerializatorXML(){
        return new SerializatorXML();
    }

    @Bean
    public SerializatorYAML getSerializatorYAML(){
        return new SerializatorYAML();
    }
}

