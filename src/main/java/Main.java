import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import servlet.MainServlet;

/**
 * Created by chenjunc on 2016/8/23.
 */
public class Main {

    private final static int PORT = 9080;


    public static void main(String[] args) throws Exception {
        Server server =new Server(PORT);
        WebAppContext context = new WebAppContext();
        context.setResourceBase("/web");
        context.setContextPath("/MyAxis2");
        context.addServlet(MainServlet.class,"/main");
        server.setHandler(context);
        server.start();
        server.join();
    }
}
