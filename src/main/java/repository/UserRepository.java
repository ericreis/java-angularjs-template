package repository;


import models.User;

import java.sql.*;
import java.util.HashMap;

/**
 * simple user repository class
 * Created by ericreis on 9/27/16.
 */
public class UserRepository extends BaseRepository
{
    private String query;
    private ResultSet rs;
    private HashMap<String, Object> params;

    public UserRepository()
    {
        super();
    }

    public User getUserById(int id)
    {
//        this.query = "SELECT * FROM user WHERE id = " + id;

        this.query = "SELECT * FROM user WHERE id = :id";

        this.params = new HashMap<>();
        this.params.put("id", id);

        this.createNamedParameterStatement(this.query, this.params);

        User user = null;

        try
        {

//            this.rs = this.stmt.executeQuery(query);

            this.rs = this.namedStmt.executeQuery();

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

    @Override
    protected void finalize() throws Throwable
    {
        this.rs.close();

        super.finalize();
    }
}
