package com.example.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TomcatSpringBootApplication {

	public static void main(String[] args) {
//	public static void main(String[] args) throws LifecycleException, IOException {
		SpringApplication.run(TomcatSpringBootApplication.class, args);
/*		
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		
		String docBase = Files.createTempDirectory("tomcat-basedir").toString();

        Context context = tomcat.addContext("/", docBase);
        
        HttpServlet servlet = new HttpServlet() {
        	@Override
        	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        			throws ServletException, IOException {
        		
        		PrintWriter writer = resp.getWriter();
        		writer.println("<html><head><title>");
        		writer.println("hey, tomcat");
        		writer.println("</title></head>");
        		writer.println("<body><h1>hello tomcat</h1></body>");
        		writer.println("</html>");
        		
        	}
		};
		
		String servletName = "helloServlet";
		tomcat.addServlet("/", servletName, servlet);
		context.addServletMappingDecoded("/hello", servletName);
		
		tomcat.getConnector();
		tomcat.start();
		tomcat.getServer().await();
		*/
	}
	

}
