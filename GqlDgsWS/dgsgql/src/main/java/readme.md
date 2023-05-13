#Netflix DSG Demo
#Plugin used for generate code from schema.graphqls file
# plugin used to attach that created code to the source code

Ex: Query
query {
  findUserById(userId:"10"){
    email
    name
  }
}

######List of a user####
query{
  getAllUsers{
    email
    name
  }
}

Ex: Mutation

mutation{
  createUser(input : {
    email:"Ajhdjj@gamd.com",
    name:"ahgdjh"
  })
  {
    __typename
    ... on UserCreateSuccessRes{
      message
      code
    }
    ...on UserCreateFailureRes{
      message
      errorCode
    }
  }
}