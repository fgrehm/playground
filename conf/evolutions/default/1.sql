# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table page_view (
  id                        bigint not null,
  date                      timestamp,
  constraint pk_page_view primary key (id))
;

create sequence page_view_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists page_view;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists page_view_seq;

