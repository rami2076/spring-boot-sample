package com.example.samplespringboot.config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;


@EnableConfigurationProperties(value = NewCoronavirusConfigurationProperties.class)
class TestNewCoronavirusConfigurationProperties {
}