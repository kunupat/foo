package com.abg.foo;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.jaegertracing.Configuration;
import io.jaegertracing.internal.JaegerTracer;

@SpringBootApplication
public class FooApplication {

	public static void main(String[] args) {
		//Properties props = System.getProperties();
		//props.put("https.proxyHost", "170.225.13.50");
		//props.put("https.proxyPort", "8080");
		SpringApplication.run(FooApplication.class, args);
	}
	
	/*@Bean
    public static JaegerTracer getTracer() {
        
        Configuration.Propagation propogateConfig =  Configuration.Propagation.B3;
        Configuration.CodecConfiguration codecConfig =  Configuration
        		.CodecConfiguration
        		.fromEnv()
        		.withPropagation(propogateConfig) ;
        Configuration config = Configuration.fromEnv();	
        config.withCodec(codecConfig);
        return config.getTracer();
	}*/
	
	/*@Bean
    public static JaegerTracer getTracer() {
        Configuration.SamplerConfiguration samplerConfig = Configuration
        		.SamplerConfiguration
        		.fromEnv()
        		.withType("const")
        		.withParam(1);
        Configuration.ReporterConfiguration reporterConfig = Configuration
        		.ReporterConfiguration
        		.fromEnv()
        		.withLogSpans(true);
        
        Configuration.Propagation propogateConfig =  Configuration.Propagation.B3;
        Configuration.CodecConfiguration codecConfig =  Configuration
        		.CodecConfiguration
        		.fromEnv()
        		.withPropagation(propogateConfig);
        
        Configuration config = new Configuration("Foo Service")
        		.withSampler(samplerConfig)
        		.withReporter(reporterConfig)
        		.withCodec(codecConfig);
        
        return config.getTracer();
    }*/
}
