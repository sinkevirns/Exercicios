CREATE TABLE Livros (
	isbn SERIAL PRIMARY KEY,
	titulo VARCHAR(100), 
	editora VARCHAR(100),
	data_publicacao DATE 
)

INSERT INTO Livros (titulo, editora, data_publicacao) VALUES
('O Senhor dos Anéis', 'HarperCollins', '1954-07-29'),
('Harry Potter e a Pedra Filosofal', 'Bloomsbury Publishing', '1997-06-26'),
('Cem Anos de Solidão', 'Vintage', '1967-05-30'),
('Dom Quixote', 'Simon & Schuster', '1605-01-16'),
('O Pequeno Príncipe', 'HarperCollins', '1943-04-06'),
('Moby Dick', 'Houghton Mifflin Harcourt', '1851-10-18'),
('Orgulho e Preconceito', 'Ballantine Books', '1813-01-28'),
('Crime e Castigo', 'Houghton Mifflin Harcourt', '1866-01-01'),
('As Crônicas de Nárnia', 'Houghton Mifflin Harcourt', '1950-10-16'),
('A Divina Comédia', 'Scribner', '1320-01-01')

SELECT * FROM Livros

CREATE TABLE Autores(
	id_autor SERIAL PRIMARY KEY,
	nome_autor VARCHAR(100)
)

INSERT INTO Autores (nome_autor) VALUES
('J.R.R. Tolkien'),
('J.K. Rowling'),
('Gabriel García Márquez'),
('Miguel de Cervantes'),
('Antoine de Saint-Exupéry'),
('Herman Melville'),
('Jane Austen'),
('Fiódor Dostoiévski'),
('C.S. Lewis'),
('Dante Alighieri')

SELECT * FROM Autores 

CREATE TABLE Livros_Autores(
	isbn SERIAL,
	CONSTRAINT fk_isbn FOREIGN KEY(isbn) REFERENCES Livros(isbn),
	id_autor SERIAL,
	CONSTRAINT fk_autor FOREIGN KEY(id_autor) REFERENCES Autores(id_autor)
)
SELECT * FROM Livros_Autores

-- a. Listar todos os livros e seus autores.
SELECT nome_autor, titulo FROM Autores INNER JOIN Livros 
ON Autores.id_autor = Livros.isbn

--b. Encontrar todos os livros escritos por um autor específico.
SELECT nome_autor, titulo FROM Autores INNER JOIN Livros 
ON Autores.id_autor = Livros.isbn
WHERE nome_autor ='C.S. Lewis'

--c. Encontrar todos os autores que escreveram um livro específico.
SELECT titulo, nome_autor FROM Livros INNER JOIN Autores 
ON  Livros.isbn = Autores.id_autor
WHERE titulo ='As Crônicas de Nárnia'