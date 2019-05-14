package ua.org.crazy.homework21.task03;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_NAME ="src/main/java/ua/org/crazy/homework21/task03/pomnik.xml";

    public static void main(String[] args){

        SAXParserFactory factory = SAXParserFactory.newInstance();
        List<Dependency> dependencyList = new ArrayList<>();
        try{
            SAXParser parser = factory.newSAXParser();
            XmlHandler handler = new XmlHandler();
            parser.parse(new File(FILE_NAME), handler);
            dependencyList = handler.getDependencies();
        }catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        for (Dependency el: dependencyList) {
            System.out.println(el);
        }
    }
}
