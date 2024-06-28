CREATE TABLE Departamentos (
	idDepartamento SERIAL PRIMARY KEY,
	nomeDepartamento VARCHAR (150)
)

INSERT INTO Departamentos (nomeDepartamento) VALUES
('Departamento de Recursos Humanos'),
('Departamento Financeiro'),
('Departamento de Marketing'),
('Departamento de Vendas'),
('Departamento de TI (Tecnologia da Informação)'),
('Departamento de Operações'),
('Departamento Jurídico'),
('Departamento de Pesquisa e Desenvolvimento'),
('Departamento de Logística'),
('Departamento de Atendimento ao Cliente')

SELECT * FROM Departamentos

CREATE TABLE Funcionarios (
	idFuncionario SERIAL PRIMARY KEY,
	idDepartamento SERIAL,
	FOREIGN KEY (idDepartamento) REFERENCES Departamentos (idDepartamento),
	nomeFuncionario VARCHAR (100),
	dataAdmissao DATE,
	cargo VARCHAR (100)
)

INSERT INTO Funcionarios (nomeFuncionario, dataAdmissao, cargo) VALUES 
('João Silva', '2023-01-15', 'Analista'),
('Maria Santos', '2022-08-20', 'Desenvolvedor'),
('Pedro Oliveira', '2023-03-10', 'Gerente'),
('Ana Costa', '2023-02-05', 'Analista'),
('Carlos Pereira', '2022-11-30', 'Engenheiro'),
('Mariana Oliveira', '2022-07-25', 'Analista'),
('Paulo Rodrigues', '2023-04-02', 'Designer'),
('Lucia Ferreira', '2022-09-10', 'Analista'),
('Rafaela Souza', '2023-05-20', 'Analista'),
('Fernando Gomes', '2022-12-15', 'Analista')

SELECT * FROM Funcionarios 

--a. Listar todos os funcionários de um departamento específico.
SELECT nomeFuncionario, nomeDepartamento FROM Funcionarios INNER JOIN Departamentos
ON Funcionarios.idFuncionario = Departamentos.idDepartamento
WHERE nomeDepartamento = 'Departamento de Recursos Humanos'
--b. Encontrar o departamento em que um funcionário específico trabalha.
SELECT nomeFuncionario, nomeDepartamento FROM Funcionarios INNER JOIN Departamentos
ON Funcionarios.idFuncionario = Departamentos.idDepartamento
WHERE nomeFuncionario = 'Carlos Pereira'
--c. Calcular o número total de funcionários gerenciados por cada gerente.
SELECT f.nomeFuncionario AS gerente, d.nomeDepartamento, COUNT(*) AS numero_de_funcionarios
FROM Funcionarios f
JOIN Departamentos d ON f.idDepartamento = d.idDepartamento
WHERE f.cargo = 'Gerente'
GROUP BY f.nomeFuncionario, d.nomeDepartamento