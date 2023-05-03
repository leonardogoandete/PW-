package aula9.sql;

public enum sqlCarro {
    INSERT("INSERT INTO Carro(ano, modelo, montadora, placa_id) VALUES (?, ?, ?, ?)"),
    LISTALL("SELECT * FROM Carro c INNER JOIN Placa p ON c.placa_id = p.id"),
    DELETE("DELETE FROM Carro WHERE modelo= ?"),
    UPDATE("UPDATE Carro SET montadora= ? WHERE modelo= ?"),
    FINDBYID("SELECT * FROM Carro c INNER JOIN Placa p ON c.placa_id = p.id WHERE c.id= ?");

    private final String query;

    private sqlCarro(String query) {
        this.query = query;
    }

    public String getQuery(){
        return query;
    }
}
