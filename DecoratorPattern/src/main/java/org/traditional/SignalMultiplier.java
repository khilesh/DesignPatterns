package org.traditional;

public class SignalMultiplier extends SignalTransformer {

private int factor;

public SignalMultiplier() {
}

public SignalMultiplier(int multiplicationFactor) {
	factor = multiplicationFactor;
}

public SignalMultiplier(int multiplicationFactor, SignalTransformer next) {
	super(next);
	factor = multiplicationFactor;
}

@Override
public Signal transform(Signal signal) {
	return super.transform(new Signal(signal.getMagnitude() * factor));
}
}
