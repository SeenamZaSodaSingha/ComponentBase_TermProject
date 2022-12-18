/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package covidsoapclient;

import services.WeeklyDeath;

/**
 *
 * @author SeenamZaSodaSingha
 */
public class CovidSOAPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeeklyDeath wd = findBySeq(1);
        System.out.println(wd.getAge());
        
    }

    private static WeeklyDeath findBySeq(int seq) {
        services.CovidWebService service = new services.CovidWebService();
        services.CovidWebServce port = service.getCovidWebServcePort();
        return port.findBySeq(seq);
    }
    
}
