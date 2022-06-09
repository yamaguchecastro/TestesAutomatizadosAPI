package TesteAutomatizadoApi.Projeto;

import static org.junit.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post {
	
	@SuppressWarnings("unchecked")
	
	@Test
	public void CadastrarSimulacoesSucesso() {
		
		 
		    
		RequestSpecification request = RestAssured.given();
		request.header("accept", "*/*");
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("nome","Fulano ciclano"); 
		json.put("cpf", "54687"); 
		json.put("email","email@email.com"); 
		json.put("valor","1200"); 
		json.put("parcelas","3"); 
		json.put("seguro","true"); 
		
		request.body(json.toJSONString());
		Response response = request.post("http://localhost:8080/api/v1/simulacoes");
		System.out.println(response.asPrettyString());
		System.out.println("Status Code: " + response.getStatusCode() + " Simulação Cadastrada com sucesso!");
		assertEquals(201, response.getStatusCode());		
	}
	

@Test
public void CadastrarSimulacoesErro() {
	
	 	    
	RequestSpecification request = RestAssured.given();
	request.header("accept", "*/*");
	request.header("Content-Type","application/json");
	JSONObject json = new JSONObject();
	json.put("nome","Fulano ciclano"); 
	json.put("cpf", ""); 
	json.put("email",""); 
	json.put("valor","1200"); 
	json.put("parcelas","3"); 
	json.put("seguro","true"); 
	
	request.body(json.toJSONString());
	Response response = request.post("http://localhost:8080/api/v1/simulacoes");
	System.out.println(response.asPrettyString());
	System.out.println("Status Code: " + response.getStatusCode() + " Erro de Regra");
	assertEquals(400, response.getStatusCode());		
}

@Test
public void CadastrarSimulacoesCpfDuplicado() {
	
	 // Documentação fala que retorna 409 porem retorna 400 para CPF duplicado
	    
	RequestSpecification request = RestAssured.given();
	request.header("accept", "*/*");
	request.header("Content-Type","application/json");
	JSONObject json = new JSONObject();
	json.put("nome","Fulano ciclano"); 
	json.put("cpf", "97093236014"); 
	json.put("email","email@email.com"); 
	json.put("valor","1200"); 
	json.put("parcelas","3"); 
	json.put("seguro","true"); 
	
	request.body(json.toJSONString());
	Response response = request.post("http://localhost:8080/api/v1/simulacoes");
	System.out.println(response.asPrettyString());
	System.out.println("Status Code: " + response.getStatusCode() + " Erro de Regra");
	assertEquals(409, response.getStatusCode());		
}

}