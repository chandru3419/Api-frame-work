package pojo;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parasing.pojo.CompanyPojo;
import com.parasing.pojo.EmployeeDetails;

public class ObjectArrayImplimentation 
{
@Test
public void details() throws JsonGenerationException, JsonMappingException, IOException
{
	EmployeeDetails ed1=new EmployeeDetails("chandru", "TY3419", "chandru@gamil.com", 95874612);
	EmployeeDetails ed2=new EmployeeDetails("shekhar", "TY1234", "shekhar@gamil.com", 951753258);
	Object[] obj={ed1,ed2};
	int [] empphoneno={7843,4389};
	CompanyPojo com=new CompanyPojo("TYSS", "TY3419", "Chandru@gamil.com", 987456321,obj );
	ObjectMapper mapper=new ObjectMapper();
	mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonCompanyFile.json"), com);
}
}
