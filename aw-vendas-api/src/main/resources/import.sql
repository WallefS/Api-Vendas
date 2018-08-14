insert into cliente (id, nome) values (1, 'Eletronicos Eletro');
insert into cliente (id, nome) values (2, 'Smart Compras');

insert into produto (id, nome, valor) values (1, 'HD', 250.0);
insert into produto (id, nome, valor) values (2, 'Impressora', 280.0);
insert into produto (id, nome, valor) values (3, 'Computador', 550.0);

insert into venda (id, cliente_id, frete, total, cadastro) values (1, 1, 14.0, 3450.0, sysdate());

insert into item (id, venda_id, produto_id, quantidade) values (1, 1, 1, 1);