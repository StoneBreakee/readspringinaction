package soundsystem;

import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
@ImportResource("classpath:didemo.xml")
public class TrackCounterConfig {
    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
