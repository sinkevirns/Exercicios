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
	isbn VARCHAR,
	CONSTRAINT fk_isbn FOREIGN KEY(isbn) REFERENCES Livros(isbn),
	id_autor INT,
	CONSTRAINT fk_autor FOREIGN KEY(id_autor) REFERENCES Autores(id_autor)
)
SELECT * FROM Livros_Autores