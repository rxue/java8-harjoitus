package rx.practice.advanced.javax.naming;

import org.wildfly.naming.client.WildFlyInitialContextFactory;
import rx.practice.ejb.StatelessHelloWorld;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class InitialContextLookupDemo {
    public static void main(String[] args) {
        try {
            Properties p = new Properties();
            p.setProperty(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8083");
            p.setProperty(Context.INITIAL_CONTEXT_FACTORY, WildFlyInitialContextFactory.class.getName());
            p.setProperty(Context.SECURITY_PRINCIPAL, "test");
            p.setProperty(Context.SECURITY_CREDENTIALS, "test");
            //p.put("jboss.naming.client.ejb.context", true);
            InitialContext context = new InitialContext(p);
            StatelessHelloWorld helloWorld = (StatelessHelloWorld) context.lookup("ejb:/ejbs/StatelessHelloWorldBean!rx.practice.ejb.StatelessHelloWorld");
            String result = helloWorld.getHelloWorld("WORD");
            System.out.println(result);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
