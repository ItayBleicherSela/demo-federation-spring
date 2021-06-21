package com.example.demo;

import com.apollographql.federation.graphqljava.tracing.FederatedTracingInstrumentation;
import graphql.execution.instrumentation.Instrumentation;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import com.apollographql.federation.graphqljava.Federation;

@SpringBootApplication
public class AuthorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorApplication.class, args);
    }

    @Bean
    public Instrumentation addFederatedTracing() {
        return new FederatedTracingInstrumentation(new FederatedTracingInstrumentation.Options(true));
    }

    @Bean
    @Primary
    public GraphQLSchema buildSchema(GraphQLSchema graphQLSchema) {
     return Federation.transform(graphQLSchema).build();
    }

}
