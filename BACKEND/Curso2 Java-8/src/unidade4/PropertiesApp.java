package unidade4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesApp {

	public static void main(String[] args) throws Exception {

		Properties sites = new Properties();
		sites.loadFromXML(new FileInputStream("/home/adrieldev/CursosSplenda/Curso2 Java-8/src/unidade4/site.xml"));
		System.out.println(sites.getProperty("1"));
		
	}

}
