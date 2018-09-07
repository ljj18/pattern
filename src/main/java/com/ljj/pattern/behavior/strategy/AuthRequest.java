/**
 * 文件名称:          		AuthRequest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.strategy;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-09-07 14:07
 * 
 */
public class AuthRequest {

    private String uri;
    /**
     * 客户端Id
     */
    private String clientId;
    /**
     * 终端Token;
     */
    private String terminalToken;
    /**
     * 用户Token
     */
    private String userToken;
    /**
     * @return Returns the clientId.
     */
    public String getClientId() {
        return clientId;
    }
    /**
     * @param clientId The clientId to set.
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    /**
     * @return Returns the terminalToken.
     */
    public String getTerminalToken() {
        return terminalToken;
    }
    /**
     * @param terminalToken The terminalToken to set.
     */
    public void setTerminalToken(String terminalToken) {
        this.terminalToken = terminalToken;
    }
    /**
     * @return Returns the userToken.
     */
    public String getUserToken() {
        return userToken;
    }
    /**
     * @param userToken The userToken to set.
     */
    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
    /**
     * @return Returns the uri.
     */
    public String getUri() {
        return uri;
    }
    /**
     * @param uri The uri to set.
     */
    public void setUri(String uri) {
        this.uri = uri;
    }
    /** 
     *(non-Javadoc)
     * @see java.lang.Object#toString()
     * 
     */
    @ Override
    public String toString() {
        return "AuthRequest [uri=" + uri + ", clientId=" + clientId + ", terminalToken=" + terminalToken
            + ", userToken=" + userToken + "]";
    }
    
    
    
}
