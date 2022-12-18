/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restcovidclient;

import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.bind.JAXB;
import model.DeathDetail;
import model.WeeklyDeath;
import util.CovidClient;

/**
 *
 * @author SeenamZaSodaSingha
 */
public class RestCovidClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CovidClient cvClient = new CovidClient();
        String json = cvClient.findAll_JSON(String.class);
        int jsonSize = json.replace("{", "").length();
        json = json.replace("[", "").replace("]", "").replace("{", "").replace("}", "").replace("\"", "");
        System.out.println(json);
        String[] jsonSplit = json.split(",");
        System.out.println(jsonSize);
        System.out.println(jsonSplit.length);

        //json size with 9 each field
        String[] extractData = new String[jsonSplit.length];
        for (int i = 0; i < jsonSplit.length; i++) {
            String[] tmp = jsonSplit[i].split(":");
            extractData[i] = tmp[1];
            System.out.println(extractData[i]);            
        }
        
        WeeklyDeath wd = new WeeklyDeath();
        int seq = 0;
        for (int i = 0; i < jsonSplit.length; i+=9) {
            // First Element
            wd.setSeq(seq++);
            wd.setYear(Integer.parseInt(extractData[i]));
            wd.setWeeknum(Integer.parseInt(extractData[i+1]));
            wd.setProvince(extractData[i+2]);
            wd.setAge(Integer.parseInt(extractData[i+3]));
            wd.setAgeRange(extractData[i+4]);
            wd.setOccupation(extractData[i+5]);
            wd.setType(extractData[i+6]);
            wd.setDeathCluster(extractData[i+7]);
            wd.setUpdateDate(extractData[i+8]);
            persist(wd);
        }
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestCovidClientPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
