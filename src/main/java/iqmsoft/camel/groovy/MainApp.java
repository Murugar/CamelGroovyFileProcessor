package iqmsoft.camel.groovy;

import org.apache.camel.main.Main;


public class MainApp {

  
    public static void main(String... args) throws Exception {
        Main main = new Main();
        main.enableHangupSupport();
        main.addRouteBuilder(new MyRouteBuilder());
        main.run(args);
    }

}

