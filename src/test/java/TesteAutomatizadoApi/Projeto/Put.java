package TesteAutomatizadoApi.Projeto;

import static org.junit.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;

public class Put {
	
	@Test
	public void AlterarSimulacaoComSucesso() {
		
		 
		    
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("nome","Fulano ciclano"); 
		json.put("cpf", "97093236014"); 
		json.put("email","tterar@email.com"); 
		json.put("valor","1200"); 
		json.put("parcelas","3"); 
		json.put("seguro","true"); 	
		
		request.body(json.toJSONString());
		Response response = request.put("http://localhost:8080/api/v1/simulacoes/97093236014");
		System.out.println(response.asPrettyString());
		System.out.println("Status Code: " + response.getStatusCode());
		assertEquals(200, response.getStatusCode());
					
				
	 	}	
	
	@Test
	public void AlterarSimulacaoCpfNaoEncontrado() {
		
		 
		    
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("nome","Fulano ciclano"); 
		json.put("cpf", "48765412369"); 
		json.put("email","tstealterar@email.com"); 
		json.put("valor","1200"); 
		json.put("parcelas","3"); 
		json.put("seguro","true"); 	
		
		request.body(json.toJSONString());
		Response response = request.put("http://localhost:8080/api/v1/simulacoes/48765412369");
		System.out.println(response.asPrettyString());
		System.out.println("Status Code: " + response.getStatusCode());
		assertEquals(404, response.getStatusCode());
					
				
	 	}	
	@Test
	public void AlterarSimulacoesCpfExistente() {
		
		 
		    
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("nome","Fulano ciclano"); 
		json.put("cpf", "84809766080"); 
		json.put("email","tstealterar@email.com"); 
		json.put("valor","1200"); 
		json.put("parcelas","3"); 
		json.put("seguro","true"); 	
		
		request.body(json.toJSONString());
		Response response = request.put("http://localhost:8080/api/v1/simulacoes/84809766080");
		System.out.println(response.asPrettyString());
		System.out.println("Status Code: " + response.getStatusCode());
		assertEquals(409, response.getStatusCode());
					
				
	 	}	
	}
