
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindBySeq_QNAME = new QName("http://services/", "findBySeq");
    private final static QName _FindBySeqResponse_QNAME = new QName("http://services/", "findBySeqResponse");
    private final static QName _WeeklyDeath_QNAME = new QName("http://services/", "weeklyDeath");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindBySeq }
     * 
     */
    public FindBySeq createFindBySeq() {
        return new FindBySeq();
    }

    /**
     * Create an instance of {@link FindBySeqResponse }
     * 
     */
    public FindBySeqResponse createFindBySeqResponse() {
        return new FindBySeqResponse();
    }

    /**
     * Create an instance of {@link WeeklyDeath }
     * 
     */
    public WeeklyDeath createWeeklyDeath() {
        return new WeeklyDeath();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBySeq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindBySeq }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findBySeq")
    public JAXBElement<FindBySeq> createFindBySeq(FindBySeq value) {
        return new JAXBElement<FindBySeq>(_FindBySeq_QNAME, FindBySeq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBySeqResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindBySeqResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findBySeqResponse")
    public JAXBElement<FindBySeqResponse> createFindBySeqResponse(FindBySeqResponse value) {
        return new JAXBElement<FindBySeqResponse>(_FindBySeqResponse_QNAME, FindBySeqResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeeklyDeath }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WeeklyDeath }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "weeklyDeath")
    public JAXBElement<WeeklyDeath> createWeeklyDeath(WeeklyDeath value) {
        return new JAXBElement<WeeklyDeath>(_WeeklyDeath_QNAME, WeeklyDeath.class, null, value);
    }

}
