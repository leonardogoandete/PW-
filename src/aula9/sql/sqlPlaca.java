package aula9.sql;

public enum sqlPlaca {
    INSERT("INSERT INTO Placa(letras, numeros) VALUES (?, ?)"),
    LISTALL("SELECT * FROM Placa"),
    DELETE("DELETE FROM Placa WHERE letras= ?"),
    UPDATE("UPDATE Placa SET numeros= ? WHERE letras= ?"),
    FINDBYID("SELECT * FROM Placa WHERE id = ?");

    private final String query;

    private sqlPlaca(String query) {
        this.query = query;
    }

    public String getQuery(){
        return query;
    }
}
