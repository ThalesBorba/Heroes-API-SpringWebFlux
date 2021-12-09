# API para registrar "heróis"

## Spring Framework
## Spring webflux
## Reactor
## DynamoDB
## Slf4j
## JUnit
## Swagger

Para executar dynamo: 

java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
* Talvez seja necessário acesso de admnistrador/superusuário
 
aws dynamodb list-tables --endpoint-url http://localhost:8000

swagger: http://localhost:8080/swagger-ui-heroes-reactive-api.html
