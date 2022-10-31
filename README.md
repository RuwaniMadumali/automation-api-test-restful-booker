# Automation Script for Sample API testing
>This project represent automation script for all CRUD methods

### Introduction
This Project is for learn to automate API testing with rest-assured.Here used API,restful-booker is a Create Read Update Delete Web API that comes with authentication features and loaded with a bunch of bugs to explore.

#### API documentation Url : https://restful-booker.herokuapp.com/apidoc/index.html


#### Automated methods in this project:
| METHOD   | NAME                 | DESCRIPTION                                                                                                                                  |
|----------|----------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| `POST`   | CreateToken-AUTH     | Creates a new auth token to use for access to the PUT and DELETE /booking                                                                    |
| `GET`    | GetBookingIds        | Returns the ids of all the bookings that exist within the API. Can take optional query strings to search and return a subset of booking ids. |
| `GET`    | GetBooking           | Returns a specific booking based upon the booking id provided                                                                                |
| `POST`   | CreateBooking        | Creates a new booking in the API                                                                                                             |
| `PUT`    | UpdateBooking        | Updates a current booking                                                                                                                    |
| `PATCH`  | PartialUpdateBooking | Updates a current booking with a partial payload                                                                                             |
| `DELETE` | DeleteBooking        | Returns the ids of all the bookings that exist within the API. Can take optional query strings to search and return a subset of booking ids. |




### Maven
> Maven is project/build management tool.

Instead of downloading and placing the jars manually in the project, we can use maven to automate the process. We can define the dependency in the **pom.xml (Project object model)**. Maven requires internet to download the jars, which is a one time process.

### Dependencies

* [TestNG](https://mvnrepository.com/artifact/org.testng/testng) -  is a testing framework inspired from JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use
* [Rest-assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured) - is used to verify the REST APIs with the help of the Java library.

### Author

name  : Ruwani Madumali

e-mail : ruwanimadumalids@gmail.com

[Github] (https://github.com/RuwaniMadumali)


### Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

### License
This project is licensed under the MIT License - see the [LICENSE.txt](.LICENSE) file for details.