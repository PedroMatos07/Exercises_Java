# DESAFIO: Contribuintes OO e Lista
Para calcular o imposto de renda que uma pessoa deve pagar, um país aplica as seguintes regras:

1) Imposto sobre salário: a pessoa paga
imposto sobre seu salário conforme
tabela ao lado
<p><a href="https://imgbb.com/"><img src="https://i.ibb.co/61ckLbF/image-2024-03-10-T22-16-26-589-Z.png" alt="image-2024-03-10-T22-16-26-589-Z" border="0" align="right"></a></p>
<br><br><br><br><br><br><br><br>
2) Se a pessoa obteve renda com prestação de serviços, o imposto cobrado é de 15%.<br><br>
3) Se a pessoa obteve ganho de capital (imóveis, ações, etc.), o imposto cobrado é de 20%.<br><br>
4) A pessoa pode abater até 30% do seu imposto bruto devido com gastos médicos ou educacionais. Mas
se seus gastos médicos e educacionais forem abaixo desses 30%, apenas os gastos médicos e
educacionais podem ser abatidos.<br><br>
Você deve fazer um programa para ler os dados de N contribuintes,
armazenando os dados desses contribuintes em uma lista. Depois,
você deve mostrar, para cada contribuinte, um resumo do imposto
conforme exemplo abaixo.<p><a href="https://imgbb.com/"><img src="https://i.ibb.co/56Bcvwn/image-2024-03-10-T22-17-41-745-Z.png" alt="image-2024-03-10-T22-17-41-745-Z" border="0" align="right"></a></p>

Você deve utilizar uma classe TaxPayer conforme projeto ao lado
para representar cada contribuinte. Repare que sua lista vai ter que
ser uma List < TaxPayer ><br><br>
Lembre-se de respeitar os nomes apresentados no projeto ao lado
(como foi fornecido o projeto para você executar, você tem que
respeitar a especificação do projeto). Sinta-se livre para
implementar construtores pra facilitar a instanciação dos objetos.


EXEMPLO:<br>
Quantos contribuintes você vai digitar? 2<br><br>
Digite os dados do 1o contribuinte:<br>
Renda anual com salário: 48000.00<br>
Renda anual com prestação de serviço: 0.00<br>
Renda anual com ganho de capital: 800.00<br>
Gastos médicos: 400.00<br>
Gastos educacionais: 5400.00<br><br>
Digite os dados do 2o contribuinte:<br>
Renda anual com salário: 189000.00<br>
Renda anual com prestação de serviço: 55184.93<br>
Renda anual com ganho de capital: 20000.00<br>
Gastos médicos: 600.00<br>
Gastos educacionais: 7500.00<br><br>

Resumo do 1o contribuinte:<br>
Imposto bruto total: 4960.00<br>
Abatimento: 1488.00<br>
Imposto devido: 3472.00<br><br>
Resumo do 2o contribuinte:<br>
Imposto bruto total: 50077.74<br>
Abatimento: 8100.00<br>
Imposto devido: 41977.74<br><br>
Critérios de avaliação (todos devem estar corretos):<br>
1) Nomes de classes, atributos, métodos e argumentos respeitando o projeto, bem como as convenções
de nome para Java (classe com primeira letra maiúscula, e padrão "camel case" para atributos, variáveis
e métodos.<br>
2) Atributos corretos e devidamente encapsulados com métodos get/set.<br>
3) Todos métodos corretos calculando os valores corretamente.<br>
4) Comportamento do programa correto conforme exemplo<br>
