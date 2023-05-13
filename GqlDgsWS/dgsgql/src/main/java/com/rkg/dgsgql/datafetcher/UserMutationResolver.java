package com.rkg.dgsgql.datafetcher;

import java.util.ArrayList;
import java.util.List;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.rkg.dgsgql.graphql.model.types.User;
import com.rkg.dgsgql.graphql.model.types.UserCreateFailureRes;
import com.rkg.dgsgql.graphql.model.types.UserCreateSuccessRes;
import com.rkg.dgsgql.graphql.model.types.UserInput;
import com.rkg.dgsgql.graphql.model.types.UserResult;

@DgsComponent
public class UserMutationResolver {

	@DgsMutation
	//@DgsData(parentType = "Mutation", field = "createUser")
	public UserResult createUser(@InputArgument("input") UserInput userInput) {
		System.out.println("user Crate ##########3"+userInput);
		if(userInput.getEmail().contains("@")) {
			return UserCreateSuccessRes.newBuilder().code("1234").message("crates").build();
		}
		else return UserCreateFailureRes.newBuilder().errorCode("C12345").message("Not created").build();
	}
	
	@DgsQuery
	public User findUserById(@InputArgument String userId) {
		System.out.println("UserId is: "+userId);
		User user = User.newBuilder().email("uahudhjd@gamdil").name("ajhdj").build();
		return user;
	}
	
	@DgsQuery
	public List<User> getAllUsers() {
		System.out.println("Inside getAllUsers method");
		return List.of(User.newBuilder().email("test@test.com").name("Test").build(),
				User.newBuilder().email("abdhdf@test.com").name("Voidjhhn").build());
	}
}
