
package generated.ParamountSoap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ParamountSoap", targetNamespace = "http://Service.ParamountSoap.com/", wsdlLocation = "http://matebook-maxime:8080/ParamountSoap1214311890914165963/ParamountSoap?wsdl")
public class ParamountSoap
    extends Service
{

    private final static URL PARAMOUNTSOAP_WSDL_LOCATION;
    private final static WebServiceException PARAMOUNTSOAP_EXCEPTION;
    private final static QName PARAMOUNTSOAP_QNAME = new QName("http://Service.ParamountSoap.com/", "ParamountSoap");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://matebook-maxime:8080/ParamountSoap1214311890914165963/ParamountSoap?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PARAMOUNTSOAP_WSDL_LOCATION = url;
        PARAMOUNTSOAP_EXCEPTION = e;
    }

    public ParamountSoap() {
        super(__getWsdlLocation(), PARAMOUNTSOAP_QNAME);
    }

    public ParamountSoap(WebServiceFeature... features) {
        super(__getWsdlLocation(), PARAMOUNTSOAP_QNAME, features);
    }

    public ParamountSoap(URL wsdlLocation) {
        super(wsdlLocation, PARAMOUNTSOAP_QNAME);
    }

    public ParamountSoap(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PARAMOUNTSOAP_QNAME, features);
    }

    public ParamountSoap(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ParamountSoap(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ParamountService
     */
    @WebEndpoint(name = "ParamountServicePort")
    public ParamountService getParamountServicePort() {
        return super.getPort(new QName("http://Service.ParamountSoap.com/", "ParamountServicePort"), ParamountService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ParamountService
     */
    @WebEndpoint(name = "ParamountServicePort")
    public ParamountService getParamountServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Service.ParamountSoap.com/", "ParamountServicePort"), ParamountService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PARAMOUNTSOAP_EXCEPTION!= null) {
            throw PARAMOUNTSOAP_EXCEPTION;
        }
        return PARAMOUNTSOAP_WSDL_LOCATION;
    }

}
