#language: pt

#Author: yamaguche@hotmail.com

@executa
Funcionalidade: Consultar restrição de cpf
  Como usuario quero validar a consulta do cpf, se possui restrição 

 Contexto: Acessar api 
  Dado que eu consulte a api get para consultar cpf 
  
  Cenario: Validar status code 
     Entao Valido o status code de retorno 
   
   Cenario: Validar body response  
     Entao Valido a mensagem de retorno "O CPF 97093236014 tem problema"

   

  