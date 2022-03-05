package pojo;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parasing.pojo.PojoArryLibrary;
import com.parasing.pojo.pojoLibrary;

public class EmployeeDetailsWithArry 
{
@Test
public void serialization() throws JsonGenerationException, JsonMappingException, IOException
{
	long[] arr={987654321,987456325,951753258,965478235};
	
	//creating object for pojo library
	 PojoArryLibrary Pobj = new PojoArryLibrary("chandru","TY3419", "chandru@gmail,com", arr);
	
	//convert java object in to json 
	ObjectMapper mapper = new ObjectMapper();
	
	//printing json object into console
	System.out.println(mapper.writeValueAsString(Pobj));
	
	//generate json file 
	mapper.writerWithDefaultPrettyPrinter().writeValue(new File ("./jasondataL.jason"), Pobj);
	
	
	
	
	
	
}
}
