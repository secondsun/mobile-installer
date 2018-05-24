import net.saga.fehbot.installer.vo.Installation;
import net.saga.fehbot.installer.vo.Step;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@RunWith(JUnit4.class)
public class TestXmlParser {
    @Test
    public void basicTest() throws JAXBException {

        var step1 = new Step();
        step1.setCommand("oc get projects");
        step1.setDescription("Get a list of projects");
        step1.setFailmessage("Fail");
        step1.setName("getProjects");
        step1.setNextname("addProject");
        step1.setOutputmatcher("\\w+");

        var step2 = new Step();
        step2.setCommand("oc create -f boo.json");
        step2.setDescription("Add a project");
        step2.setFailmessage("Fail 2");
        step2.setName("addProject");
        step2.setOutputmatcher("\\w+");

        Installation i = new Installation();
        i.getSteps().add(step1);
        i.getSteps().add(step2);


        JAXBContext jaxbContext = JAXBContext.newInstance(Installation.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();


        var installation = (Installation) jaxbUnmarshaller.unmarshal(getClass().getResourceAsStream("basicTest.xml"));

        Assert.assertEquals(i, installation);


    }
}
