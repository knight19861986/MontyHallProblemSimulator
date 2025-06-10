package com.trustly.MontyHallSimulator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MontyHallSimulatorApplication implements Constants {
    private static Logger logger = LoggerFactory.getLogger(MontyHallSimulatorApplication.class);

    public static void main(String[] args) {
        //SpringApplication.run(MontyHallSimulatorApplication.class, args);
        MultipleSimulator sim1 = new MultipleSimulatorWhileNotChangingBox(timesOfSimulate);
        MultipleSimulator sim2 = new MultipleSimulatorWhileChangingBox(timesOfSimulate);
        logger.info("The probability of success while not changing box is "
                + 100 * sim1.getProbabilityOfSuccess() + "%");

        logger.info("The probability of success while changing box is "
                + 100 * sim2.getProbabilityOfSuccess() + "%");

    }
}
