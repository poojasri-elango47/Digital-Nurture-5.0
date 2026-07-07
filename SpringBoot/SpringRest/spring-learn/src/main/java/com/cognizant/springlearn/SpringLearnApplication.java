package com.cognizant.springlearn;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cognizant.springlearn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger LOGGER =
        LoggerFactory.getLogger(SpringLearnApplication.class);
        public static void displayCountry() {

    LOGGER.info("START");

    ApplicationContext context =
            new ClassPathXmlApplicationContext("country.xml");

    Country country = context.getBean("country", Country.class);

    LOGGER.debug("Country : {}", country);

    LOGGER.info("END");
}
		public static void displayDate() {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("date-format.xml");

    SimpleDateFormat format =
            context.getBean("dateFormat", SimpleDateFormat.class);

    try {
       
       LOGGER.info("START");

        Date date = format.parse("31/12/2018");

        LOGGER.debug("Date : {}", date);

        LOGGER.info("END");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
        displayCountry();

}}
