package com.secutityApp.securityFilter;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("rsa")
public record RsaKeyProperties(RSAPublicKey pubKey, RSAPrivateKey privatekey) {

}
