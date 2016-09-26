package api.models;

/**
 * Simple model class
 * Created by ericreis on 9/25/16.
 */
public class Home
{
    private String exampleParam;

    public Home(String exampleParam)
    {
        this.exampleParam = exampleParam;
    }

    public String getExampleParam()
    {
        return this.exampleParam;
    }
}
