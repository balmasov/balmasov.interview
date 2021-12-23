CREATE TABLE IF NOT EXISTS test.users
(
    id           bigint NOT NULL,
    login        character varying,
    password     character varying,
    full_name    character varying,
    phone_number character varying,
    email        character varying
);
