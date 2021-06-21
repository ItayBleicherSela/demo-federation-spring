package com.example.demo.models;


import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLType;
import lombok.*;

@GraphQLType
@Builder
@Data
public class AuthorModel {
    @GraphQLField
    public Integer id;
    @GraphQLField
    public String name;
    @GraphQLField
    public String bleicher;

    public String getBleicher(){
        return "ssss";
    }
}


