package TesteAutomatizadoApi.Projeto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.StringContains;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;

public class Get {
	
	@Test
	public void cpfComRestricao() {
		
    Response response = RestAssured.get("http://localhost:8080/api/v1/restricoes/97093236014");
    int code = response.getStatusCode();
       assertEquals(200, code); 
    
       
    System.out.println("Status Code: " + response.getStatusCode()+ " possui restrição");
	
	} 
	
 @Test 
 public void testbody() {
	
	Response response = RestAssured.get("http://localhost:8080/api/v1/restricoes/97093236014");
	System.out.println(response.asPrettyString());
	String bodyRetorno = response.asPrettyString();
	assertTrue(bodyRetorno.contains("problema"));
	 
		
}

 @Test
	public void cpfSemRestricao() {
		
 Response response = RestAssured.get("http://localhost:8080/api/v1/restricoes/45632875421");
 int code = response.getStatusCode();
    assertEquals(204, code); 
 
    
 System.out.println("Status Code: " + response.getStatusCode()+ " sem restrição");
	
	} 
 
 
 

}