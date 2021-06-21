package com.example.demo.resolvers;


import com.example.demo.models.AuthorModel;
import graphql.annotations.annotationTypes.GraphQLField;
import graphql.kickstart.graphql.annotations.GraphQLQueryResolver;

@GraphQLQueryResolver
public class Query {

    @GraphQLField
    public static AuthorModel getAuthor(Integer number) {
        return AuthorModel.builder().id(number).name("bleicher").build();
    }
    @GraphQLField
    public static Integer count(Integer number){
        return number;
    }
    @GraphQLField
    public static String getPavel(String sss){
        return sss;
    }
}
