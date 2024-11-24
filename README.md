### Projeto AgriConnect Aplication

<p>
    Plataforma que conecta pequenos agricultores a transportadores locais, facilitando o agendamento de entregas e otimizando a logística de escoamento de produtos agrícolas para mercados e consumidores.
</p>

### Modelo de domínio AgriConnect

```mermaid
classDiagram

class agricultor{
 - String nome
 - String enderecoFazenda
 - String produtosdisponiveis
 - Integer quantidade
}

class transportador{
 - String nome
 - String veiculoModelo
 - Integer capacidade
 - float areaCobertura
}

class entregas{
 - String produto
 - Integer quantidade
 - DateTime dataHoraEntrega
}

    entregas "1"*--"1" agricultor
    entregas "1"*--"1" transportador

```

## Dependencia para usar no pom.xml

```xml


```

### Protótipo

![Imagem 1](src/main/java/com/hackathon/Projeto_AgriConnect/imag/IMG-20241123-WA0001.jpg)
![Imagem 3](src/main/java/com/hackathon/Projeto_AgriConnect/imag/IMG-20241123-WA0097.jpg)
![Imagem 4](src/main/java/com/hackathon/Projeto_AgriConnect/imag/IMG-20241123-WA0098.jpg)
![Imagem 2](src/main/java/com/hackathon/Projeto_AgriConnect/imag/IMG-20241123-WA0096.jpg)

### Tecnologias Ultilizadas

## Back-End

<ul>
	<li>Java</li>
	<li>Spring Boot</li>
	<li>H2</li>
	<li>Database JPA</li>
	<li>SQL</li>
	<li>Maven</li>
	<li>Docker</li>
	<li>Postgresql</li>
</ul>

## Front-End

<ul>
	<li>ReactJs</li>
	<li>Sass</li>
	<li>TypeScript</li>
</ul>
