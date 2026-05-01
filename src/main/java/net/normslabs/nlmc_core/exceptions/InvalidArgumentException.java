/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 17:11
 */

package net.normslabs.nlmc_core.exceptions;

/**
 *
 * TODO: complete documentation
 *
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-04-30 17:11
 */
public class InvalidArgumentException extends Exception {
    private String parameterName;
    
    public InvalidArgumentException(String parameterName) {
        super();
        this.parameterName = parameterName;
    }
    
    public InvalidArgumentException(String parameterName, String message) {
        super(message);
        this.parameterName = parameterName;
    }
    
    public InvalidArgumentException(String parameterName, String message, Throwable previous) {
        super(message, previous);
        this.parameterName = parameterName;
    }
    
    public String getParameterName() {
        return this.parameterName;
    }
    
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
}