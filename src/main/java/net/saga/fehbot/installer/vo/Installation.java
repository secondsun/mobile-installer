package net.saga.fehbot.installer.vo;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@XmlRootElement(name = "installation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Installation {

    @XmlElement(name = "step")
    private List<Step> steps = new ArrayList<>();

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Installation that = (Installation) o;
        return Objects.equals(steps, that.steps);
    }

    @Override
    public int hashCode() {

        return Objects.hash(steps);
    }

    @Override
    public String toString() {
        return "Installation{" +
                "steps=" + steps +
                '}';
    }
}
