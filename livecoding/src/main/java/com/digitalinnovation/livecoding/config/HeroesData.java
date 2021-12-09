package com.digitalinnovation.livecoding.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import static com.digitalinnovation.livecoding.constants.HeroesConstant.ENDPOINT_DYNAMO;
import static com.digitalinnovation.livecoding.constants.HeroesConstant.REGION_DYNAMO;

public class HeroesData {
  public static void main(String[] args) throws Exception {

    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
      .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
      .build();
    DynamoDB dynamoDB = new DynamoDB(client);

    Table table = dynamoDB.getTable("Heroes_Api_Table");

    Item hero = new Item()
      .withPrimaryKey("id", "1")
      .withString("name", "Batman")
      .withString("universe", "dc comics")
      .withNumber("strength", 5)
      .withNumber("magic", 0)
      .withNumber("speed", 6)
      .withNumber("intelligence", 10);

    Item hero2 = new Item()
      .withPrimaryKey("id", "2")
      .withString("name", "Feiticeira Escarlate")
      .withString("universe", "marvel")
      .withNumber("strength", 3)
      .withNumber("magic", 10)
      .withNumber("speed", 5)
      .withNumber("intelligence", 7);

    Item hero3 = new Item()
      .withPrimaryKey("id", "3")
      .withString("name", "Capita marvel")
      .withString("universe", "marvel")
      .withNumber("strength", 10)
      .withNumber("magic", 5)
      .withNumber("speed", 8)
      .withNumber("intelligence", 7);

    PutItemOutcome outcome1 = table.putItem(hero);
    PutItemOutcome outcome2 = table.putItem(hero2);
    PutItemOutcome outcome3 = table.putItem(hero3);

  }

}

