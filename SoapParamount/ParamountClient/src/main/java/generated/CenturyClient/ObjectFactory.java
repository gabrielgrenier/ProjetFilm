
package generated.CenturyClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.CenturyClient package. 
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

    private final static QName _AddResponse_QNAME = new QName("http://Service.ParamountSoap.com/", "addResponse");
    private final static QName _EditResponse_QNAME = new QName("http://Service.ParamountSoap.com/", "editResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://Service.ParamountSoap.com/", "deleteResponse");
    private final static QName _Edit_QNAME = new QName("http://Service.ParamountSoap.com/", "edit");
    private final static QName _GetFilm_QNAME = new QName("http://Service.ParamountSoap.com/", "getFilm");
    private final static QName _GetFilms_QNAME = new QName("http://Service.ParamountSoap.com/", "getFilms");
    private final static QName _GetFilmResponse_QNAME = new QName("http://Service.ParamountSoap.com/", "getFilmResponse");
    private final static QName _Add_QNAME = new QName("http://Service.ParamountSoap.com/", "add");
    private final static QName _Delete_QNAME = new QName("http://Service.ParamountSoap.com/", "delete");
    private final static QName _GetFilmsResponse_QNAME = new QName("http://Service.ParamountSoap.com/", "getFilmsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.CenturyClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link GetFilmResponse }
     * 
     */
    public GetFilmResponse createGetFilmResponse() {
        return new GetFilmResponse();
    }

    /**
     * Create an instance of {@link EditResponse }
     * 
     */
    public EditResponse createEditResponse() {
        return new EditResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link GetFilm }
     * 
     */
    public GetFilm createGetFilm() {
        return new GetFilm();
    }

    /**
     * Create an instance of {@link GetFilms }
     * 
     */
    public GetFilms createGetFilms() {
        return new GetFilms();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetFilmsResponse }
     * 
     */
    public GetFilmsResponse createGetFilmsResponse() {
        return new GetFilmsResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link Film }
     * 
     */
    public Film createFilm() {
        return new Film();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ParamountSoap.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ParamountSoap.com/", name = "editResponse")
    public JAXBElement<EditResponse> createEditResponse(EditResponse value) {
        return new JAXBElement<EditResponse>(_EditResponse_QNAME, EditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ParamountSoap.com/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ParamountSoap.com/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ParamountSoap.com/", name = "getFilm")
    public JAXBElement<GetFilm> createGetFilm(GetFilm value) {
        return new JAXBElement<GetFilm>(_GetFilm_QNAME, GetFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ParamountSoap.com/", name = "getFilms")
    public JAXBElement<GetFilms> createGetFilms(GetFilms value) {
        return new JAXBElement<GetFilms>(_GetFilms_QNAME, GetFilms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ParamountSoap.com/", name = "getFilmResponse")
    public JAXBElement<GetFilmResponse> createGetFilmResponse(GetFilmResponse value) {
        return new JAXBElement<GetFilmResponse>(_GetFilmResponse_QNAME, GetFilmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ParamountSoap.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ParamountSoap.com/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ParamountSoap.com/", name = "getFilmsResponse")
    public JAXBElement<GetFilmsResponse> createGetFilmsResponse(GetFilmsResponse value) {
        return new JAXBElement<GetFilmsResponse>(_GetFilmsResponse_QNAME, GetFilmsResponse.class, null, value);
    }

}
