package aula9.carroDao;

import aula9.model.CarroPojo.Placa;

import java.util.List;

public class PlacaDAO implements GenericDAO<Placa>{
    @Override
    public boolean insert(Placa obj) {
        return false;
    }

    @Override
    public int update(Placa obj) {
        return 0;
    }

    @Override
    public int delete(Placa obj) {
        return 0;
    }

    @Override
    public List<Placa> listAll() {
        return null;
    }

    @Override
    public Placa findByID(int id) {
        return null;
    }
}
