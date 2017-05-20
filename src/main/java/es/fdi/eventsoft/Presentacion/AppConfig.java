package es.fdi.eventsoft.Presentacion;

import es.fdi.eventsoft.Presentacion.Interceptors.AuthenticationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthenticationInterceptor())
                                .addPathPatterns("/*/*")
                                .excludePathPatterns("/usuarios/register",
                                                    "/usuarios/tipoUsuario",
                                                    "/usuarios/registrar_cliente",
                                                    "/usuarios/registrar_organizador",
                                                    "/usuarios/registrar_proveedor");
    }
}
