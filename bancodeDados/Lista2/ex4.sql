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
	crm VARCHAR(20) PRIMARY KEY,
	nomeMedico VARCHAR(100),
	especializacao VARCHAR(100)
)

INSERT INTO Medicos (crm,nomeMedico,especializacao) VALUES
('1234567', 'Dr. Carlos Silva', 'Cardiologia'),
('2345678', 'Dra. Mariana Oliveira', 'Ortopedia'),
('3456789', 'Dr. Rafaela Santos', 'Pediatria'),
('4567890', 'Dr. Fernando Costa', 'Dermatologia'),
('5678901', 'Dra. Patrícia Rodrigues', 'Ginecologia'),
('6789012', 'Dr. Juliano Ferreira', 'Oftalmologia'),
('7890123', 'Dra. Camila Almeida', 'Neurologia'),
('8901234', 'Dr. Bruno Carvalho', 'Psiquiatria'),
('9012345', 'Dra. Aline Souza', 'Urologia'),
('0123456', 'Dr. Gustavo Pereira', 'Oncologia')

SELECT * FROM Medicos

CREATE TABLE Registros(
	idRegistro SERIAL PRIMARY KEY,
	idPaciente INT REFERENCES Pacientes(idPaciente),
	crm VARCHAR REFERENCES Medicos (crm),
	dataRegistro DATE
)

SELECT * FROM Registros