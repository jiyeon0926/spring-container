package container.init;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class PrototypeTest {

    @Test
    void prototypeBeanFind() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);

        System.out.println("[prototypeBean1]");
        PrototypeBean prototypeBean1 = ac.getBean(PrototypeBean.class);

        System.out.println("[prototypeBean2]");
        PrototypeBean prototypeBean2 = ac.getBean(PrototypeBean.class);

        System.out.println("[prototypeBean3]");
        PrototypeBean prototypeBean3 = ac.getBean(PrototypeBean.class);

        System.out.println("prototypeBean1 = " + prototypeBean1);
        System.out.println("prototypeBean2 = " + prototypeBean2);
        System.out.println("prototypeBean3 = " + prototypeBean3);

        Assertions.assertThat(prototypeBean1).isNotSameAs(prototypeBean2);
        Assertions.assertThat(prototypeBean1).isNotSameAs(prototypeBean3);
        Assertions.assertThat(prototypeBean2).isNotSameAs(prototypeBean3);

        ac.close();
    }

    @Scope("prototype")
    static class PrototypeBean {

        @PostConstruct
        public void init() {
            System.out.println("PrototypeBean.init");
        }

        @PreDestroy
        public void destroy() {
            System.out.println("PrototypeBean.destroy");
        }
    }
}
