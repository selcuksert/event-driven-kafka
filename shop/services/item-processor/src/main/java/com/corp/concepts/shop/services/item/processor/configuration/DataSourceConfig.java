package com.corp.concepts.shop.services.item.processor.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ConditionalOnProperty(name = "custom.item.datasource.use", havingValue = "db", matchIfMissing = false)
public class DataSourceConfig {

	@Bean
	public DataSource getDataSource(@Value("${custom.item.datasource.url}") String url,
			@Value("${custom.item.datasource.username}") String username,
			@Value("${custom.item.datasource.password}") String password,
			@Value("${custom.item.datasource.connection-timeout}") long connectionTimeoutMs,
			@Value("${custom.item.datasource.maximum-pool-size}") int maxPoolSize) {

		DataSourceBuilder<HikariDataSource> builder = DataSourceBuilder.create().type(HikariDataSource.class);

		builder.url(url);
		builder.username(username);
		builder.password(password);

		HikariDataSource hikariDataSource = builder.build();
		hikariDataSource.setConnectionTimeout(connectionTimeoutMs);
		hikariDataSource.setMaximumPoolSize(maxPoolSize);

		return hikariDataSource;
	}
}
