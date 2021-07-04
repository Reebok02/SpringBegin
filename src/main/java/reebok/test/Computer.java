package reebok.test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Computer {
    private Monitor monitor;
    private SystemBlock systemBlock;

    public Computer(Monitor monitor, SystemBlock systemBlock) {
        this.monitor = monitor;
        this.systemBlock = systemBlock;
        System.out.println("Создание копьютера с монитором " + monitor +
                " и системным блоком " + systemBlock + ".");
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }
}
