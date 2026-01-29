# rpg_galm

### O RPG DA GALERA

#### Conteúdo

* Preparação do ambiente
* Inicializando o repositório de dependências do projeto
* Iniciando a aplicação
* Recursos de desenvolvimento
* Desenvolvimento de testes

## Preparação do ambiente

> Este projeto usa Maven para gerênciar a compilação, testes e documentação.
> Para aprender mais sobre o Maven verifique a documentação em: [Maven Doc](https://maven.apache.org/what-is-maven.html)

Será necessário configurar o Maven e suas variáveis de ambiente para trabalhar nesse projeto, para isso siga as etapas
abaixo:

1. Baixe os arquivo compilados do Maven na [página de downloads](https://maven.apache.org/download.cgi#CurrentMaven);
2. Extraia o arquivo `apache-maven-<numero-versao>-src.zip` no seu diretório de trabalho;
3. Copie o caminho até o diretório `bin` de onde extraiu os arquivos do Maven, e na variável de ambiente `PATH` do seu
   sistema operacional, acresente o caminho do diretório copiado.
4. Abra o terminal e digite o comando `mvn -v`, o resultado deve ser semelhante ao conteúdo abaixo:

```
Apache Maven 3.9.11 (3e54c93a704957b63ee3494413a2b544fd3d825b)
Maven home: C:\Program Files\JetBrains\IntelliJ IDEA 2025.3\plugins\maven\lib\maven3
Java version: 25.0.1, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-25
Default locale: pt_BR, platform encoding: IBM850
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```

## Inicializando o repositório de dependências do projeto

Será necessárario que o Maven inicialize as dependências do projeto, para isso execute os comandos abaixo no terminal de
seu sistema:

* Limpe o ambiente do projeto: `mvn clean deploy site-deploy`
* Verifique se não há conflitos entre dependências: `mvn verify`
* Crie os pacotes e instale no seu repositório local: `mvn install`

## Iniciando a aplicação

Neste ponto do projeto, para iniciar a aplicação será apenas necessário executar o main localizado na classe
`com.rpg.galm.application.App`, através do comando:

`mvn exec:java -Dexec.mainClass=com.rpg.galm.application.App`

## Recursos de desenvolvimento

O projeto ja conta com lombok, abaixo terá um resumo das principais funcionalidades, mas se quiser saber mais, é
recomendável estudar a [documentação do projeto lombok](https://projectlombok.org/features/).

Agilize a escrita e evite o boilerplate utilizando as anotações do lombok:

* Construtores de classe:

#### Sem lombok:

```java
public class Cat {

	private final String name;
	private final Colors color;
	private Person owner;
	private List<Cat> kittens;

	/**
	 * Quanto mais atributos obrigatórios, mais argumentos serão necessários indicar no construtor e mais atributos 
	 * serão necessarios inicializar
	 * Não é complicado de fazer, mas é um trecho de código que não agrega muito na legibilidade de uma classe
	 */
	public Cat(String name, Colors color) {
		this.name = name;
		this.color = color;
	}

	public Cat(String name, Colors color, Person owner, List<Cat> kittens) {
		this(name, color);
		this.owner = owner;
		this.kittens = kittens;
	}

}
```

### Com Lombok:

```java
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

/**
 * Declare apenas as anotações e os atributos da classe, esta pronto seus construtores!
 */
@AllArgsConstructor
@RequiredArgsConstructor
public class Cat {

	private final String name;
	private final Colors color;
	private Person owner;
	private List<Cat> kittens;

}

public class Person {

	private List<Cat> cats = new ArrayList<>();

	/**
	 * Funciona igual ao construtor declarado explicitamente! YAY
	 */
	public void adoptCat(String name, Colors color) {
		Cat strayCat = new Cat(name, color);
		strayCat.setOwner(this);
		cats.add(strayCat);
	}

}
```

* Getters e Setters

#### Sem Lombok:

```java

public class Game {

	private String name;
	private Genre genre;
	private List<Player> players;

	public void setName(String name) {
		this.name = name;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public String getName() {
		return this.name;
	}

	public String getGenre() {
		return this.genre;
	}

	public String getPlayers() {
		return this.players;
	}

}
```

### Com Lombok:

```java
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {

	private String name;
	private Genre genre;
	private List<Player> players;

   /**
    * Nada de get e set apenas o código necessário
    */

}
```