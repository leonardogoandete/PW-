package aula9.sql;

public enum sqlPlaca {
    INSERT("INSERT INTO placa(letras, numeros) VALUES (?, ?)"),
    LISTALL("SELECT * FROM placa"),
    DELETE("DELETE FROM placa WHERE placa=XYZ-1997"),
    UPDATE("UPDATE placa SET numeros = 1234 WHERE numeros= 1997"),
    FINDBYID("SELECT * FROM placa WHERE id =");

    private final String query;

    private sqlPlaca(String query) {
        this.query = query;
    }

    public String getQuery(){
        return query;
    }
}
