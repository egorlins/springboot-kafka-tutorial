package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myStrTopic(){
        return TopicBuilder.name("some-topic-with-string-value").build();
    }
    @Bean
    public NewTopic muJsonTopic(){
        return TopicBuilder.name("some-topic-with-json-value").build();
    }
}
