package fr.lidadi.jee.eventmanager.framework.router.config;

import fr.lidadi.jee.eventmanager.framework.router.ConfigurationException;
import fr.lidadi.jee.eventmanager.framework.router.data.AllowedUrlType;
import fr.lidadi.jee.eventmanager.framework.router.data.Route;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static fr.lidadi.jee.eventmanager.framework.router.data.HttpMethod.*;

/**
 * Created by damien on 08/10/2016.
 */
public class HttpConfig extends EmptyHttpConfig {

    private final Route lastRoute;

    HttpConfig(Map<Route, String> config, Route key, String value) {
        this.config = config;
        this.lastRoute = key;
        config.put(key, value);
    }


    public HttpConfigBindTo get(String url){
        return new HttpConfigBindTo(config, new Route(GET, url));
    }

    public HttpConfigBindTo post(String url){
        return new HttpConfigBindTo(config, new Route(POST, url));
    }

    public HttpConfigBindTo put(String url){
        return new HttpConfigBindTo(config, new Route(PUT, url));
    }

    public HttpConfigBindTo delete(String url){
        return new HttpConfigBindTo(config, new Route(DELETE, url));
    }

    public HttpConfig withUrlParam(String name, AllowedUrlType type){
        lastRoute.setUrlParams(name, type);
        return this;
    }

    public Map<Route, String> getConfig() {
        return config;
    }

    @Override
    public String toString() {
        return "Routes : " + config;
    }
}
