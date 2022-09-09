# Kafka download
https://kafka.apache.org/quickstart

# Kafka Run zookeeper (separate CMD)
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Kafka run server (separate CMD)
.\bin\windows\kafka-server-start.bat .\config\server.properties

# Create topic (any CMD)
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Kafka send events for topic quickstart-events (separate CMD)
.\bin\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092

# Kafka get eventsfor topic quickstart-events (separate CMD)
.\bin\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

####

# Create Spring project
https://start.spring.io/

# Spring Kafka documentation
https://docs.spring.io/spring-kafka/reference/html/#quick-tour
