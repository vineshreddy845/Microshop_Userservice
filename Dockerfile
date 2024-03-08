FROM openjdk:17
ADD target/MicroShop-0.0.1-SNAPSHOT.jar MicroShopSNAPSHOT.jar
ENTRYPOINT ["java","-jar","MicroShopSNAPSHOT.jar"]