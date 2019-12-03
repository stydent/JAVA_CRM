CREATE DATABASE crm
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;
	
CREATE TABLE public.clients
(
    id integer NOT NULL,
    fio text,
    address text,
    manager_id integer,
    status integer
);

ALTER TABLE public.clients
    OWNER to postgres;
	
CREATE TABLE public.managers
(
    id integer NOT NULL,
    fio text,
    phone text,
    assistant_id integer,
    status integer
);

ALTER TABLE public.managers
    OWNER to postgres;