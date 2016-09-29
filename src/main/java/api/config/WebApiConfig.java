package api.config;


import api.controllers.HomeController;
import api.controllers.UserController;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * Basic JAX-RS application.
 *
 * @author Ivo Woltring
 */
@ApplicationPath("/api")
public class WebApiConfig extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        final Set<Class<?>> resources = new java.util.HashSet<>();

        // following code can be used to customize Jersey 2.0 JSON provider:
        try
        {
            final Class jsonProvider = Class.forName("org.glassfish.jersey.jackson.JacksonFeature");
            resources.add(jsonProvider);
        }
        catch (final ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        addRestResourceClasses(resources);

        return resources;
    }

    /**
     * Add your own resources here.
     */
    private void addRestResourceClasses(final Set<Class<?>> resources)
    {
        resources.add(HomeController.class);
        resources.add(UserController.class);
    }

}
