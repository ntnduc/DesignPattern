package tdtu.Contact.contact;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.msgpack.jackson.dataformat.MessagePackFactory;
import org.springframework.context.annotation.Configuration;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Configuration
public class AppConfig {
    @Provider
    @Produces("application/x-msgpack")
    @Consumes("application/x-msgpack")
    public static class JacksonMessagePackProvider extends JacksonJsonProvider {
        public JacksonMessagePackProvider() {
            super(new ObjectMapper(new MessagePackFactory()));
        }

        @Override
        protected boolean hasMatchingMediaType(MediaType mediaType) {
            if (mediaType != null) {
                String subtype = mediaType.getSubtype();
                return "x-msgpack".equals(subtype);
            }
            return false;
        }
    }

    @Named
    static class JerseyConfig extends ResourceConfig {
        public JerseyConfig() {
            this.packages("tdtu.Contact.contact");
        }
    }
}