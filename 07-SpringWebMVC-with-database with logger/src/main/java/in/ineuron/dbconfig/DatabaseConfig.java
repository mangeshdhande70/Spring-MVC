package in.ineuron.dbconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
//@PropertySource(value = "../resources/application.properties")
public class DatabaseConfig {
	
	@Value("${spring.datasource.driver-class-name}")
	private String DRIVER;
	
	@Value("${spring.datasource.url}")
	private String URL;
	
	@Value("${spring.datasource.username}")
	private String USERNAME;
	
	@Value("${spring.datasource.password}")
	private String PASSWORD;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String HBM2DDL_AUTO;
	
	@Value("${spring.jpa.show-sql}")
	private String SHOW_SQL;
	
	@Value("${spring.jpa.database-platform}")
	private String DIALECT;
	
	@Value("${spring.jpa.properties.hibernate.packagesToScan}")
	private String PACKAGE_TO_SCAN;
	
	@Value("$spring.jpa.properties.hibernate.format_sql}")
	private String SQL_FORMATE;
	
	
	
	@Bean
	@Primary
	public DataSource dataSource() {
		
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    
	    dataSource.setDriverClassName(DRIVER);
	    dataSource.setUrl(URL);
	    dataSource.setUsername(USERNAME);
	    dataSource.setPassword(PASSWORD);
		
		return dataSource;
		
	}
	
	
	@Bean
	public LocalSessionFactoryBean sessionFactoryBean() {
		
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(PACKAGE_TO_SCAN);
		sessionFactory.setHibernateProperties(getProperties());
		
		
		return sessionFactory;
		
	}
	
	 @Bean
	    public PlatformTransactionManager transactionManager(SessionFactory sessionFactory) {
	        return new HibernateTransactionManager(sessionFactory);
	    }

	
	
	private final Properties getProperties() {
	
		Properties hibernateProperties = new Properties();
		
		 hibernateProperties.setProperty("hibernate.dialect", DIALECT);
	     hibernateProperties.setProperty("hibernate.hbm2ddl.auto", HBM2DDL_AUTO);
	     hibernateProperties.setProperty("hibernate.show_sql", SHOW_SQL);
		 hibernateProperties.setProperty("hibernate.format_sql", SQL_FORMATE);
		
		return hibernateProperties;
		
	}
	
	

}
