package com.elisa;

import com.yammer.metrics.Metrics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.yammer.metrics.core.Counter;

import java.util.ArrayList;


/**
 * Created by elisa on 18/08/15.
 */
@Component
public class Printer {
    final private Person elisa;

    @Autowired
    public Printer(Person elisa) {
        this.elisa = elisa;

    }

    public void printName() {
        System.out.println(this.elisa.personName());
        Counter elisaNameCounter = Metrics.newCounter(ArrayList.class, "elisa-counter");
                elisaNameCounter.inc();
        System.out.println("count is " + elisaNameCounter.count());
    }
}
