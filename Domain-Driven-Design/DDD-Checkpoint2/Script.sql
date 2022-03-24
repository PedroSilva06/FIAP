CREATE TABLE tb_produto (
    cd_produto NUMBER PRIMARY KEY,
    nm_produto VARCHAR(80) NOT NULL,
    pr_produto FLOAT(7),
    qt_produto INTEGER
);

--drop table tb_produto;

select * from tb_produto;

create sequence sq_tb_produto start with 1 increment by 1;
