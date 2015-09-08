package co.techmagic.data.api;

import co.techmagic.data.api.model.Request;

public abstract class RestApi implements IRestApi {

    @Override
    public <T> void get(String url, ApiClientCallback<T> callback) {
        //TODO implement regarding some library requirements and needs
    }

    @Override
    public <T> void post(String url, Request request, ApiClientCallback<T> callback) {
        //TODO implement regarding some library requirements and needs
    }

    @Override
    public <T> void put(String url, Request request, ApiClientCallback<T> callback) {
        //TODO implement regarding some library requirements and needs
    }

    @Override
    public <T> void delete(String url, ApiClientCallback<T> callback) {
        //TODO implement regarding some library requirements and needs
    }

}
