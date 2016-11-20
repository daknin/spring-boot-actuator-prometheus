package com.github.daknin;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSpringBootMetricsCollector
@EnablePrometheusEndpoint
public class SpringBootActuatorPrometheusApplication {

	public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringBootActuatorPrometheusApplication.class, args);
    }
}
