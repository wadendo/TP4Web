package TP4webb;

/**
 * Created by wade on 01/04/14.
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wadendo on 01/04/14.
 */
@XmlRootElement(name = "CV")
public class CV {

    public String name;
    public String Prenom;
    public String Nom;
    public Map<Integer, String> Objectif = new HashMap<Integer, String>();
    public Map<Integer, String> Experience = new HashMap<Integer, String>();
    public Map<Integer, String> Competence = new HashMap<Integer, String>();
    public Map<Integer, String> Langue = new HashMap<Integer, String>();
    public String interet;


    public CV(String name, String nom, String Prenom, Map<Integer, String> Objectif, Map<Integer, String> Experience,
              Map<Integer, String> Competence, Map<Integer, String> Langue, String interet) {
        this.name = name;
        this.Nom = nom;
        this.Prenom = Prenom;
        this.Objectif = Objectif;
        this.Experience = Experience;
        this.Competence = Competence;
        this.interet = interet;
    }

    public CV() {

    }

    public String getName() {
        return name;
    }

    public String getInteret() {
           return this.interet;
    }

    public void setObjectif(Map<Integer, String > Objectif) {
        this.Objectif=Objectif;
    }

    public void setExperence(Map<Integer, String > Objectif) {
        this.Experience=Experience;
    }

    public void setCompetence(Map<Integer, String > Competence) {
        this.Competence=Competence;
    }

    public void setLangue(Map<Integer, String > Langue) {
        this.Langue=Langue;
    }

    public Map<Integer, String> getObjectif(){
        return this.Objectif;
    }
    public Map<Integer, String> getCompetence(){
        return this.Competence;
    }

    public Map<Integer, String> getLangue(){
        return this.Langue;
    }




    @XmlElement
    public void setName(String name) {
        this.name = name;
    }


}
