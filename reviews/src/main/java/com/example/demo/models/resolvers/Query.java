package com.example.demo.models.resolvers;


import com.example.demo.models.ReviewModel;
import graphql.annotations.annotationTypes.GraphQLDescription;
import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLNonNull;
import graphql.kickstart.graphql.annotations.GraphQLQueryResolver;

@GraphQLQueryResolver
public class Query {

    @GraphQLField
    @GraphQLDescription("fetching schema by review")
    public static ReviewModel getReview(@GraphQLNonNull Integer number) {
        return ReviewModel.builder().id(number).review("bleicher").build();
    }

    @GraphQLField
    public static Integer count2(Integer number) {
        return number;
    }

    @GraphQLField
    public static Integer itay(ReviewModel reviewModel) {
        return reviewModel.getId();
    }
    @GraphQLField
    public static Integer pavel(@GraphQLNonNull String bleicher){
        return 420;
    }

}
