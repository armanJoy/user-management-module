package com.arcgen.usermgt.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
public class HttpFilter implements Filter {

    private Environment environment;

    HttpFilter(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void doFilter(ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        String appMode = this.environment.getActiveProfiles()[0];
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String origin = req.getHeader(HttpHeaders.ORIGIN);

        if (origin != null && AppConstant.ALLOW_ORIGINS.contains(origin) && appMode.equals(AppConstant.PRODUCTION_ENVIRONMENT)) {
            res.addHeader("Access-Control-Allow-Origin", origin);
            res.addHeader("Access-Control-Allow-Headers", "*");
            res.addHeader("Access-Control-Allow-Credentials", "true");
        } else {
            res.addHeader("Access-Control-Allow-Origin", origin);
            res.addHeader("Access-Control-Allow-Headers", "*");
            res.addHeader("Access-Control-Allow-Credentials", "true");
        }

        chain.doFilter(req, res);
    }

}
