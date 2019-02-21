
package xyz.oeste.integracion.endpoints;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xyz.oeste.integracion.endpoints package. 
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

    private final static QName _Actualizar_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "actualizar");
    private final static QName _ActualizarResponse_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "actualizarResponse");
    private final static QName _Insertar_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "insertar");
    private final static QName _InsertarResponse_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "insertarResponse");
    private final static QName _ServicioEliminarResponse_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "servicioEliminarResponse");
    private final static QName _Servicio_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "servicio");
    private final static QName _ServicioEliminar_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "servicioEliminar");
    private final static QName _BuscarTodosResponse_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "buscarTodosResponse");
    private final static QName _ServicioResponse_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "servicioResponse");
    private final static QName _Exception_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "Exception");
    private final static QName _BuscarTodos_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "buscarTodos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xyz.oeste.integracion.endpoints
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicioEliminarResponse }
     * 
     */
    public ServicioEliminarResponse createServicioEliminarResponse() {
        return new ServicioEliminarResponse();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link Insertar }
     * 
     */
    public Insertar createInsertar() {
        return new Insertar();
    }

    /**
     * Create an instance of {@link InsertarResponse }
     * 
     */
    public InsertarResponse createInsertarResponse() {
        return new InsertarResponse();
    }

    /**
     * Create an instance of {@link Servicio }
     * 
     */
    public Servicio createServicio() {
        return new Servicio();
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link BuscarTodosResponse }
     * 
     */
    public BuscarTodosResponse createBuscarTodosResponse() {
        return new BuscarTodosResponse();
    }

    /**
     * Create an instance of {@link ServicioResponse }
     * 
     */
    public ServicioResponse createServicioResponse() {
        return new ServicioResponse();
    }

    /**
     * Create an instance of {@link ServicioEliminar }
     * 
     */
    public ServicioEliminar createServicioEliminar() {
        return new ServicioEliminar();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link BuscarTodos }
     * 
     */
    public BuscarTodos createBuscarTodos() {
        return new BuscarTodos();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "actualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insertar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "insertar")
    public JAXBElement<Insertar> createInsertar(Insertar value) {
        return new JAXBElement<Insertar>(_Insertar_QNAME, Insertar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "insertarResponse")
    public JAXBElement<InsertarResponse> createInsertarResponse(InsertarResponse value) {
        return new JAXBElement<InsertarResponse>(_InsertarResponse_QNAME, InsertarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioEliminarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "servicioEliminarResponse")
    public JAXBElement<ServicioEliminarResponse> createServicioEliminarResponse(ServicioEliminarResponse value) {
        return new JAXBElement<ServicioEliminarResponse>(_ServicioEliminarResponse_QNAME, ServicioEliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Servicio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "servicio")
    public JAXBElement<Servicio> createServicio(Servicio value) {
        return new JAXBElement<Servicio>(_Servicio_QNAME, Servicio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioEliminar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "servicioEliminar")
    public JAXBElement<ServicioEliminar> createServicioEliminar(ServicioEliminar value) {
        return new JAXBElement<ServicioEliminar>(_ServicioEliminar_QNAME, ServicioEliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "buscarTodosResponse")
    public JAXBElement<BuscarTodosResponse> createBuscarTodosResponse(BuscarTodosResponse value) {
        return new JAXBElement<BuscarTodosResponse>(_BuscarTodosResponse_QNAME, BuscarTodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "servicioResponse")
    public JAXBElement<ServicioResponse> createServicioResponse(ServicioResponse value) {
        return new JAXBElement<ServicioResponse>(_ServicioResponse_QNAME, ServicioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.integracion.oeste.xyz/", name = "buscarTodos")
    public JAXBElement<BuscarTodos> createBuscarTodos(BuscarTodos value) {
        return new JAXBElement<BuscarTodos>(_BuscarTodos_QNAME, BuscarTodos.class, null, value);
    }

}
