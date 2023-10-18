
# User Management Application 

## Framework And Language Used
-  Java☕
- Spring Boot🌱

### Dependencies
- Spring  Web
- Lombok 
- Validation

### ➡️ Data Flow

## Configuration 
* Beanfactory.java

## Controller 
### UserController
* @PostMapping("users")
*  @GetMapping(value = "users")
*  @GetMapping("users/search/{userId}")
*  @PutMapping("users/{userId}/{phoneNumber}")
*  @DeleteMapping("users/delete/{userId}")
   
## Service 
### UserSerice
* createUser()
* getAllUsers()
* getUserById()
* updateUserPhoneNumber()
*  DeleteUser
 
## Model 
* User
  
## Repository 
* UserRepo
 
## Data Structure
- List , ArrayList

#### Project Summary
User Management system is use to handle activities related to User details.Here i have added validations and perform crud operations.

## Features for User Management System
* addUser 
* getUser/{userid}
* getAllUser
* updateUserInfo
* deleteUser
