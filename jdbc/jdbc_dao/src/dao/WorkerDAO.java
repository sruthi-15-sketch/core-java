package dao;

import java.sql.SQLException;
import java.util.List;
import model.Worker;

// CRUD method headers
public interface WorkerDAO {
    public int add(Worker worker)
            throws SQLException;

    public void delete(int workerId)
            throws SQLException;

    public Worker getWorker(int workerId)
            throws SQLException;

    public List<Worker> getWorkers()
            throws SQLException;

    public void update(Worker worker)
            throws SQLException;
}