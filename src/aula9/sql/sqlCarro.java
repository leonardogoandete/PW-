package aula9.sql;

public enum sqlCarro {
    INSERT("INSERT INTO carro(ano, modelo, montadora, idPlaca) VALUES (?, ?, ?, ?)"),
    LISTALL("SELECT * FROM carro c INNER JOIN placa p ON c.idPlaca = p.id"),
    DELETE("DELETE FROM carro WHERE placa=XYZ-1997"),
    UPDATE("UPDATE carro SET modelo = Teste WHERE placa= XYZ-1997"),
    FINDBYID("SELECT * FROM carro c INNER JOIN placa p ON c.idPlaca = p.id WHERE c.id=");

    private final String query;

    private sqlCarro(String query) {
        this.query = query;
    }

    public String getQuery(){
        return query;
    }
}
