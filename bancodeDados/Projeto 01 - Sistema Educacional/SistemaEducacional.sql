-- DDL
-- Tabela alunos
CREATE TABLE alunos (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100),
    nascimento DATE,
    rua VARCHAR(100),
    numero VARCHAR(10),
    bairro VARCHAR(50),
    cidade VARCHAR(50),
    estado VARCHAR(2),
    cep VARCHAR(9),
    pais VARCHAR(50)
); 

-- Tabela telefones
CREATE TABLE telefones (
    cpf VARCHAR(14) REFERENCES alunos,
    ddd VARCHAR(3),
    telefone VARCHAR(9)
);

-- Tabela emails
CREATE TABLE emails (
    cpf VARCHAR(14) REFERENCES alunos,
    email VARCHAR(100),
    dominio VARCHAR(50)
);

-- Tabela departamentos
CREATE TABLE departamentos (
    iddpto SERIAL PRIMARY KEY,
    sigla VARCHAR(10),
    nome VARCHAR(100)
);

-- Tabela cursos
CREATE TABLE cursos (
    idcursos SERIAL PRIMARY KEY,
    iddpto SERIAL REFERENCES departamentos,
    nome VARCHAR(100)
);

-- Tabela matriculas
CREATE TABLE matriculas (
    ra SERIAL PRIMARY KEY,
    cpf VARCHAR(14) REFERENCES alunos,
    status BOOLEAN,
    idcurso SERIAL REFERENCES cursos
);

-- Tabela relacional matriculadisciplina
CREATE TABLE matriculadisciplina (
    ra SERIAL REFERENCES matriculas,
    iddisciplina SERIAL REFERENCES disciplina
);

-- Tabela disciplina
CREATE TABLE disciplina (
    iddisciplina SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    optativa BOOLEAN
);

-- Tabela relacional cursodisciplina
CREATE TABLE cursodisciplina (
    idcurso SERIAL REFERENCES cursos,
    iddisciplina SERIAL REFERENCES disciplina
);

-- DML
-- Populando tabela alunos
INSERT INTO alunos (cpf, nome, nascimento, rua, numero, bairro, cidade, estado, cep, pais) VALUES 
('123.456.789-10', 'João da Silva', '1990-05-15', 'Rua A', '123', 'Centro', 'São Paulo', 'SP', '12345-678', 'Brasil'),
('987.654.321-10', 'Maria Oliveira', '1992-10-20', 'Rua B', '456', 'Vila Madalena', 'Rio de Janeiro', 'RJ', '54321-987', 'Brasil');

-- Populando tabela telefones
INSERT INTO telefones (cpf, ddd, telefone) 
VALUES 
('123.456.789-10', '11', '999999999'),
('123.456.789-10', '11', '888888888'),
('987.654.321-10', '21', '777777777');

-- Populando tabela email
INSERT INTO emails (cpf, email, dominio) 
VALUES 
('123.456.789-10', 'joao@example.com', 'example.com'),
('987.654.321-10', 'maria@example.com', 'example.com');

-- Populando tabela departamentos
INSERT INTO departamentos (sigla, nome) VALUES 
('DPTO1', 'Departamento de Engenharia'),
('DPTO2', 'Departamento de Ciências da Computação');

-- Populando tabela cursos
INSERT INTO cursos (iddpto, nome) VALUES 
(1, 'Engenharia Civil'),
(1, 'Engenharia Elétrica'),
(2, 'Ciência da Computação'),
(2, 'Sistemas de Informação');

-- Populando tabela matriculas
INSERT INTO matriculas (cpf, status, idcurso) VALUES 
('123.456.789-10', true, 1),
('987.654.321-10', true, 3);

-- Populando tabela disciplina
INSERT INTO disciplina (nome, optativa) VALUES 
('Matemática', false),
('Física', false),
('Programação I', false),
('Programação II', false);

-- Populando tabela relacional matriculadisciplina
INSERT INTO matriculadisciplina (ra, iddisciplina) 
VALUES 
(1, 3),
(2, 4);

-- Populando tabela relacional cursodisciplina
INSERT INTO cursodisciplina (idcurso, iddisciplina) 
VALUES 
(1, 1),
(1, 2),
(3, 3),
(3, 4); 

-- DQL
-- Dado o RA ou o Nome do Aluno, buscar no BD todos os demais dados do aluno.
SELECT alunos.* FROM alunos
INNER JOIN matriculas ON alunos.cpf = matriculas.cpf
WHERE matriculas.ra = '1' OR alunos.nome = 'João da Silva';

-- Dado o nome de um departamento, exibir o nome de todos os cursos associados a ele.
SELECT cursos.nome FROM cursos 
INNER JOIN departamentos ON cursos.iddpto = departamentos.iddpto 
WHERE departamentos.nome = 'Departamento de Engenharia';

-- Dado o nome de uma disciplina, exibir a qual ou quais cursos ela pertence.
SELECT cursos.nome FROM cursos 
INNER JOIN cursodisciplina ON cursos.idcursos = cursodisciplina.idcurso 
INNER JOIN disciplina ON cursodisciplina.iddisciplina = disciplina.iddisciplina 
WHERE disciplina.nome = 'Matemática';

--Dado o CPF de um aluno, exibir quais disciplinas ele está cursando.
SELECT disciplina.nome FROM disciplina 
INNER JOIN matriculadisciplina ON disciplina.iddisciplina = matriculadisciplina.iddisciplina 
INNER JOIN matriculas ON matriculadisciplina.ra = matriculas.ra 
WHERE matriculas.cpf = '123.456.789-10';

--Filtrar todos os alunos matriculados em um determinado curso.
SELECT alunos.* FROM alunos 
INNER JOIN matriculas ON alunos.cpf = matriculas.cpf 
WHERE matriculas.idcurso = '1';

--Filtrar todos os alunos matriculados em determinada disciplina.
SELECT alunos.* FROM alunos 
INNER JOIN matriculas ON alunos.cpf = matriculas.cpf 
INNER JOIN matriculadisciplina ON matriculas.ra = matriculadisciplina.ra 
INNER JOIN disciplina ON matriculadisciplina.iddisciplina = disciplina.iddisciplina 
WHERE disciplina.nome = 'Programação I';

--Filtrar alunos formados.
SELECT * FROM matriculas WHERE status = 'false';

--Filtrar alunos ativos.
SELECT * FROM matriculas WHERE status = 'true';

--Apresentar a quantidade de alunos ativos por curso.
SELECT cursos.nome, COUNT(*) AS quantidade_alunos_ativos FROM cursos 
INNER JOIN matriculas ON cursos.idcursos = matriculas.idcurso 
INNER JOIN alunos ON matriculas.cpf = alunos.cpf 
WHERE matriculas.status = 'true' 
GROUP BY cursos.nome;

--Apresentar a quantidade de alunos ativos por disciplina.
SELECT disciplina.nome, COUNT(*) AS quantidade_alunos_ativos 
FROM disciplina 
INNER JOIN matriculadisciplina ON disciplina.iddisciplina = matriculadisciplina.iddisciplina 
INNER JOIN matriculas ON matriculadisciplina.ra = matriculas.ra 
WHERE matriculas.status = 'true' 
GROUP BY disciplina.nome;