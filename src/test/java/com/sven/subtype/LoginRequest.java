package com.sven.subtype;

public class LoginRequest implements Request
{
    private String userName;
    private String password;
    
    public LoginRequest(final String userName, final String password) {
        
        this.userName = userName;
        this.password = password;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(final String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(final String password)
    {
        this.password = password;
    }

    @Override
    public Response process()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
