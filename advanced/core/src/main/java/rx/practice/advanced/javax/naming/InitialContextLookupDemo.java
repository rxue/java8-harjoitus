package rx.practice.advanced.javax.naming;

import org.wildfly.naming.client.WildFlyInitialContextFactory;
import rx.practice.ejb.RemoteEJB;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class InitialContextLookupDemo {
    public static void main(String[] args) {
        try {
            Properties p = new Properties();
            p.setProperty(Context.PROVIDER_URL, "http-remoting://127.22.0.2:8081");
            p.setProperty(Context.INITIAL_CONTEXT_FACTORY, WildFlyInitialContextFactory.class.getName());
            p.setProperty(Context.SECURITY_PRINCIPAL, "jmsuser");
            p.setProperty(Context.SECURITY_CREDENTIALS, "jmspassword");
            InitialContext context = new InitialContext(p);
            RemoteEJB helloWorld = (RemoteEJB) context.lookup("java:/ejb-executor/RemoteEJBImpl!rx.practice.ejb.RemoteEJB");
            helloWorld.test();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
