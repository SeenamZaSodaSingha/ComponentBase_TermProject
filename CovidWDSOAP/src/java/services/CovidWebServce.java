/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package services;

import javax.annotation.Resource;
import javax.persistence.PersistenceContext;
import model.WeeklyDeath;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author SeenamZaSodaSingha
 */
@WebService(serviceName = "CovidWebService")
public class CovidWebServce {

//    @PersistenceContext(unitName = "CovidWDSOAPPU")
//    private EntityManager em;
//    @Resource
//    private javax.transaction.UserTransaction utx;

//    @PersistenceContext(unitName = "CovidWDSOAPPU")
//    private EntityManager em;
//    @Resource
//    private javax.transaction.UserTransaction utx;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidWDSOAPPU");

    /**
     * This is a sample web service operation
     */
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findBySeq")
    public WeeklyDeath findBySeq(@WebParam(name = "seq") int seq) {
//        System.out.println("*#####@_#)($*(#*#&#^@*(#ALLLLAHHHH ROAD BUSS Seq: " + seq);
        //TODO write your implementation code here:
        EntityManager em = emf.createEntityManager();
        WeeklyDeath wd = em.find(WeeklyDeath.class, seq);
        return wd;
    }

//    public void persist(Object object) {
//        try {
//            utx.begin();
//            em.persist(object);
//            utx.commit();
//        } catch (Exception e) {
//            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
//            throw new RuntimeException(e);
//        }
//    }
}
