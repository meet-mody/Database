package meet.io.database.dao;

import meet.io.database.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AutoDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public boolean saveCar(Car car) {
        jdbcTemplate.update("insert into Car VALUES (?, ?, ?)",
                car.getCar_id(), car.getCar_make(), car.getCar_model());
        return true;
    }
}
