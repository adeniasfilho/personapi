Digital Innovation: Bootcamp everis Site Reliability Engineer Essentials - Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot
Nesta live coding vamos desenvolver um pequeno sistema para o gerenciamento de pessoas de uma empresa através de uma API REST, criada com o Spring Boot.

Durante a sessão, serão desenvolvidos e abordados os seguintes tópicos:

Setup inicial de projeto com o Spring Boot Initialzr
Add Dependencies:
- dev tools, Lombok, Spring Web, Spring Data JPA, Spring Boot  Actuator, H2 Database; e por fim "generate".

Criação de modelo de dados para o mapeamento de entidades em bancos de dados
Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
Desenvolvimento de testes unitários para validação das funcionalidades
Implantação do sistema na nuvem através do Heroku
Para executar o projeto no terminal, digite o seguinte comando:

mvn spring-boot:run

Caso informe mvn não é um comando válido, fazer download, adicionar em Variáveis de Ambiente :
- MVN_HOME C:\Program Files\apache-maven-3.8.2\
- C:\Users\"ROOT"\AppData\Roaming\apache-maven-3.8.2\bin
Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

http://localhost:8080/api/v1/citizens
São necessários os seguintes pré-requisitos para a execução do projeto:

Java 11 ou versões superiores.
Maven 3.6.3 ou versões superiores.
Intellj IDEA Community Edition ou sua IDE favorita.
Controle de versão GIT instalado na sua máquina.
Conta no GitHub para o armazenamento do seu projeto na nuvem.
Conta no Heroku para o deploy do projeto na nuvem

Obs.: criar um arquivo na raiz do seu projeto para realizar deploy no Heroku: ele reconhece até a versão 8 do Java.
Nome do arquivo: system.properties; conteúdo: java.runtime.version=11

Para instalação do framework mapstruct para mapear as entidades, clique em documentação - instalação. Abra seu pom.xml e insira a Distribuição Bundle.
Deve ficar deste modo:

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<parent>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-parent</artifactId>
<version>2.5.4</version>
<relativePath/> <!-- lookup parent from repository -->
</parent>
<groupId>one.digitalinnovation</groupId>
<artifactId>personapi</artifactId>
<version>0.0.1-SNAPSHOT</version>
<name>personapi</name>
<description>Person API project</description>
<properties>
<java.version>11</java.version>
<org.mapstruct.version>1.4.2.Final</org.mapstruct.version>
</properties>
<dependencies>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.mapstruct</groupId>
			<artifactId>mapstruct</artifactId>
			<version>${org.mapstruct.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
        </dependency>
    </dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
							<version>${lombok.version}</version>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
				<configuration>
					<source>11</source> <!-- depending on your project -->
					<target>11</target> <!-- depending on your project -->
					<annotationProcessorPaths>
						<path>
							<groupId>org.mapstruct</groupId>
							<artifactId>mapstruct-processor</artifactId>
							<version>${org.mapstruct.version}</version>
						</path>
						<!-- other annotation processors -->
					</annotationProcessorPaths>
				</configuration>
			</plugin>
		</plugins>
	</build>

</project>



