package com.sven.subtype;

public class PingRequest implements Request
{
    private String host;
    private Integer attempts;
    
    public PingRequest(final String host, final Integer attempts) {
        
        this.host = host;
        this.attempts = attempts;
    }
    public String getHost()
    {
        return host;
    }
    public void setHost(final String host)
    {
        this.host = host;
    }
    public Integer getAttempts()
    {
        return attempts;
    }
    public void setAttempts(final Integer attempts)
    {
        this.attempts = attempts;
    }
    @Override
    public Response process()
    {
        // TODO Auto-generated method stub
        return null;
    }

    // Constructors, getters/setters, overrides
}
