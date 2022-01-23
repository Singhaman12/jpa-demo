package io.pragra.learning.pragravisit;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Profile("dev")
@Configuration
public class DevConfig {

    @Bean
    public DataSource dataSource() {
        return
                DataSourceBuilder
                        .create()
                        .url("jdbc:h2:mem:appdb")
                        .username("sa")
                        .password("")
                        .build();
    }
}