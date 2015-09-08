package co.techmagic.data.api;

import co.techmagic.data.api.model.CreateUserRequest;

public interface IUserApi {
    <T> void createUser(CreateUserRequest request, ApiClientCallback<T> callback);
}
