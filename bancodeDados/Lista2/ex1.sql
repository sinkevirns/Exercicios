CREATE TABLE Livros (
	isbn VARCHAR(13) PRIMARY KEY,
	titulo VARCHAR(100), 
	editora VARCHAR(100),
	data_publicacao DATE 
)

INSERT INTO Livros (isbn, titulo, editora, data_publicacao) VALUES
('9780451169532', 'O Senhor dos Anéis', 'HarperCollins', '1954-07-29'),
('9780061120084', 'Harry Potter e a Pedra Filosofal', 'Bloomsbury Publishing', '1997-06-26'),
('9780385416348', 'Cem Anos de Solidão', 'Vintage', '1967-05-30'),
('9780671027365', 'Dom Quixote', 'Simon & Schuster', '1605-01-16'),
('9780060528079', 'O Pequeno Príncipe', 'HarperCollins', '1943-04-06'),
('9780316769486', 'Moby Dick', 'Houghton Mifflin Harcourt', '1851-10-18'),
('9780345342966', 'Orgulho e Preconceito', 'Ballantine Books', '1813-01-28'),
('9780316769487', 'Crime e Castigo', 'Houghton Mifflin Harcourt', '1866-01-01'),
('9780316769488', 'As Crônicas de Nárnia', 'Houghton Mifflin Harcourt', '1950-10-16'),
('9780743247542', 'A Divina Comédia', 'Scribner', '1320-01-01')

SELECT * FROM Livros

CREATE TABLE Autores(
	id_autor SERIAL PRIMARY KEY,
	nome_autor VARCHAR(100),
)

INSERT INTO Autores (nome_projeto, descricao) VALUES
('Projeto Renovação', 'Reestruturação de processos para aumentar a eficiência operacional após desafios recentes.'),
('TechBoost', 'Pesquisa e desenvolvimento de novas tecnologias para impulsionar a inovação da empresa.'),
('Expansão Regional', 'Iniciativa para abrir novos mercados e diversificar a base de clientes.'),
('Agilidade Corporativa', 'Implementação de metodologias ágeis para melhorar a colaboração e a entrega de projetos.'),
('Sustentabilidade Verde', 'Projeto focado em reduzir a pegada de carbono e promover práticas eco-friendly.'),
('Modernização de TI', 'Atualização da infraestrutura de TI para fortalecer a segurança e a capacidade de processamento.'),
('Desenvolvimento de Talentos', 'Programa para capacitar e engajar os funcionários, promovendo um ambiente de trabalho de alto desempenho.'),
('Análise de Mercado', 'Identificação de tendências emergentes e oportunidades de negócios.'),
('Melhoria da Comunicação Interna', 'Aperfeiçoamento dos processos de comunicação para uma cultura organizacional mais harmoniosa.'),
('Experiência do Cliente', 'Aprimoramento do atendimento ao cliente para fortalecer os relacionamentos e a fidelidade.')

SELECT * FROM Autores 

CREATE TABLE Livros_Autores(
	id_func INT,
	CONSTRAINT fk_func FOREIGN KEY(id_func) REFERENCES Funcionarios(id_func),
	id_projeto INT,
	CONSTRAINT fk_proj FOREIGN KEY(id_projeto) REFERENCES Projetos(id_projeto)
)
SELECT * FROM Funcionarios_Projetos