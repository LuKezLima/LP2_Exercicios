insert into disciplina (codigo, nome) values ('LP2A4', 'Linguagem de Programação 2');

insert into aluno (matricula, nome, endereco, data_ingresso, data_conclusao) values ('Aluno1', 'Vlademir Alcides', 'Avenida Paulista, 1200', '2022-11-10', '2022-12-20');
insert into aluno (matricula, nome, endereco, data_ingresso, data_conclusao) values ('Aluno2', 'Maria de Lima', 'Faria Lima, 122', '2014-12-05', '2025-10-10');

insert into aluno_has_disciplina(matricula, codigo, nota) values ( 'Aluno1', 'LP2A4', 5);
insert into  aluno_has_disciplina(matricula, codigo, nota) values ( 'Aluno2', 'LP2A4', 3);