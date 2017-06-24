package ca.drewm.example.webserver;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.xml.XmlConfiguration;

public class Startup {
	public static void main(String[] args) throws Exception {
		Resource serverConfigXml = Resource.newSystemResource("server_config.xml");
		XmlConfiguration config = new XmlConfiguration(serverConfigXml.getInputStream());

		Server server = (Server)config.configure();

		server.start();
		server.join();
	}
}
