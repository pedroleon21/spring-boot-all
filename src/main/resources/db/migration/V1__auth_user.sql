CREATE SCHEMA IF NOT EXISTS auth;

CREATE TABLE IF NOT EXISTS auth.user (
    id SERIAL PRIMARY KEY,
    username VARCHAR(60)  NULL,
    password VARCHAR(255) NOT NULL
);