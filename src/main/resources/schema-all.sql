DROP TABLE person IF EXISTS;

CREATE TABLE person(
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    second_name VARCHAR(20),
    cpf VARCHAR(20)
);