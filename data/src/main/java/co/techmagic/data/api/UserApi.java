package co.techmagic.data.api;

import co.techmagic.data.api.model.CreateUserRequest;

public class UserApi extends RestApi implements IUserApi {

    @Override
    public <T> void createUser(CreateUserRequest request, ApiClientCallback<T> callback) {
        post("URL", request, callback);
    }

}
