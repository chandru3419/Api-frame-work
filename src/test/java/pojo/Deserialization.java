package pojo;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parasing.pojo.pojoLibrary;

public class Deserialization 
{
@Test
public void deserialization() throws JsonParseException, JsonMappingException, IOException
{
	ObjectMapper mapper = new ObjectMapper();
	pojoLibrary pobj = mapper.readValue(new File("./jsondata.json"), pojoLibrary.class);
	System.out.println(pobj.email);
	System.out.println(pobj.empId);
	System.out.println(pobj.name);
	System.out.println(pobj.phoneNo);
	System.out.println("bmbmnbmnbmnb");
}
}
