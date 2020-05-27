package rx.practice.advanced.corejavax.net.ssl;
import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class RestAPICallWithBasicAuthentication {
    public static void main(String[] args) {
        System.out.println("DEBUG*:: keystore is " + System.getProperty("javax.net.ssl.keyStore"));
        String urlStr = args[0];
        String userName = args[1];
        String password = args[2];
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509ExtendedTrustManager()
                {
                    @Override
                    public java.security.cert.X509Certificate[] getAcceptedIssuers()
                    {
                        return null;
                    }

                    @Override
                    public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType)
                    {
                    }

                    @Override
                    public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType)
                    {
                    }

                    @Override
                    public void checkClientTrusted(java.security.cert.X509Certificate[] xcs, String string, Socket socket) throws CertificateException
                    {

                    }

                    @Override
                    public void checkServerTrusted(java.security.cert.X509Certificate[] xcs, String string, Socket socket) throws CertificateException
                    {

                    }

                    @Override
                    public void checkClientTrusted(java.security.cert.X509Certificate[] xcs, String string, SSLEngine ssle) throws CertificateException
                    {

                    }

                    @Override
                    public void checkServerTrusted(java.security.cert.X509Certificate[] xcs, String string, SSLEngine ssle) throws CertificateException
                    {

                    }

                }
        };
        try {
            Authenticator.setDefault(new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication (userName, password.toCharArray());
                }
            });
/*            SSLContext sc = SSLContext.getInstance ("SSL");
            sc.init (null, trustAllCerts, new java.security.SecureRandom ());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());*/
            URL url = new URL(urlStr);
            HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();
            urlConnection.setRequestProperty("Content-Type", "application/json");
            InputStream is = urlConnection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            System.out.println("in is " + in);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } /*catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }*/

    }
}
