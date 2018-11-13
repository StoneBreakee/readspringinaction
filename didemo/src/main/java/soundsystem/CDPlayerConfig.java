package soundsystem;

import conditionalbean.MagicBean;
import conditionalbean.MagicExistsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean
    @Conditional({MagicExistsCondition.class})
    public MagicBean magicBean(){
        return new MagicBean();
    }
}
