package org.traditional;

public class SignalAugmenter extends SignalTransformer {

public SignalAugmenter() {
}

public SignalAugmenter(SignalTransformer next) {
	super(next);
}

public Signal transform(Signal signal) {
	
	return super.transform(new Signal(signal.getMagnitude() + 1));
	
}

}
