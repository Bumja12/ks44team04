package ksmart.ocltest.config;

import static org.assertj.core.api.Assertions.assertThat;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JasyptConfigTest {

	@Test
	void jasypt() {
		
		//given
		String url = "jdbc:log4jdbc:mysql://131.186.24.213:3306/ksmart44db?serverTimezone=UTC&characterEncoding=UTF8";
        String userName = "ksmart44id";
        String password = "ksmart44pw";
        
        StringEncryptor encryptor = stringEncryptor();
        
        //when
        String enUrl = encryptor.encrypt(url);
        String enUserName = encryptor.encrypt(userName);
        String enPassword = encryptor.encrypt(password);
        
        //then
        assertThat(url).isEqualTo(encryptor.decrypt(enUrl));
        assertThat(userName).isEqualTo(encryptor.decrypt(enUserName));
        assertThat(password).isEqualTo(encryptor.decrypt(enPassword));        
        
        System.out.println(enUrl);
        System.out.println(enUserName);
        System.out.println(enPassword);
       
	}
	
	public static StringEncryptor stringEncryptor() {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword("ksmart00"); //암호화에 사용할 키 -> 중요
        config.setAlgorithm("PBEWithMD5AndDES"); //사용할 알고리즘
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        return encryptor;
	}
	
}
