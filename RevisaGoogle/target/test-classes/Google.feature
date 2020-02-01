Feature: ConsultaGoogle
Scenario: Volta as Aulas
	Given que acesso o site do Google
	When pesquiso por "Volta as Aulas"
	Then exibe no titulo da aba "Volta as Aulas - Pesquisa Google"
	
	#sintaxe Gherkin