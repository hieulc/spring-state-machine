package hieulc.spring.ssm.config;

import hieulc.spring.ssm.domain.PaymentEvent;
import hieulc.spring.ssm.domain.PaymentState;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;


@SpringBootTest
class StateMachineConfigTest {

    @Autowired
    StateMachineFactory<PaymentState, PaymentEvent> factory;

    @Test
    void testStateMachine() {

        StateMachine<PaymentState, PaymentEvent> sm = factory.getStateMachine();

        sm.startReactively().subscribe();

        System.out.println(sm.getState().toString());

        sm.sendEvent(PaymentEvent.PRE_AUTH_APPROVED);

        System.out.println(sm.getState().toString());


    }

}