package TesteAutomatizadoApi.Projeto;

import static org.junit.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {
	
	
	// Teste de Delete retorna codigo 200 conforme swagger, porem orientação em pdf informa retornar 204
	@Test
	public void Deletarsimulacao () {
		
	RequestSpecification request = RestAssured.given();
	request.header("accept", "*/*");
	request.header("Content-Type","application/json");
		
	Response response = request.delete("http://localhost:8080/api/v1/simulacoes/48");
	System.out.println(response.asPrettyString());
	System.out.println("Status Code: " + response.getStatusCode() + " Erro de Regra");
	assertEquals(200, response.getStatusCode());
	
	
	}
	
	// Teste de simulução nao encontrada, retorna codigo 200, porem na orientação em pdf informa retornar 404 
	@Test
	public void simulacaoNãoencontrada () {
		
	RequestSpecification request = RestAssured.given();
	request.header("accept", "*/*");
	request.header("Content-Type","application/json");
		
	Response response = request.delete("http://localhost:8080/api/v1/simulacoes/984");
	System.out.println(response.asPrettyString());
	System.out.println("Status Code: " + response.getStatusCode() + " Erro de Regra");
	assertEquals(404, response.getStatusCode());
	
	
	}
}
