CREATE SEQUENCE users_id_seq;
create table users (
    id bigint not null DEFAULT NEXTVAL('users_id_seq'),
    username varchar(255),
    email varchar(255) not NULL,
    primary key (id)
);