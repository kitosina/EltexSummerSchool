package ru.Eltex.kitosina;


import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ParserMain {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File XMLDOM=new File("C:\\Users\\kitos\\IdeaProjects\\XML-DOM\\src\\main\\resources\\info.xml");
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
        Document document=documentBuilder.parse(XMLDOM);
        NodeList Users=document.getElementsByTagName("ClassUser");
        NodeList Name=document.getElementsByTagName("Name");
        NodeList Age=document.getElementsByTagName("Age");
        NodeList Lang=document.getElementsByTagName("Lang");
        for(Integer i=0;i<Users.getLength();i++){
            Node user=Users.item(i);
            Node name=Name.item(i);
            Node age=Age.item(i);
            Node lang=Lang.item(i);
            NamedNodeMap atributUser=user.getAttributes();
            NamedNodeMap atributName=name.getAttributes();
            NamedNodeMap atributAge=age.getAttributes();
            NamedNodeMap atributLang=lang.getAttributes();
            UserData us=new UserData(atributUser.getNamedItem("User").getNodeValue(),atributName.getNamedItem("Name").getNodeValue(),atributAge.getNamedItem("Age").getNodeValue(),atributLang.getNamedItem("Lang").getNodeValue());
            System.out.println(us.toString());
        }
    }
}
