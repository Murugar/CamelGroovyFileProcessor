package iqmsoft.camel.groovy;

import org.apache.camel.builder.RouteBuilder;


public class MyRouteBuilder extends RouteBuilder {

    
    public void configure() {

        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message using XPath
        from("file:src/data?noop=true")
            .choice()
                .when(xpath("/person/city = 'London'"))
                    .log("UK message")
                    .to("file:target/messages/uk")
                .otherwise()
                    .log("Tampa Message")
                    .to("file:target/messages/tampa");
    }

}
