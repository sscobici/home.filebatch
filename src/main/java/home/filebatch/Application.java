package home.filebatch;

import org.apache.camel.spring.javaconfig.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    private static Main camelMain;

    public static void main(String[] args) throws Exception {
        camelMain = new Main();
        camelMain.setConfigClass(ApplicationConfig.class);
        camelMain.run(args);
    }
}
