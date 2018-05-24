package net.saga.fehbot.installer.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name = "step")
@XmlAccessorType(XmlAccessType.FIELD)
public class Step {
    private String name;
    private String description;
    private String command;
    private String outputmatcher;
    private String failmessage;
    private String nextname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getOutputmatcher() {
        return outputmatcher;
    }

    public void setOutputmatcher(String outputmatcher) {
        this.outputmatcher = outputmatcher;
    }

    public String getFailmessage() {
        return failmessage;
    }

    public void setFailmessage(String failmessage) {
        this.failmessage = failmessage;
    }

    public String getNextname() {
        return nextname;
    }

    public void setNextname(String nextname) {
        this.nextname = nextname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Step step = (Step) o;
        return Objects.equals(name, step.name) &&
                Objects.equals(description, step.description) &&
                Objects.equals(command, step.command) &&
                Objects.equals(outputmatcher, step.outputmatcher) &&
                Objects.equals(failmessage, step.failmessage) &&
                Objects.equals(nextname, step.nextname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, description, command, outputmatcher, failmessage, nextname);
    }

    @Override
    public String toString() {
        return "Step{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", command='" + command + '\'' +
                ", outputmatcher='" + outputmatcher + '\'' +
                ", failmessage='" + failmessage + '\'' +
                ", nextname='" + nextname + '\'' +
                '}';
    }
}
