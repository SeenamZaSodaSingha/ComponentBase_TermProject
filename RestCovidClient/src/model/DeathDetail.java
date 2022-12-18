/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author SeenamZaSodaSingha
 */
public class DeathDetail {
    List<WeeklyDeath> deathDetail;

    public List<WeeklyDeath> getWeeklyDeath(){
        return deathDetail;
    }
    
    @XmlElement(name="deathDetail")
    public void setDeathDetails(List<WeeklyDeath> deathDetail){
        this.deathDetail = deathDetail;
    }
    
}
