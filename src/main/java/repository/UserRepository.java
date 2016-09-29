package repository;

import models.User;

import java.sql.*;

/**
 * simple user repository class
 * Created by ericreis on 9/27/16.
 */
public class UserRepository extends BaseRepository
{
    private String query;
    private ResultSet rs;

    public UserRepository()
    {
        super();
    }

    public User getUserById(int id)
    {
        this.query = "SELECT * FROM user WHERE id = " + id;

        User user = null;

        try
        {
            this.rs = this.stmt.executeQuery(query);

            while (this.rs.next())
            {
                user = new User();

                user.setId(this.rs.getInt("id"));
                user.setUsername(this.rs.getString("username"));
                user.setPassword(this.rs.getString("password"));
                user.setEmail(this.rs.getString("email"));
                user.setCreationDate(this.rs.getDate("creation_date"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return user;
    }
}
