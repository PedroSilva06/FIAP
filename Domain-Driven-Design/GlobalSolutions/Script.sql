CREATE TABLE t_blm_produto (
    cd_produto   INT GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
    nm_produto   VARCHAR(255) NOT NULL,
    qt_estoque   NUMBER(5) NOT NULL,
    dt_validade  VARCHAR(255) NOT NULL,
    ds_in_natura CHAR CHECK (ds_in_natura in (0,1)) NOT NULL,
    st_produto   CHAR CHECK (st_produto in (0,1)) NOT NULL
);

--drop table t_blm_produto;

select * from t_blm_produto;

create sequence sq_t_blm_produto start with 1 increment by 1;
