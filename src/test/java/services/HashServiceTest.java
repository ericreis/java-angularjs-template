package services;


import org.junit.Test;
import services.util.HashService;

/**
 * HashService test class
 * Created by ericreis on 9/29/16.
 */
public class HashServiceTest
{
    @Test
    public void hashGenerationAndMatchTest()
    {
        HashService hashService = new HashService();

        String password = "P@SsW0Rd";
        String hash = hashService.generateSecureHash(password);

        assert hashService.checkSecureHashMatch(password, hash);
    }
}
