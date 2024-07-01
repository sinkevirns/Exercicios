CREATE TABLE Alunos(
	idAluno SERIAL PRIMARY KEY,
	nomeAluno VARCHAR(100),
	nascimento DATE
)

INSERT INTO Alunos (nomeAluno, nascimento) VALUES
('Maria da Silva', '2003-05-15'),
('João Oliveira', '2002-10-20'),
('Ana Santos', '2004-03-10'),
('Pedro Costa', '2003-07-25'),
('Beatriz Rodrigues', '2002-12-08'),
('Guilherme Ferreira', '2003-01-30'),
('Mariana Pereira', '2004-09-12'),
('Lucas Almeida', '2003-06-18'),
('Luana Carvalho', '2002-11-05'),
('Gabriel Souza', '2004-02-28')

SELECT * FROM Alunos

CREATE TABLE Alunos_Turmas(
	idAluno SERIAL,
	CONSTRAINT fkAlunos FOREIGN KEY(idAluno) REFERENCES Alunos(idAluno),
	idTurma SERIAL,
	CONSTRAINT fkTurma FOREIGN KEY(idTurma) REFERENCES Turmas(idTurma)
)

SELECT * FROM Alunos_Turmas

CREATE TABLE Turmas(
	idTurma SERIAL PRIMARY KEY,
	idCurso SERIAL, 
	FOREIGN KEY (idCurso) REFERENCES Cursos(idCursos),
	idProfessores SERIAL
)

SELECT * FROM Turmas

CREATE TABLE Cursos(
	idCursos SERIAL PRIMARY KEY,
	nomeCurso VARCHAR(100)
)

INSERT INTO Cursos (nomeCurso) VALUES
('Fotografia para Iniciantes'),
('Introdução ao Excel'),
('Inglês Básico'),
('Redes Sociais para Negócios'),
('Noções de Contabilidade'),
('Yoga para Iniciantes'),
('Introdução ao Desenvolvimento Web'),
('Culinária Prática'),
('Edição de Vídeo para Amadores'),
('Mindfulness para o Dia a Dia')

SELECT * FROM Cursos

--a. Listar todos os alunos matriculados em uma turma específica.
SELECT nomeAluno, idTurma FROM Alunos INNER JOIN Turmas
ON Alunos.idAluno = Turmas.idTurma
--b. Encontrar todos os cursos ministrados em uma turma específica.
SELECT nomeCurso, idTurma FROM Cursos INNER JOIN Turmas
ON Cursos.idCursos = Turmas.idTurma
--c. Contar o número de alunos em cada turma.
SELECT idTurma, COUNT(idAluno) AS numero_de_alunos
FROM Alunos_Turmas
GROUP BY idTurma