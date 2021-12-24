CREATE TABLE IF NOT EXISTS test.users
(
    id           bigserial NOT NULL,
    login        character varying NOT NULL,
    password     character varying,
    full_name    character varying,
    phone_number character varying,
    email        character varying
);

CREATE TABLE IF NOT EXISTS test.addresses
(
    id                bigserial NOT NULL,
    street_name       character varying NOT NULL,
    building_number   integer,
    structure         integer,
    zip_code          integer,
    entrance_number   integer,
    flour             integer,
    suite             integer,
    user_id           int8
);

INSERT INTO test.users (login, email)
VALUES ('Lexa', 'Lexa@gmail.com'),
       ('nux', 'bezmylablyat'),
       ('sabaka tonya', 'tonya@mail,ru');

INSERT INTO test.addresses (street_name, user_id)
VALUES ('SergeyDmitriev str', 1),
       ('MaksimFoliforof str', null ),
       ('javanegovno str', 3),
       ('ElizabethMenshikova str', 1);
