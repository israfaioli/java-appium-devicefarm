![poster](https://toxsl.com/blog/image/77/post-image_file-QUALITY_ASSURANCE.png)

Projeto para demonstrar conhecimento sobre testes mobile linguagem JAVA utilizando a library do Appium.
Para testes CICD iremos utilizar devicefarm que no caso sera o BROWSERSTACK.

Neste exemplo utilizamos como base as seguintes urls oficiais para que este projeto fosse possivel:
- https://appium.io/docs/en/latest/
- https://app-automate.browserstack.com/dashboard/v2
- https://developer.android.com/
- https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html
- https://maven.apache.org/download.cgi
- https://mvnrepository.com/

## 🤖 Antes de rodar os testes devemos ter os programas abaixo OK:
* Android studio com um device criado caso seja testes locais
* Node, Java, Maven instalados na maquina
* Appium criado e com sessão aberta caso seja testes locais

* Acessa a pasta do projeto

## 🤖 Como executar

* Acessa a pasta do projeto
* Acesse o diretório tests:
* Executar todos os testes local para android

```
mvn test -Dexecucao=local -Ddispositivo=android
```

* Executar todos os testes devicefarm para android

```
mvn test -Dexecucao=devicefarm -Ddispositivo=android
```

* Executar todos os testes local para ios

```
mvn test -Dexecucao=local -Ddispositivo=ios
```

* Executar todos os testes devicefarm para ios

```
mvn test -Dexecucao=devicefarm -Ddispositivo=ios
```

<hr>
Caro recrutador caso sinta interesse em ver outros projetos de meu portifólio acessar a url abaixo: 
- https://github.com/israfaioli