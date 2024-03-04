drop table if exists "authors";

create table if not exists authors (
	id bigint default nextval('author_seq') not null,
	name text,
	age int,
	constraint "author_pkey" primary key ("id")
)