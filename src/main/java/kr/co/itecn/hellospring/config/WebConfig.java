package kr.co.itecn.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc	//*** 중요한 기능 *** // MVC 기능을 사용할수 있게 하는것!!! //HandlerMapping //ViewReslover //MessageContainer 가 생기도록 해주는 기능
@ComponentScan({"kr.co.itcen.hellospring.controller"})
public class WebConfig {
	//WebConfig - 설정파일만 있음.
	
//	<!-- View Resolver -->
//	<bean id="viewResolver"
//		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//		<property name="viewClass"
//			value="org.springframework.web.servlet.view.JstlView" />
//		<property name="prefix" value="/WEB-INF/views/" />
//		<property name="suffix" value=".jsp" />
//		<property name="order" value="1" />
//	</bean>
	
	@Bean
	public ViewResolver viewResolver() {
		// viewResolve를 형성한후에 데이터를 주입해주는 것!!!
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setExposeContextBeansAsAttributes(true);
		
		return viewResolver;
	}

}
