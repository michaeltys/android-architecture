package co.techmagic.data.dataprovider;

import co.techmagic.data.dataprovider.model.User;

public interface IUserDataProvider {

    User createUser(User user);

    User readUser(long id);

    void updateUser(User user);

    void deleteUser(User user);
}
