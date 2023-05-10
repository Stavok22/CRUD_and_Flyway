package services;

import org.flywaydb.core.Flyway;


public class DatabaseInitService {
    public void initDb() {
        String connectionUrl= "jdbc:h2:./test";
        Flyway flyway = Flyway
                .configure()
                .dataSource(connectionUrl,null,null)
                .load();

        flyway.migrate();
    }
}
