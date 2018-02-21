package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {
	
	@Rule
	public DynamicPort myPort= new DynamicPort("http.port");
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello Maven");
        System.out.println("\n\n TestCase-1 dynamic Port ------>"+myPort.getNumber());
    }
    
    @Override
    protected String[] getConfigFiles() {
    	String[] files = {"maven-project.xml","global.xml"};
        return files;
    }

}
