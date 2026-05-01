/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 04:51
 */

package net.normslabs.nlmc_core.exceptions;


public class RegistrationValidationException extends Exception {
    public RegistrationValidationException(String message) {
        super(message);
    }
    
    public RegistrationValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
