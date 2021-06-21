package com.example.demo.models.resolvers;

import com.example.demo.models.ReviewModel;
import graphql.annotations.annotationTypes.GraphQLDescription;
import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLNonNull;
import graphql.kickstart.graphql.annotations.GraphQLMutationResolver;

@GraphQLMutationResolver
public class Mutation {
    @GraphQLField
    @GraphQLDescription("fetching")
    public static ReviewModel setReview(@GraphQLNonNull Integer number) {
        return ReviewModel.builder().id(number).review("bleicher").build();
    }

    @GraphQLField
    public static Integer count3(Integer number) {
        return number;
    }

    @GraphQLField
    public static Integer itay2(ReviewModel reviewModel) {
        return reviewModel.getId();
    }

}
