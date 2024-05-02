
# Punto de Venta | Backend

Project made for improving my skills on Spring Boot 

## Acknowledgements

 - Spring Security 3. 
    - API endpoints restricted to unauthorized agents.
    - Login and Register flux for authorization.
    - JWT Bearer token to access API.
    - Password encription with BCrypt.

## API Reference

#### Hello World!

```
  GET /api/hello
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |


```
Response Example:

    Hello World!

```

#### Signup

```
  POST /auth/signup
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `email`   | `string` | **Required**. Your email   |
| `password`| `string` | **Required**. Your password|
| `fullName`| `string` | **Required**. Your full name|

#### Creates a new account

Takes user info and create a new account

```
Response Example:

    {
        "id": 2,
        "fullName": "Example name",
        "email": "email@email.com",
        "password": {Your encrypted password},
        "createdAt": "2024-05-02T20:34:06.078+00:00",
        "updatedAt": "2024-05-02T20:34:06.078+00:00",
        "enabled": true,
        "authorities": [],
        "username": {Your email},
        "accountNonLocked": true,
        "accountNonExpired": true,
        "credentialsNonExpired": true
    }

```

#### Login

```
  POST /auth/login
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `email`   | `string` | **Required**. Your email   |
| `password`| `string` | **Required**. Your password|

Login and retrieve token on success

```

Response Example:

    {
      "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjb3JyZW8yQGNvcnJlby5jb20iLCJpYXQiOjE3MTQ2ODMzNTksImV4cCI6MTcxNDY4Njk1OX0.X4UwoLSp1Fl-Ok4k8po-Mkp8uJFDTzFrmUBO0355oXM",
      "expiresIn": 3600000
    }

```


## Documentation

- [Springboot Security](https://docs.spring.io/spring-security/reference/servlet/getting-started.html)

- [Spring JPA](https://docs.spring.io/spring-data/jpa/reference/jpa.html)

- [Connecting postgres render database](https://docs.render.com/databases)

- [MVC Architecture](https://developer.mozilla.org/es/docs/Glossary/MVC)

- [Rest Architecture](https://www.service-architecture.com/articles/web-services/representational-state-transfer-rest.html)

## Authors

- [@Daniel Leon](https://github.com/danielleon21)


