
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CovidWebServce", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CovidWebServce {


    /**
     * 
     * @param seq
     * @return
     *     returns services.WeeklyDeath
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findBySeq", targetNamespace = "http://services/", className = "services.FindBySeq")
    @ResponseWrapper(localName = "findBySeqResponse", targetNamespace = "http://services/", className = "services.FindBySeqResponse")
    @Action(input = "http://services/CovidWebServce/findBySeqRequest", output = "http://services/CovidWebServce/findBySeqResponse")
    public WeeklyDeath findBySeq(
        @WebParam(name = "seq", targetNamespace = "")
        int seq);

}