# API para registrar "heróis"

## Spring Framework
## Spring webflux
## Reactor
## DynamoDB
## Slf4j
## JUnit
## Swagger

# Para executar o dynamo, abra um prompt de comando na pasta deste e digite: 

java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb

Obs.: Talvez seja necessário acesso de admnistrador/superusuário

# Para acessar a tabela, digite no prompt de comando:

aws dynamodb list-tables --endpoint-url http://localhost:8000

# A interface Swagger pode ser acessada no navegador com este endereço:

http://localhost:8080/swagger-ui-heroes-reactive-api.html
