package ua.org.crazy.homework21.task03;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class XmlHandler extends DefaultHandler {

    private List<Dependency> dependencies = null;
    private Dependency dependency = null;
    private StringBuilder data = null;

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    boolean bGroupId = false;
    boolean bArtifactId = false;
    boolean bVersion = false;
    boolean bScope = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("dependency")){
            dependency = new Dependency();
            if (dependencies == null){
                dependencies = new ArrayList<>();
            }
        } else if (qName.equalsIgnoreCase("groupId")){
            bGroupId = true;
        } else if(qName.equalsIgnoreCase("artifactId")){
            bArtifactId = true;
        } else if (qName.equalsIgnoreCase("version")){
            bVersion = true;
        } else if (qName.equalsIgnoreCase("scope")){
            bScope = true;
        }
        data = new StringBuilder();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (bGroupId){
            dependency.setGroupId(data.toString());
            bGroupId = false;
        } else if (bArtifactId){
            dependency.setArtifactId(data.toString());
            bArtifactId = false;
        } else if(bVersion){
            dependency.setVersion(data.toString());
            bVersion = false;
        } else if(bScope){
            dependency.setScope(data.toString());
            bScope = false;
        }

        if (qName.equalsIgnoreCase("dependency")){
            dependencies.add(dependency);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        data.append(new String(ch, start, length));
    }
}
