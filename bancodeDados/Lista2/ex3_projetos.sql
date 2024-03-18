CREATE TABLE Funcionarios (
	id_func SERIAL PRIMARY KEY,
	nome_func VARCHAR(100),
	data_admissao DATE 
)
SELECT * FROM Funcionarios

CREATE TABLE Projetos(
	id_projeto SERIAL PRIMARY KEY,
	nome_projeto VARCHAR(250),
	descricao TEXT
)
SELECT * FROM Projetos 

CREATE TABLE Funcionarios_Projetos(
	id_func INT,
	CONSTRAINT fk_func FOREIGN KEY(id_func) REFERENCES Funcionarios(id_func),
	id_projeto INT,
	CONSTRAINT fk_proj FOREIGN KEY(id_projeto) REFERENCES Projetos(id_projeto)
)
SELECT * FROM Funcionarios_Projetos