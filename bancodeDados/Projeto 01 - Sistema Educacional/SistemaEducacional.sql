-- DDL
-- Criando a tabela Alunos
CREATE TABLE Alunos (
	cpf VARCHAR(14) PRIMARY KEY,
    ra SERIAL,
    nome VARCHAR(100),
    idade INT,
    ativo BOOLEAN,
    idContato SERIAL,
    idEndereco SERIAL,
    FOREIGN KEY (idContato) REFERENCES Contato(idContato),
    FOREIGN KEY (idEndereco) REFERENCES Endereco(idEndereco)
);

-- DML
-- Populando a tabela Alunos
INSERT INTO Alunos (cpf, nome, idade, ativo) VALUES
('123.456.789-00', 'João Silva', 20, TRUE),
('987.654.321-00', 'Maria Souza', 22, TRUE),
('111.222.333-44', 'Carlos Oliveira', 21, TRUE),
('555.666.777-88', 'Ana Santos', 25, TRUE),
('999.888.777-66', 'Pedro Costa', 23, TRUE);

-- DDL
-- Criando a tabela Contato
CREATE TABLE Contato (
    idContato SERIAL PRIMARY KEY,
	celular VARCHAR (20),
	email VARCHAR(100),
    telefone VARCHAR(20)
);

-- DML
-- Populando a tabela Contato
INSERT INTO Contato (celular, email, telefone) VALUES
('(11) 91234-5678', 'joao.silva@email.com', '(11) 1234-5678'),
('(22) 99876-5432', 'maria.souza@email.com', '(22) 9876-5432'),
('(33) 98765-4321', 'carlos.oliveira@email.com', '(33) 8765-4321'),
('(44) 97654-3210', 'ana.santos@email.com', '(44) 7654-3210'),
('(55) 96543-2109', 'pedro.costa@email.com', '(55) 6543-2109');

-- DDL
-- Criando a tabela ContatoEndereco
CREATE TABLE ContatoEndereco (
    idContato SERIAL,
    idEndereco SERIAL,
    FOREIGN KEY (idContato) REFERENCES Contato(idContato),
    FOREIGN KEY (idEndereco) REFERENCES Endereco(idEndereco)
);

-- DDL
-- Criando a tabela Endereco
CREATE TABLE Endereco (
    idEndereco SERIAL PRIMARY KEY,
    rua VARCHAR(100),
	numero INT,
    cidade VARCHAR(100),
    estado VARCHAR(100),
    cep VARCHAR(10)
);

-- DML
-- Populando a tabela Endereco
INSERT INTO Endereco (rua, numero, cidade, estado, cep) VALUES
('Rua A', 123, 'São Paulo', 'SP', '01234-567'),
('Avenida B', 456, 'Rio de Janeiro', 'RJ', '45678-901'),
('Rua C', 789, 'Belo Horizonte', 'MG', '89012-345'),
('Avenida D', 101, 'Porto Alegre', 'RS', '21098-765'),
('Rua E', 1122, 'Brasília', 'DF', '54321-098');

-- DDL
-- Criando a tabela AlunoDisciplina
CREATE TABLE AlunoDisciplina (
    cpf VARCHAR(14),
    idDisciplina SERIAL,
    FOREIGN KEY (cpf) REFERENCES Alunos(cpf),
    FOREIGN KEY (idDisciplina) REFERENCES Disciplina(idDisciplina)
);

-- DML
-- Populando a tabela AlunoDisciplina
INSERT INTO AlunoDisciplina (cpf) VALUES
('123.456.789-00'),
('987.654.321-00'),
('111.222.333-44'),
('555.666.777-88'),
('999.888.777-66');

-- DDL
-- Criando a tabela Disciplina
CREATE TABLE Disciplina (
    idDisciplina SERIAL PRIMARY KEY,
    nomeDisciplina VARCHAR(100),
    cargaHoraria INT,
    opcional BOOLEAN
);

-- DML
-- Populando a tabela Disciplina
INSERT INTO Disciplina (nomeDisciplina, cargaHoraria, opcional) VALUES
('Introdução à Programação', 80, FALSE),
('Cálculo I', 90, FALSE),
('Eletrônica Básica', 100, FALSE),
('Literatura Brasileira', 60, TRUE),
('Estatística', 80, FALSE);

-- DDL
-- Criando a tabela DisciplinaCurso
CREATE TABLE DisciplinaCurso (
    idDisciplina SERIAL,
    nomeCurso VARCHAR(100),
    FOREIGN KEY (idDisciplina) REFERENCES Disciplina(idDisciplina),
    FOREIGN KEY (nomeCurso) REFERENCES Curso(nomeCurso)
);

-- DML
-- Populando a tabela DisciplinaCurso
INSERT INTO DisciplinaCurso (nomeCurso) VALUES
('Ciência da Computação'),
('Matemática Aplicada'),
('Engenharia Elétrica'),
('Letras Português'),
('Administração de Empresas');

