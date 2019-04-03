package victor.proxy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableAspectJAutoProxy 
@EnableCaching 
@SpringBootApplication
public class PerfProxySpringApp {
}
