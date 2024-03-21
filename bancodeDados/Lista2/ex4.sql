CREATE TABLE Pacientes(
	idPaciente SERIAL PRIMARY KEY,
	nomePaciente VARCHAR(100),
	nascimento DATE
)

INSERT INTO Pacientes (nomePaciente, nascimento) VALUES
('Carlos Silva', '2003-05-15'),
('Mariana Oliveira', '2002-10-20'),
('Rafaela Santos', '2004-03-10'),
('Fernando Costa', '2003-07-25'),
('Patrícia Rodrigues', '2002-12-08'),
('Juliana Ferreira', '2003-01-30'),
('Diego Pereira', '2004-09-12'),
('Camila Almeida', '2003-06-18'),
('Bruno Carvalho', '2002-11-05'),
('Aline Souza', '2004-02-28')

SELECT * FROM Pacientes

CREATE TABLE Medicos(
	crm SERIAL PRIMARY KEY,
	nomeMedico VARCHAR(100),
	especializacao VARCHAR(100)
)

INSERT INTO Medicos (nomeMedico,especializacao) VALUES
('Dr. Carlos Silva', 'Cardiologia'),
('Dra. Mariana Oliveira', 'Ortopedia'),
('Dr. Rafaela Santos', 'Pediatria'),
('Dr. Fernando Costa', 'Dermatologia'),
('Dra. Patrícia Rodrigues', 'Ginecologia'),
('Dr. Juliano Ferreira', 'Oftalmologia'),
('Dra. Camila Almeida', 'Neurologia'),
('Dr. Bruno Carvalho', 'Psiquiatria'),
('Dra. Aline Souza', 'Urologia'),
('Dr. Gustavo Pereira', 'Oncologia')

SELECT * FROM Medicos

CREATE TABLE Registros(
	idRegistro SERIAL PRIMARY KEY,
	idPaciente INT REFERENCES Pacientes(idPaciente),
	crm SERIAL REFERENCES Medicos (crm),
	dataRegistro DATE
)

SELECT * FROM Registros

--a. Listar todos os pacientes de um médico específico.
SELECT nomePaciente, nomeMedico FROM Pacientes INNER JOIN Medicos 
ON Pacientes.idPaciente = Medicos.crm
WHERE nomeMedico = 'Dr. Carlos Silva'
--b. Encontrar todos os médicos de um paciente específico.
SELECT nomeMedico, nomePaciente FROM Medicos INNER JOIN Pacientes
ON Medicos.crm = Pacientes.idPaciente
WHERE nomeMedico = 'Dra. Aline Souza'
--c. Contar o número médio de pacientes por médico.
SELECT AVG(idPaciente) AS idPaciente
FROM Pacientes