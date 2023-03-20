package Server;

import JWS.BanqueService;

import javax.xml.ws.Endpoint;

public class ServeurJaxWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:8080/";
        Endpoint.publish("http://0.0.0.0:8080/",new BanqueService());
        System.out.println("Web service has deploy in  "+url+" ");
    }
}
