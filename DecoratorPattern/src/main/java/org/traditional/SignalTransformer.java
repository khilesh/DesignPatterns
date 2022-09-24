package org.traditional;

public abstract class SignalTransformer {

private SignalTransformer next;

public SignalTransformer() {
}

public SignalTransformer(SignalTransformer nextTransformer) {
	next = nextTransformer;
}
public Signal transform(Signal signal) {
	if (next != null) {
		return next.transform(signal);
	}
	return signal;
}
}
