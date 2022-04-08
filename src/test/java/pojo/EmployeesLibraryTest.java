package pojo;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parasing.pojo.pojoLibrary;

public class EmployeesLibraryTest 
{
@Test
public void serialization() throws JsonGenerationException, JsonMappingException, IOException{

//we are creating an object of an pojo library
pojoLibrary pobj = new pojoLibrary("chandru","TY-3419", "chandru@testyantra", 987654321);
 
//converting java object into jason
ObjectMapper mapper = new ObjectMapper();

//printing json object into console
System.out.println(mapper.writeValueAsString(pobj));
mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsondata.json"), pobj);

}
}