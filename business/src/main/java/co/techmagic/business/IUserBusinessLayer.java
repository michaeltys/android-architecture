package co.techmagic.business;

import co.techmagic.data.dataprovider.model.User;

public interface IUserBusinessLayer {
    /**
     * Creates a new user
     *
     * @param user
     */
    void createUser(User user);
}
