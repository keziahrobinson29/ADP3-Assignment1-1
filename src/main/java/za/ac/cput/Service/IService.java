package za.ac.cput.Service;

import java.util.List;
import java.util.Optional;

/**
 * Joshua Julies
 * 220102473
 * The generic service interface
 */

public interface IService <T, ID>{
    public T save(T entity);
    public Optional<T> read(T entity);
    public T update(T entity);
    public void delete(T entity);
}