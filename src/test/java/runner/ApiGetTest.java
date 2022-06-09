package runner;

import Pages.ApiGet;
import cucumber.api.java.pt.Então;

public class ApiGetTest {
	
	ApiGet apiget = new ApiGet(); 
	
	
	@cucumber.api.java.pt.Dado("que eu consulte a api get para consultar cpf")
	public void que_eu_consulte_a_api_get_para_consultar_cpf() {
		
		apiget.acessarApi("http://localhost:8080/api/v1/restricoes/97093236014"); 
	   
	}

	@Então("Valido o status code de retorno")
	public void valido_o_status_code_de_retorno() {
		
		apiget.statusCode(200);
	   
	}

	@Então("Valido a mensagem de retorno")
	public void valido_a_mensagem_de_retorno(String texto) {
		
		apiget.body(texto);
		
	   
	}

}
