package net.ysh.nemoo.exception;

import net.ysh.core.YshErrorObject;
import net.ysh.exception.YshCoreException;

public class BajoSeamlessException extends YshCoreException {

	private static final long serialVersionUID = -7757519027708066571L;

	// TODO: check documentation
	public static final BajoSeamlessException ERROR_INSUFFICIENT_FUND = new BajoSeamlessException(100);

	public BajoSeamlessException(YshErrorObject errorObject) {
		super(errorObject);
	}

	public BajoSeamlessException(int errorId, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(errorId, message, cause, enableSuppression, writableStackTrace);
	}

	public BajoSeamlessException(int errorId, String message, Throwable cause) {
		super(errorId, message, cause);
	}

	public BajoSeamlessException(int errorId, String message) {
		super(errorId, message);
	}

	public BajoSeamlessException(int errorId, Throwable cause) {
		super(errorId, cause);
	}

	public BajoSeamlessException(int errorId) {
		super(errorId);
	}
}
