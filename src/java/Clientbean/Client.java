/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/JerseyClient.java to edit this template
 */
package Clientbean;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:GenericResource [generic]<br>
 * USAGE:
 * <pre>
 *        Client client = new Client();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author amrit
 */
public class Client {

    private WebTarget webTarget;
    private javax.ws.rs.client.Client client;
    private static final String BASE_URI = "http://localhost:8080/RamFashion/webresources";

    public Client() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("generic");
    }

    public void putJson(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void registration(String aname, String email, String password, String phonno, String address, String city, String state, String cpin,String type) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("Registration/{0}/{1}/{2}/{3}/{4}/{5}/{6}/{7}/{8}", new Object[]{aname, email, password, phonno, address, city, state, cpin,type})).request().post(null);
    }

    public void signup(String name, String eml, String pass, String pic) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("signup/{0}/{1}/{2}/{3}", new Object[]{name, eml, pass, pic})).request().post(null);
    }

    public String getJson() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
    }

    public void close() {
        client.close();
    }
    
}
