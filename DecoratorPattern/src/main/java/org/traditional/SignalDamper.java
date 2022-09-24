package org.traditional;

public class SignalDamper extends SignalTransformer {

public SignalDamper(){}

public SignalDamper (SignalTransformer next){
	super(next);
}
@Override
public Signal transform(Signal signal) {
	return super.transform(new Signal (signal.getMagnitude() -1));
}
}
