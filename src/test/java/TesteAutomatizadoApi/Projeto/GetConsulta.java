package TesteAutomatizadoApi.Projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetConsulta {
	
	@Test
	public void SimulacaoEncontrada() {
		
    Response response = RestAssured.get("http://localhost:8080/api/v1/restricoes/97093236014");
    int code = response.getStatusCode();
    assertEquals(200, code); 
 
    
 System.out.println("Status Code: " + response.getStatusCode()+ " Simulação encontrada");
	
	} 
	
	// Teste de CPF nao encontrado, na documentação informa aparecer o codigo 404, porem na aplicação apresenta o codigo 204
	@Test
	public void SimulacaoNaoEncontrada() {
		
    Response response = RestAssured.get("http://localhost:8080/api/v1/restricoes/45678452169");
    int code = response.getStatusCode();
    assertEquals(404, code); 
 
    
 System.out.println("Status Code: " + response.getStatusCode()+ " Simulação não encontrada");
	
	} 


}
