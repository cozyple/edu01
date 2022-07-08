package test;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

public class TestServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new TestServer().start();
	}

	private void start() throws Exception {
		// TODO Auto-generated method stub
		Server server = new Server();
		ServerConnector http = new ServerConnector(server);
		http.setHost("127.0.0.1");
		http.setPort(8080);
		server.addConnector(http);

		ServletHandler servletHandler = new ServletHandler();
		servletHandler.addServletWithMapping(TestServlet.class, "/*");
		server.setHandler(servletHandler);

		server.start();
		server.join();
	}

}
