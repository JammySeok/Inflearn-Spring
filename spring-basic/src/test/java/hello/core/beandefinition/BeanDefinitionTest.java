package hello.core.beandefinition;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 설정 메타정보 확인")
    void findApplicationBean() {
            String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beamDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beamDefinitionName);

            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION)
                System.out.println("beamDefinitionName = " + beamDefinitionName + ", beanDefinition = " + beanDefinition);
        }
    }
}
