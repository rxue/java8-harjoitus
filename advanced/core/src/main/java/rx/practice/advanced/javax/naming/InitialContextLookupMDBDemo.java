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
            Properties p = new Properties();
            p.setProperty(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8083");
            p.setProperty(Context.INITIAL_CONTEXT_FACTORY, WildFlyInitialContextFactory.class.getName());
            p.setProperty(Context.SECURITY_PRINCIPAL, "test");
            p.setProperty(Context.SECURITY_CREDENTIALS, "test");
            InitialContext context = new InitialContext(p);
            ConnectionFactory queueConnFactory = (ConnectionFactory) context.lookup("jms/RemoteConnectionFactory");
            try(Connection conn = queueConnFactory.createConnection("test", "test");
                Session session = conn.createSession(false, QueueSession.AUTO_ACKNOWLEDGE)) {
                    Destination destination = (Destination) context.lookup("jms/queue/TestQueue");
                    MessageProducer producer = session.createProducer(destination);
                    producer.send(session.createTextMessage());
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
