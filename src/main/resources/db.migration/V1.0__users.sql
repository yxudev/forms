CREATE SEQUENCE users_id_seq;
create table users (
id bigint not null DEFAULT NEXTVAL('users_id_seq'),
email VARCHAR(255) not NULL,
username VARCHAR(255) not NULL,
primary key (id)
);
ALTER SEQUENCE users_id_seq OWNED BY users.id;
