
--Bruno Lora RM-89321
--Matheus Meneguim RM88123
--Pedro Leite RM86940


--DROP TABLE t_sm_admin CASCADE CONSTRAINTS;

--DROP TABLE t_sm_usuario CASCADE CONSTRAINTS;


CREATE TABLE t_sm_admin (
    cd_codigo   NUMBER PRIMARY KEY NOT NULL,
    nm_cliente  VARCHAR2(50) 	NOT NULL,
    ds_email    VARCHAR2(50) 	NOT NULL,
    ds_senha    VARCHAR2(20) 	NOT NULL
);

CREATE sequence sq_tb_admin start with 1 increment by 1;

ALTER TABLE t_sm_admin ADD constraint ck_sm_admin_codigo CHECK ( cd_codigo >0);

ALTER TABLE t_sm_admin ADD CONSTRAINT t_sm_admin_pk PRIMARY KEY ( cd_codigo );

ALTER TABLE t_sm_admin ADD CONSTRAINT un_sm_admin_email UNIQUE ( ds_email );

CREATE TABLE t_sm_usuario (
    cd_codigo           NUMBER PRIMARY KEY NOT NULL,
    nm_cliente          VARCHAR2(50) 	NOT NULL,
    ds_senha            VARCHAR2(20)	NOT NULL,
    cd_ansiedade	    NUMBER(1)	 	NOT NULL,
    ds_email            VARCHAR2(50) 	NOT NULL
);

CREATE sequence sq_tb_usuario start with 1 increment by 1;
ALTER TABLE t_sm_usuario ADD constraint ck_sm_usuario_codigo CHECK ( cd_codigo >0);

ALTER TABLE t_sm_usuario ADD CONSTRAINT t_sm_usuario_pk PRIMARY KEY ( cd_codigo );

ALTER TABLE t_sm_usuario ADD CONSTRAINT un_sm_usuario_email UNIQUE ( ds_email );



select * from t_sm_usuario
select * from t_sm_admin

