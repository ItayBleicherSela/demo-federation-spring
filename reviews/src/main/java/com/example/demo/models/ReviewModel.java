package com.example.demo.models;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLType;

import lombok.*;

@GraphQLType
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewModel {
    @GraphQLField
    private Integer id;
    @GraphQLField
    private String review;
    @GraphQLField
    private String itayTheKing;
}
