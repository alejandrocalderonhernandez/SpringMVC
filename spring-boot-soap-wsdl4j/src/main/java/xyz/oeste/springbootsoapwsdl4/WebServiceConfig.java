package xyz.oeste.springbootsoapwsdl4;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;


@EnableWs
@Configuration
public class WebServiceConfig {
	
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet>messageDispacherServlet(ApplicationContext contexto){
			MessageDispatcherServlet dispatcher = new MessageDispatcherServlet();
			dispatcher.setApplicationContext(contexto);
			dispatcher.setTransformWsdlLocations(true);
			return new ServletRegistrationBean<MessageDispatcherServlet>(dispatcher,"/ws/*");
	}
}
