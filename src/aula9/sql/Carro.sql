CREATE TABLE Carro (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ano INT,
    modelo VARCHAR(50),
    montadora VARCHAR(50),
    placa_id INT,
    FOREIGN KEY (placa_id) REFERENCES Placa(id)
);
