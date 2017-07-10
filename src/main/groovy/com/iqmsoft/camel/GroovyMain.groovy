package com.iqmsoft.camel

import org.apache.camel.main.Main;

import iqmsoft.camel.groovy.MyRouteBuilder;

class GroovyMain {

	static main(args) {
		System.out.println("Camel Groovy starting")
		
		Main main = new Main();
		main.enableHangupSupport();
		main.addRouteBuilder(new MyRouteBuilder());
		main.run(args);
		
		System.out.println("Camel Groovy Ending")
	}

}
