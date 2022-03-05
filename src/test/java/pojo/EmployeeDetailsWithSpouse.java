package pojo;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parasing.pojo.PojoMyLibraryWithSpouseDetails;
import com.parasing.pojo.PojoSpouseLibrary;

public class EmployeeDetailsWithSpouse
{
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException
	{
		PojoSpouseLibrary sp = new PojoSpouseLibrary("kas", "kas@gmail.com", 789456123);
		PojoMyLibraryWithSpouseDetails my = new PojoMyLibraryWithSpouseDetails("Chandru", "TY-3419", "chandru@3419.com", 987456321, sp);
		
		ObjectMapper mapper=new ObjectMapper();
		System.out.println(mapper.writeValueAsString(my));
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonSpouseFile.jason"), my);
	}
	
}
