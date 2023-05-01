package aula9.sql;

public enum SQLs {
    INSERT("INSERT INTO carro(ano, modelo, montadora, placa) VALUES (?, ?, ?, ?)"),
    LISTALL("SELECT * FROM carro"),
    DELETE("DELETE FROM carro WHERE placa=XYZ-1997"),
    UPDATE("UPDATE carro SET modelo = Teste WHERE placa= XYZ-1997"),
    FINDBYID("SELECT * FROM carro WHERE id = ");

    private final String query;

    SQLs(String query) {
        this.query = query;
    }

    public String getQuery(){
        return query;
    }
}
