package TP4webb;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by saidiaym on 01/04/14.
 */

@org.springframework.stereotype.Controller
@RequestMapping("CV")

public class Controller {
    public Map<Integer,String> object = new HashMap<Integer, String>();
    public Map<Integer,String> experience = new HashMap<Integer, String>();
    public Map<Integer,String> langue = new HashMap<Integer, String>();
    public Map<Integer,String> Competence = new HashMap<Integer, String>();


    @RequestMapping(value="{name}", method = RequestMethod.GET)

    public @ResponseBody
    CV getCvInXML(@PathVariable String name){

        object.put(1,"object1");
        object.put(2,"object2");
        experience.put(1,"exp1");
        experience.put(2,"exp2");
        langue.put(1,"langue2");
        langue.put(2, "langue2");
        Competence.put(1, "comp1");
        Competence.put(2, "comp2");

        CV cv = new CV( name , "saidi", "Ayman",object,experience,Competence,langue,"football" );
        return cv;
    }


   // ListeCV list = new ListeCV();





}
