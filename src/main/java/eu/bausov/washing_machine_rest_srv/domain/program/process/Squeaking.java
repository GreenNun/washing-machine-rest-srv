package eu.bausov.washing_machine_rest_srv.domain.program.process;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by GreenNun on 24/02/2018.
 */
@Entity
@DiscriminatorValue("squeaking")
public class Squeaking extends Process {
    public Squeaking() {
    }

    public Squeaking(Long duration, Integer temperature, Integer rotationSpeed) {
        super(duration, temperature, rotationSpeed);
    }

    @Override
    public String toString() {
        return "Squeaking " + super.toString();
    }
}