-- DDL
-- Criando a tabela Curso
CREATE TABLE Curso (
    nomeCurso VARCHAR(100) PRIMARY KEY,
    cargaHoraria INT,
    departamento VARCHAR(100),
    FOREIGN KEY (departamento) REFERENCES Departamentos(departamento)
);

-- DML
-- Populando a tabela Curso
INSERT INTO Curso (nomeCurso, cargaHoraria, departamento) VALUES
('Ciência da Computação', 4000, 'Departamento de Ciências da Computação'),
('Matemática Aplicada', 3600, 'Departamento de Matemática'),
('Engenharia Elétrica', 4200, 'Departamento de Engenharia Elétrica'),
('Letras Português', 3000, 'Departamento de Letras'),
('Administração de Empresas', 3500, 'Departamento de Administração');

-- DDL
-- Criando a tabela Departamentos
CREATE TABLE Departamentos (
    departamento VARCHAR(100) PRIMARY KEY,
	coordenador VARCHAR(100),
	certificacao VARCHAR (5)
);

-- DML
-- Populando a tabela Departamentos
INSERT INTO Departamentos (departamento, coordenador, certificacao) VALUES
('Departamento de Ciências da Computação', 'João Silva', 'ABNT'),
('Departamento de Matemática', 'Maria Souza', 'CFC'),
('Departamento de Engenharia Elétrica', 'Carlos Oliveira', 'CREA'),
('Departamento de Letras', 'Ana Santos', 'CRP'),
('Departamento de Administração', 'Pedro Costa', 'CGA');

-- Dado o RA ou o Nome do Aluno, buscar no BD todos os demais dados do aluno.
SELECT Alunos.*, Contato.*, Endereco.* FROM Alunos
JOIN Contato ON Alunos.idContato = Contato.idContato
JOIN Endereco ON Alunos.idEndereco = Endereco.idEndereco
WHERE Alunos.ra = '1' OR Alunos.nome = 'João Silva';

-- Dado o nome de um departamento, exibir o nome de todos os cursos associados a ele.
SELECT nomeCurso FROM Curso
WHERE departamento = 'Departamento de Ciências da Computação';

-- Dado o nome de uma disciplina, exibir a qual ou quais cursos ela pertence.
SELECT nomeCurso FROM DisciplinaCurso
WHERE idDisciplina = (
    SELECT idDisciplina FROM Disciplina
    WHERE nomeDisciplina = 'Introdução à Programação'
);

-- Dado o CPF de um aluno, exibir quais disciplinas ele está cursando.
SELECT nomeDisciplina FROM Disciplina
JOIN AlunoDisciplina ON Disciplina.idDisciplina = AlunoDisciplina.idDisciplina
WHERE cpf = '123.456.789-00';

-- Filtrar todos os alunos matriculados em um determinado curso.
SELECT * FROM Alunos
WHERE ra IN (
    SELECT ra FROM Curso
    JOIN DisciplinaCurso ON Curso.nomeCurso = DisciplinaCurso.nomeCurso
    JOIN AlunoDisciplina ON DisciplinaCurso.idDisciplina = AlunoDisciplina.idDisciplina
    WHERE Curso.nomeCurso = 'Ciência da Computação'
);

-- Filtrar todos os alunos matriculados em determinada disciplina.
SELECT * FROM Alunos
WHERE ra IN (
    SELECT ra
    FROM AlunoDisciplina
    JOIN Disciplina ON AlunoDisciplina.idDisciplina = Disciplina.idDisciplina
    WHERE nomeDisciplina = 'Introdução à Programação'
);

-- Filtrar alunos formados.
SELECT * FROM Alunos
WHERE ativo = FALSE;

-- Filtrar alunos ativos.
SELECT * FROM Alunos
WHERE ativo = TRUE;

-- Apresentar a quantidade de alunos ativos por curso.
SELECT Curso.nomeCurso, COUNT(*) AS quantidade_alunos_ativos FROM Alunos
JOIN Curso ON Alunos.ra IN (
    SELECT ra FROM Curso
    JOIN DisciplinaCurso ON Curso.nomeCurso = DisciplinaCurso.nomeCurso
    JOIN AlunoDisciplina ON DisciplinaCurso.idDisciplina = AlunoDisciplina.idDisciplina
)
WHERE ativo = TRUE
GROUP BY Curso.nomeCurso;

-- Apresentar a quantidade de alunos ativos por disciplina.
SELECT Disciplina.nomeDisciplina, COUNT(*) AS quantidade_alunos_ativos FROM Alunos
JOIN AlunoDisciplina ON Alunos.cpf = AlunoDisciplina.cpf
JOIN Disciplina ON AlunoDisciplina.idDisciplina = Disciplina.idDisciplina
WHERE ativo = TRUE
GROUP BY Disciplina.nomeDisciplina;