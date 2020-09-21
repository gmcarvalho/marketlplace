package com.hotmart.marketplace.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class TokenConfiguration {
    @Value("${agora.io.appId}")
    public String appId;

    @Value("${agora.io.certificate}")
    public String certificate;

    @Value("${agora.io.expirationTimeInSeconds}")
    public int expirationTimeInSeconds;
}
