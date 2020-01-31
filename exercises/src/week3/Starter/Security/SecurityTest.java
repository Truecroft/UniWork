package week3.Starter.Security;

import org.junit.Assert;
import org.junit.Test;

public class SecurityTest {

    @Test
    public void testLogonEmptyUserId() {
        String userId = "";
        String password = "Fred34";
        Security _cut = new Security();
        SecurityStatus securityStatus = _cut.logon(userId, password);
        boolean expected = false;
        boolean actual = securityStatus.isSuccess();
        Assert.assertEquals(securityStatus.getErrMessage(), expected, actual);
    }

    @Test
    public void testLogonNullUserId() {
        String userId = null;
        String password = "Fred34";
        Security _cut = new Security();
        SecurityStatus securityStatus = _cut.logon(userId, password);
        boolean expected = false;
        boolean actual = securityStatus.isSuccess();
        Assert.assertEquals(securityStatus.getErrMessage(), expected, actual);
    }

    @Test
    public void testLogonEmptyPassword() {
        String userId = "Fred";
        String password = "";
        Security _cut = new Security();
        SecurityStatus securityStatus = _cut.logon(userId, password);
        boolean expected = false;
        boolean actual = securityStatus.isSuccess();
        Assert.assertEquals(securityStatus.getErrMessage(), expected, actual);
    }

    @Test
    public void testLogonNullPassword() {
        String userId = "Fred";
        String password = null;
        Security _cut = new Security();
        SecurityStatus securityStatus = _cut.logon(userId, password);
        boolean expected = false;
        boolean actual = securityStatus.isSuccess();
        Assert.assertEquals(securityStatus.getErrMessage(), expected, actual);
    }

    @Test
    public void testLogonUserIdAllSpaces() {
        String userId = "    ";
        String password = "Fred34";
        Security _cut = new Security();
        SecurityStatus securityStatus = _cut.logon(userId, password);
        boolean expected = false;
        boolean actual = securityStatus.isSuccess();
        Assert.assertEquals(securityStatus.getErrMessage(), expected, actual);
    }

    @Test
    public void testLogonPasswordAllSpaces() {
        String userId = "Fred";
        String password = "    ";
        Security _cut = new Security();
        SecurityStatus securityStatus = _cut.logon(userId, password);
        boolean expected = false;
        boolean actual = securityStatus.isSuccess();
        Assert.assertEquals(securityStatus.getErrMessage(), expected, actual);
    }

    @Test
    public void testLogonGoodCombination() {
        String userId = "Fred";
        String password = "Fredric34";
        Security _cut = new Security();
        SecurityStatus securityStatus = _cut.logon(userId, password);
        boolean expected = true;
        boolean actual = securityStatus.isSuccess();
        Assert.assertEquals(securityStatus.getErrMessage(), expected, actual);
    }

    @Test
    public void testLogonPasswordTooShort() {
        String userId = "Fred";
        String password = "Fred34";
        Security _cut = new Security();
        SecurityStatus securityStatus = _cut.logon(userId, password);
        boolean expected = false;
        boolean actual = securityStatus.isSuccess();
        Assert.assertEquals(securityStatus.getErrMessage(), expected, actual);
    }

    @Test
    public void testLogonPasswordNoUpper() {
        String userId = "Fred";
        String password = "freddie34";
        Security _cut = new Security();
        SecurityStatus securityStatus = _cut.logon(userId, password);
        boolean expected = false;
        boolean actual = securityStatus.isSuccess();
        Assert.assertEquals(securityStatus.getErrMessage(), expected, actual);
    }

    @Test
    public void testLogonPasswordNoDigit() {
        String userId = "Fred";
        String password = "Frederic";
        Security _cut = new Security();
        SecurityStatus securityStatus = _cut.logon(userId, password);
        boolean expected = false;
        boolean actual = securityStatus.isSuccess();
        Assert.assertEquals(securityStatus.getErrMessage(), expected, actual);
    }
}