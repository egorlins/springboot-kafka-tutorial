# Kafka
Kafka download
https://kafka.apache.org/quickstart

Kafka Run zookeeper (separate CMD)
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Kafka run server (separate CMD)
.\bin\windows\kafka-server-start.bat .\config\server.properties

Create topic (any CMD)
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Kafka send events for topic quickstart-events (separate CMD)
.\bin\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092

Kafka get events for topic quickstart-events (separate CMD)
.\bin\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

###

Create Spring project
https://start.spring.io/

Spring Kafka documentation
https://docs.spring.io/spring-kafka/reference/html/#quick-tour

# run/test

howto:
http://localhost:8080/api/v1/kafka/publish?message=hello%20world%201
string example
.\bin\windows\kafka-console-consumer.bat --topic some-topic-with-string-value --from-beginning --bootstrap-server localhost:9092
json example
.\bin\windows\kafka-console-consumer.bat --topic some-topic-with-json-value --from-beginning --bootstrap-server localhost:9092