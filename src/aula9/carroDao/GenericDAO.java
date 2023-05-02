package aula9.carroDao;

import java.util.List;

public interface GenericDAO<T> {
    int insert(T obj);
    int update(T obj);
    int delete(T obj);
    List<T> listAll();
    T findByID(int id);
}
