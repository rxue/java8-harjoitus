package rx.practice.advanced.javax.naming;

import org.wildfly.naming.client.WildFlyInitialContextFactory;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class InitialContextLookupMDBDemo {
    public static void main(String[] args) throws JMSException {
        try {
            String principal = "test";
            String password = "test";
            Properties p = new Properties();
            p.setProperty(Context.PROVIDER_URL, "http-remoting://172.20.0.2:8081");
            p.setProperty(Context.INITIAL_CONTEXT_FACTORY, WildFlyInitialContextFactory.class.getName());
            p.setProperty(Context.SECURITY_PRINCIPAL, principal);
            p.setProperty(Context.SECURITY_CREDENTIALS, password);
            InitialContext context = new InitialContext(p);
            ConnectionFactory queueConnFactory = (ConnectionFactory) context.lookup("jms/RemoteConnectionFactory");
            Queue jmsQueue = (Queue) context.lookup("jms/PublicQueue");
            try(JMSContext jmsContext = queueConnFactory.createContext()) {
                Message message = jmsContext.createTextMessage("This is the message sent to the jms queue");
                jmsContext.createProducer().send(jmsQueue, message);
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
