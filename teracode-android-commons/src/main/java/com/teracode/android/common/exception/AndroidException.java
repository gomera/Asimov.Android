package com.teracode.android.common.exception;

/**
 * @author Luciano Rey
 */
@SuppressWarnings("serial")
public abstract class AndroidException extends RuntimeException {

	/**
	 * Constructor
	 */
	public AndroidException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AndroidException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public AndroidException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AndroidException(Throwable cause) {
		super(cause);
	}
}