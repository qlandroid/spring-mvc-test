package com.ql.mvc.inter;

public interface Callback {
	void onSuccess(byte[] request);
	void onError(Exception e);
}
